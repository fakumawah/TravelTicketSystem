/**
 * 
 */
package com.hexa.tts.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.hexa.tts.annotation.Phone;

/**
 * @author fruaku
 * @date 07.09.2014 15:08:02
 */
public class PhoneValidator implements ConstraintValidator<Phone, String>
{
  
	public void initialize(Phone paramA)
	{
	}

	public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext)
	{
		if (phoneNumber == null)
		{
			return false;
		}
		// validate phone numbers of format "1234567890"
		if (phoneNumber.matches("\\d{10}"))
			return true;
		// validating phone number with -, . or spaces
		else if (phoneNumber.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))
			return true;
		// validating phone number with extension length from 3 to 5
		else if (phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}"))
			return true;
		// validating phone number where area code is in braces ()
		else if (phoneNumber.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}"))
			return true;
		// return false if nothing matches the input
		else
			return false;
	}
}
