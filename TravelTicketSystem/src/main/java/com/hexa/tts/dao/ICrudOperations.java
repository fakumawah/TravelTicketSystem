/**
 * 
 */
package com.hexa.tts.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author fruaku
 * @date 09.02.2015 12:58:28
 */
@NoRepositoryBean
public interface ICrudOperations<T> extends CrudRepository<T, Long>
{

}
