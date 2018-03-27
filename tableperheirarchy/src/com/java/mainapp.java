package com.java;

import org.hibernate.*;  
import org.hibernate.cfg.*;  
  
public class mainapp {  
public static void main(String[] args) {  
	System.out.println("welcome");
    Session session=new Configuration().configure("hibernate.cfg.xml")  
                        .buildSessionFactory().openSession();  
  
    Transaction t=session.beginTransaction();  
      
    employee e1=new employee();  
    e1.setName("sonoo");  
      
    regemployee e2=new regemployee();  
    e2.setName("Vivek Kumar");  
    e2.setSalary(50000);  
    e2.setBonus(5);  
      
    conemployee e3=new conemployee();  
    e3.setName("Arjun Kumar");  
    e3.setPay_per_hour(1000);  
    e3.setContarct_duration("15 hours");  
      
    session.persist(e1);  
    session.persist(e2);  
    session.persist(e3);  
      
    t.commit();  
    session.close();  
    System.out.println("success");  
}  
} 