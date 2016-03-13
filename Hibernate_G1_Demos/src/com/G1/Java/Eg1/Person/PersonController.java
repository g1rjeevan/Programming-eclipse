package com.G1.Java.Eg1.Person;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonController {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		PersonDTO pdto=new PersonDTO();
		//Component 1
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(PersonDTO.class);
		//component 2
		SessionFactory factory=cfg.buildSessionFactory();
		//component 3
		Session session = factory.openSession();

		//component 1 from component 3
		Transaction tx=session.beginTransaction();
		System.out.println("Enter the person name");
		String pName=scan.next();
		System.out.println("Enter the gender Male or Female");
		String pGen=scan.next();
		char pGene[]=pGen.toCharArray();
		char pGender=pGene[0];
		System.out.println("Enter the Bloodgroup");
		String pBloodGroup=scan.next();
		System.out.println("Enter the person age");
		int pAge=scan.nextInt();
		System.out.println("Enter the person relationship status");
		String pStatus=scan.next();

		pdto.setpName(pName);
		pdto.setpGender(pGender);
		pdto.setpBloodGroup(pBloodGroup);
		pdto.setpAge(pAge);
		pdto.setpStatus(pStatus);
		session.save(pdto);
		tx.commit();
		session.close();
		factory.close();
		scan.close();

	}
	

}
