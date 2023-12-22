package edu.abhyasa.strutsops.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.abhyasa.strutsops.models.SimpleFormOpsModel;

public class SimpleFormOpsSessionFactory {
	
	SimpleFormOpsModel simpleFormOpsModel;

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save(simpleFormOpsModel);
	session.getTransaction().commit();
}
