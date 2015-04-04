package io.gazelle;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class APIException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2322855752626871212L;

	String apiResponse;
	String message;

	public APIException(String message, String apiResponse) {
		super(message);
		this.message = message;
		this.apiResponse = apiResponse;
	}

	@Override
	public String toString() {
		return Pojomatic.toString(this);
	}

}
