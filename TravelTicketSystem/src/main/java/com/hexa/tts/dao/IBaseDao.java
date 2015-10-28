/**
 * 
 */
package com.hexa.tts.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

/**
 * @author fruaku
 * @date 03.10.2014 20:02:35
 * @param <T>
 */
public interface IBaseDao<T, ID extends Serializable>
{
	T findOne(ID id);
	
	void saveOrUpdate(T t);

	<S extends T> S update(S s);

	/**
	 * Deletes a given entity.
	 * 
	 * @param entity
	 * @throws IllegalArgumentException in case the given entity is (@literal null}.
	 */
	void delete(T t);
}