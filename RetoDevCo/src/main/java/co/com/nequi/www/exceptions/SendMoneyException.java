package co.com.nequi.www.exceptions;

import org.openqa.selenium.NoSuchElementException;

public class SendMoneyException extends NoSuchElementException{

	public static final String NO_SUCH_ELEMENT_EXCEPTION = "The element does not exist";
	
	public SendMoneyException(String message, Throwable testErrorException) {
		super(message, testErrorException);
	}

}
