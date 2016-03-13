package com.G1.Java.Eg1.Person;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonController {

	public static void main(String[] args) {
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
		try{
			PersonDTO pdto=new PersonDTO();
			PersonDAO pdao=new PersonDAO();
			//pdto=pdao.add(pdto);
			//session.save(pdto);
			pdto=pdao.update(pdto, session, tx);
			session.update(pdto);
			//pdto=pdao.delete(pdto, session, tx);
			//session.delete(pdto);
			//session.flush();
			tx.commit();
		}
		catch(HibernateException e){
			e.printStackTrace();
			tx.rollback();
		}
		finally{
			session.close();
			factory.close();

		}


	}
}
