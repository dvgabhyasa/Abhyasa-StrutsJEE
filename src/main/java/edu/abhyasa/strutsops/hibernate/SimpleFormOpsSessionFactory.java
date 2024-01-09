package edu.abhyasa.strutsops.hibernate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.abhyasa.strutsops.models.SimpleFormOpsModel;

public class SimpleFormOpsSessionFactory {

	final static Logger logger = LogManager.getLogger(SimpleFormOpsSessionFactory.class);

	public static void saveFormOpsModel() {
		logger.info("Inside SimpleFormOpsSessionFactory");
		
		// Using block : Solve[ Syntax Error On Token ",", { Expected After This Token ]
		// Ref:https://javahungry.blogspot.com/2022/04/syntax-error-on-token-expected-after-this-token.html
		Session session = buildSession();
		
		SimpleFormOpsModel simpleFormOpsModel = new SimpleFormOpsModel();
		
		try {			
			Transaction tx = session.beginTransaction();
				session.persist(simpleFormOpsModel);
			logger.info("Table transaction saved Successfully");
			tx.commit();
		} catch (Exception e) {
			System.out.println("In Exception region");
			e.printStackTrace();
		} finally {
			session.clear();
			session.close();
		}

	}

	/**
	 * Save function for FormOpsModel from Action class
	 * @param simpleFormOpsModel
	 */
	public static void saveFormOpsModel(SimpleFormOpsModel simpleFormOpsModel) {
		logger.info("Saving Form Model in Database");
		Session session = buildSession();
		Transaction tx = session.beginTransaction();
		session.save(simpleFormOpsModel);
		tx.commit();
	}

	/**
	 * [Process] Session object
	 * @return
	 */
	private static Session buildSession() {
		logger.info("Inside Building Session");
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	}

}