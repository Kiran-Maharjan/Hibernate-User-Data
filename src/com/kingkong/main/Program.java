package com.kingkong.main;


import com.kingkong.main.DatabaseAccessObject;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author kiran
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//
//        if(DatabaseAccessObject.addEmployee("Bobby", "Maharjan", 24, "Bike", "fight")){
//            System.out.println("Employee Added Successfully");
//        }else{
//            System.out.println("Fatal error occured!!");
//        }

    for(int i=1;i<=4;i++){
    int membrId=i;
        List<TblMembers> members=DatabaseAccessObject.getMemberDetails(membrId);
        for(TblMembers m:members){
            System.out.println(m.getId()+"  "+m.getFirstname()+"  "+m.getLastname()+"  "+m.getHobby()+"   "+m.getFavourite());
        }
        
    }
    }
}
