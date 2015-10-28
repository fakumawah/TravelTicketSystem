/**
 * 
 */
package com.hexa.tts.dao.impl;

import javax.annotation.PostConstruct;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.hexa.tts.dao.IBaseDao;
import com.hexa.tts.entities.Person;
import com.hexa.tts.exceptions.DataAccessLayerException;
import com.hexa.tts.util.HibernateUtil;
import com.hexa.tts.util.SessionWrapper;

/**
 * @author fruaku
 * @date 05.09.2014 20:19:50
 */
@Transactional   // TODO take out transaction declarations in code
public class BaseDao<T> implements IBaseDao<T,Long>
{
	
	private Session session;
	
	private Transaction trans;
	
	@Autowired
	private SessionWrapper sessionWrapper;
	
	@PostConstruct
	private void init(){
		session = sessionWrapper.getSession();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hexa.tts.dao.IBaseDao#saveOrUpdate(T)
	 */
	@Override
	public void saveOrUpdate(T t)
	{
		try
		{
			startTransaction();
			session.saveOrUpdate(t);
			closeTransaction();
		}
		catch (HibernateException e)
		{
			handleException(e);
		}
		finally
		{
			closeSession();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hexa.tts.dao.IBaseDao#update(T)
	 */
	@SuppressWarnings("unchecked")  // Todo check
	@Override
	public <S extends T> S update(S s)
	{
		S returnObject = null;
		try
		{
			startTransaction();
			returnObject = (S) session.merge(s);
			closeTransaction();
		}
		catch (HibernateException e)
		{
			handleException(e);
		}
		finally
		{
			closeSession();
		}
		return returnObject;
	}

	/**
	 * 
	 * @throws HibernateException
	 */
	protected void startTransaction() throws HibernateException
	{
		trans = session.beginTransaction();
	}
	
	/**
	 * 
	 * @throws HibernateException
	 */
	protected void closeTransaction() throws HibernateException{
		trans.commit();
	}

	/**
	 * 
	 * @param e
	 * @throws DataAccessLayerException
	 */
	protected void handleException(HibernateException e)
			throws DataAccessLayerException
	{
		HibernateUtil.rollback(trans);
		throw new DataAccessLayerException(e);
	}

	/* (non-Javadoc)
	 * @see com.hexa.tts.dao.IBaseDao#findOne(java.io.Serializable)
	 */
	@Override
	public T findOne(Long id)
	{
		try
		{
			startTransaction();
			//session.get(, id);
			trans.commit();
		}
		catch (HibernateException e)
		{
			handleException(e);
		}
		finally
		{
			closeSession();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.hexa.tts.dao.IBaseDao#delete(java.lang.Object)
	 */
	@Override
	public void delete(T t)
	{
		try
		{
			startTransaction();
			session.delete(t);
			closeTransaction();
		}
		catch (HibernateException e)
		{
			handleException(e);
		}
		finally
		{
			closeSession();
		}
	}

	protected void closeSession(){
		sessionWrapper.close(session);
	}
	
	/**
	 * @return the session
	 */
	public Session getSession()
	{
		return session;
	}
}
