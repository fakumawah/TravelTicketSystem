/**
 * 
 */
package com.hexa.tts.util;

import javax.annotation.PostConstruct;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author fruaku
 * @date 14.02.2015 14:08:57
 */
public class SessionWrapper
{
	@Autowired
	private SessionFactory sessionFactory;

	private static Session session;

	@PostConstruct
	private void init(){
		session = createOrRetrieveSession();
	}
	
	private Session createOrRetrieveSession()
	{
		if (session == null || (session != null && !session.isOpen()))
		{
			session = sessionFactory.openSession(); // HibernateUtil.openSession();
		}
		else
		{
			session = sessionFactory.getCurrentSession();
		}
		return session;
	}
	
	/**
	 * 
	 * @param session
	 */
	public void close(Session session) {
		if (session != null) {
			try {
				session.close();
			} catch (HibernateException ignored) {
				//log.error("Couldn't close Session", ignored);
			}
		}
	}

	public Session getSession()
	{
		return session;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
}
