package com.kingkong.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author kiran
 */
public class DatabaseAccessObject {
 
 public static boolean addEmployee(String firstname,String lastname,int age,String hobby,String favourite){
     int membrId=0;
     
             /* TblMembers member=new TblMembers(firstname, lastname, age, hobby, favourite);

     SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(member);
        session.getTransaction().commit();
     */
     Session session=HibernateUtil.getSessionFactory().openSession();
     Transaction tx=null;
     
     try {
         tx=session.beginTransaction();
        
         TblMembers member=new TblMembers(firstname, lastname, age, hobby, favourite);
         membrId=(Integer) session.save(member);
         tx.commit();
         
         ///---here id of member is added automatically
     } catch (Exception e) {
         System.out.println(e);
         if(tx!=null){
         tx.rollback();}
     }finally{
         session.close();
     }
     return membrId>0; //--it means employee add is success
}   
 
 public static List<TblMembers> getMemberDetails(int membrId){
     List<TblMembers> members=null;
     Session session=HibernateUtil.getSessionFactory().openSession();
     Transaction tx=null;
     try {
         tx=session.beginTransaction();
         Criteria cr=session.createCriteria(TblMembers.class);
         cr.add(Restrictions.eq("id", membrId));
         members=cr.list();
                 tx.commit();
     } catch (Exception e) {
         System.out.println(e);
         if(tx!=null){
             tx.rollback();
         }
     }finally{
         session.close();
     }
     return members;
 }
    
}
