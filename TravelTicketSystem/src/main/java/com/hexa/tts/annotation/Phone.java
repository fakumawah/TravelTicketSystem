package com.hexa.tts.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.hexa.tts.validator.PhoneValidator;

/**
 * @author fruaku
 * @date 07.09.2014 15:10:57
 */
@Documented
@Constraint(validatedBy = PhoneValidator.class)
@Target({ ElementType.METHOD, 
          ElementType.FIELD, 
          ElementType.ANNOTATION_TYPE,
          ElementType.CONSTRUCTOR, 
          ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone
{
	String message() default "{invalid.Phone}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
