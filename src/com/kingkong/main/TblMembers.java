package com.kingkong.main;


// Generated Jul 24, 2018 4:12:26 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TblMembers generated by hbm2java
 */
@Entity
@Table(name="tbl_members"
    ,catalog="user"
)
public class TblMembers  implements java.io.Serializable {


     private Integer id;
     private String firstname;
     private String lastname;
     private int age;
     private String hobby;
     private String favourite;

    public TblMembers() {
    }

    public TblMembers(String firstname, String lastname, int age, String hobby, String favourite) {
       this.firstname = firstname;
       this.lastname = lastname;
       this.age = age;
       this.hobby = hobby;
       this.favourite = favourite;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="firstname", nullable=false)
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    
    @Column(name="lastname", nullable=false)
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
    @Column(name="age", nullable=false)
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    
    @Column(name="hobby", nullable=false)
    public String getHobby() {
        return this.hobby;
    }
    
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    
    @Column(name="favourite", nullable=false)
    public String getFavourite() {
        return this.favourite;
    }
    
    public void setFavourite(String favourite) {
        this.favourite = favourite;
    }




}


