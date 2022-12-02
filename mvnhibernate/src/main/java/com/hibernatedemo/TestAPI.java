package com.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestAPI {

	public static void main(String[] args) {

		System.out.println("Project Started !!!");
		
		EntityEmployee emp1=new EntityEmployee(10,"Ram","Pune");
		EntityEmployee emp2=new EntityEmployee(20,"Sham","Kop");
		EntityEmployee emp3=new EntityEmployee(30,"Shree","Mumbai");
		EntityEmployee emp4=new EntityEmployee(40,"ABC","Mumbai");
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		
		t.commit();
		
		session.close();
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		System.out.println("Project Ended !!!");
		
	}

}
