package com.om.hib.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.om.hib.dto.PersonDTO;

public class PersonDAO {

	public static void main(String[] args) {

		PersonDTO basavaraj = new PersonDTO();
		// pk
		basavaraj.setPid(1);
		basavaraj.setName("Basavaraj");
		basavaraj.setBloodGroup("A+");
		basavaraj.setGender('M');

		// data into DB
		// component 1
		Configuration cfg = new Configuration();
		cfg.configure("Mysql.cfg.xml");
		cfg.addAnnotatedClass(PersonDTO.class);
		// component 2
		SessionFactory factory = cfg.buildSessionFactory();
		// component 3
		Session session = factory.openSession();
		// component 1 from component 3
		Transaction tx = session.beginTransaction();
		session.save(basavaraj);
		tx.commit();
		session.close();
		// temp for standalone
		factory.close();

	}

}
