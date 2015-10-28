/**
 * 
 */
package com.hexa.tts.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hexa.tts.entities.Person;

/**
 * @author fruaku
 *
 */
public abstract class SuperDao
{
	/* */
	private SessionFactory sessionFactory;

	/**
	 * 
	 * @return
	 */
	public SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}

	/**
	 * 
	 * @param sessionFactory
	 */
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	/**
	 * 
	 * @param <T>
	 * @param person
	 */
	public <T> void insert(T t)
	{
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
	}
	
	/**
	 * 
	 * @param <T>
	 * @return
	 */
	public <T> List<T> selectAll()
	{
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Person.class);
		List<T> persistedObjectList = (List<T>) criteria.list();
		session.getTransaction().commit();
		return persistedObjectList;
	}
}
