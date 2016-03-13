package com.om.hib.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.om.hib.dto.FileDTO;
import com.om.hibernate.SessionFactoryUtil;

public class FileDAO {

	public void save(FileDTO dto) {
		SessionFactory factory = SessionFactoryUtil.getFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(dto);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();

		} finally {
			session.close();
		}

	}

	public FileDTO get(int pk) {

		SessionFactory factory = SessionFactoryUtil.getFactory();
		Session session = factory.openSession();
		try {
			return session.load(FileDTO.class, pk);
		} finally {
			session.close();
		}

	}

	public void update(int pk, String fileName) {
		// write persistence logic
	}

}
