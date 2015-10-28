/**
 * 
 */
package com.hexa.tts.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * @author fruaku
 * @date 14.09.2014 20:36:28
 */
@Documented
@Qualifier
@Target({ ElementType.METHOD, 
  ElementType.FIELD, 
  ElementType.ANNOTATION_TYPE,
  ElementType.CONSTRUCTOR, 
  ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface LoggedIn {}