/**
 * 
 */
package com.hexa.tts.dao;

import com.hexa.tts.entities.Trip;

/**
 * @author fruaku
 * @date 03.10.2014 21:14:57
 */
public interface ITripDao extends IBaseDao<Trip, Long>
{
void findByName(String name);
}