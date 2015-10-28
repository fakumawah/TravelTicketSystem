/**
 * 
 */
package com.hexa.tts.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;


/**
 * Annotation @Email
 * Can be uses with fields
 * @author fruaku
 * @date 07.09.2014 15:49:39
 */
@Pattern.List({ @Pattern(regexp = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
		+ "[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*"
		+ "@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?") })
@Documented
@Constraint(validatedBy = {})
@Target({ ElementType.METHOD, 
	        ElementType.FIELD, 
	        ElementType.ANNOTATION_TYPE,
		      ElementType.CONSTRUCTOR, 
		      ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface Email
{

	String message() default "{invalid.email}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE,
			ElementType.CONSTRUCTOR, ElementType.PARAMETER })
	@Retention(RetentionPolicy.RUNTIME)
	@Documented
	@interface List
	{
		Email[] value();
	}
}
