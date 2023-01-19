package com.hibernate.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyApi {

	public static void main(String[] args) {
		System.out.println("******end******");
		
		Address adr1= new Address(416120, "Kop");
		Address adr2= new Address(423654, "Pune");
		Address adr3= new Address(416146, "Ich");
		
		List<Address> adrList= new ArrayList();
				adrList.add(adr1);
				adrList.add(adr2);
				adrList.add(adr3);	
				
		Employee emp= new Employee(1,"Priya",adrList);
		
		SessionFactory fct= new Configuration().configure().buildSessionFactory();
		Session ss= fct.openSession();
		Transaction ts= ss.beginTransaction();
			ss.save(adr1);
			ss.save(adr2);
			ss.save(adr3);
			ss.save(emp);
			 ts.commit();
			 ss.close();
		System.out.println("******end******");
	}

}
