package com.g1.hib.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.g1.hib.dto.PersonDTO;

public class PersonDAO 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);

		PersonDTO jeevan=new PersonDTO();
		//jeevan.setPid(1);
		System.out.println("Enter the name ");
		String s1=s.next();
		jeevan.setName(s1);
		System.out.println("Enter the gender");
		s1=s.next();
		jeevan.setGender(s1);
		System.out.println("Enter the Blood Group");
		s1=s.next();
		jeevan.setBloodgroup(s1);
		//component 1
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(PersonDTO.class);
		//Component 2
		SessionFactory factory=cfg.buildSessionFactory();
		//Component 3
		Session session=factory.openSession();
		//Component 1 from Component 3
		Transaction tx=session.beginTransaction();
		session.save(jeevan);
		System.out.println("Enter the Id details want to retrieve");
		int i=s.nextInt();
		PersonDTO fromDB=session.load(PersonDTO.class,i);
		System.out.println(fromDB.getPid());
		System.out.println(fromDB.getName());
		System.out.println(fromDB.getGender());
		System.out.println(fromDB.getBloodgroup());
		System.out.println("Do you wanna update? if Yes press 'y' or press any key");
		s1=s.next();
		if(s1.equalsIgnoreCase("y")){
			System.out.println("Enter the name ");
			s1=s.next();
			fromDB.setName(s1);
			System.out.println("Enter the gender");
			s1=s.next();
			fromDB.setGender(s1);
			System.out.println("Enter the Blood Group");
			s1=s.next();
			fromDB.setBloodgroup(s1);
			session.update(fromDB);
		}
		tx.commit();
		session.close();
		//temp for standalone
		factory.close();
		s.close();
	}
}
