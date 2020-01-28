package com.automationpractice.www.exceptions;

import org.openqa.selenium.NoSuchElementException;

public class FillOutTheSignInFormException extends NoSuchElementException{

	public static final String NO_SUCH_ELEMENT_EXCEPTION = "The element does not exist";
	
	public FillOutTheSignInFormException(String message, Throwable testErrorException) {
		super(message, testErrorException);
	}

}
