package com.project.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static Configuration cfg;
	private static SessionFactory factory;
	private static Session session;
	
	static
	{
		 cfg=new Configuration().configure();
		 factory=cfg.buildSessionFactory();
		 session =factory.openSession();
	}
	
	public static Session getSessionObject()
	{
		return session;
	}

}
