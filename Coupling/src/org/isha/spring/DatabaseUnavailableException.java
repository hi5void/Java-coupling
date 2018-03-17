package org.isha.spring;

public class DatabaseUnavailableException extends RuntimeException {
	public DatabaseUnavailableException(Throwable error) {
		super(error);
		
	}
	public DatabaseUnavailableException() {
		super();
	}

}
