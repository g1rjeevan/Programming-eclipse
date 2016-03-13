package com.om.hib.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.om.hib.dto.MovieDTO;
import com.om.hibernate.SessionFactoryUtil;

public class MovieDAO {

	public void save(MovieDTO dto) {

		Session session = SessionFactoryUtil.getFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			// operations
			session.save(dto);
			tx.commit();
		} catch (HibernateException he) {
			he.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}

	}

	public void fetch() {
		// step 1 prepare
		Session session = SessionFactoryUtil.getFactory().openSession();
		String hql = "from MovieDTO where lang='Kannada'";
		try {
			Query query = session.createQuery(hql);
			// step 2 process
			// Integer value = (Integer) query.uniqueResult();
			MovieDTO dto = (MovieDTO) query.uniqueResult();
			System.out
					.println("Name \t" + dto.getName() + "\t" + dto.getLang());
		} finally {
			session.close();
		}

	}

	public void delete(String moviename) {

	}

	public void update(String lang, String movieName) {

	}
}
