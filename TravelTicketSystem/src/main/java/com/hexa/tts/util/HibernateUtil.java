/**
 * 
 */
package com.hexa.tts.util;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author fruaku
 * @date 07.09.2014 23:37:04
 */
public class HibernateUtil {
	
	@Autowired
	private static SessionFactory sessionFactory;
	
	// we don't need the LogFactory since we explicitly exclude this from pom-file
	//private static Log log = LogFactory.getLog(HibernateUtil.class);
	
	private static Logger log = LoggerFactory.getLogger(HibernateUtil.class);

	/**
	 * Constructs a new Singleton SessionFactory
	 * 
	 * @return
	 * @throws HibernateException
	 */
	public static SessionFactory buildSessionFactory() throws HibernateException {

		if (sessionFactory != null) {
			closeFactory(); // close and start a fresh SessionFactory
		}
		return configureSessionFactory();

	}

	/**
	 * Builds a SessionFactory, if it hasn't been already.
	 */
	public static SessionFactory buildIfNeeded() {
		
		if (sessionFactory == null || (sessionFactory.isClosed())) {
			return configureSessionFactory();
		}
		return sessionFactory;
	}

	/**
	 * 
	 * @return
	 */
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * 
	 * @return
	 * @throws HibernateException
	 */
	public static Session openSession() throws HibernateException {
		//buildIfNeeded();
		return sessionFactory.openSession();
	}

	/**
	 * 
	 */
	public static void closeFactory() {
		if (sessionFactory != null) {
			try {
				sessionFactory.close();
			} catch (HibernateException ignored) {
				log.error("Couldn't close SessionFactory", ignored);
			}
		}
	}

	/**
	 * 
	 * @param session
	 */
	public static void close(Session session) {
		if (session != null) {
			try {
				session.close();
			} catch (HibernateException ignored) {
				log.error("Couldn't close Session", ignored);
			}
		}
	}

	/**
	 * 
	 * @param tx
	 */
	public static void rollback(Transaction trans) {
		try {
			if (trans != null) {
				trans.rollback();
			}
		} catch (HibernateException ignored) {
			log.error("Couldn't rollback Transaction", ignored);
		}
	}

	/**
	 * 
	 * @return
	 * @throws HibernateException
	 */
	private static SessionFactory configureSessionFactory() throws HibernateException {
		
		if (sessionFactory == null) {
			
			// loads configuration and mappings
			Configuration configuration = new Configuration().configure();
			
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties())
					.build();

			// builds a session factory from the service registry
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}

		return sessionFactory;
	}
	
	
}