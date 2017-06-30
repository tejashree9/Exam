package com.cts.bankmanagement.exception;

public class BankManagementException extends Exception {

	private String errorkey;

	private static final long serialVersionUID = 1L;

	public BankManagementException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public BankManagementException(String arg) {
		super(arg);
	}

	public BankManagementException(Throwable cause) {
		super(cause);
	}

	public BankManagementException(String errorkey, String message,
			Throwable cause) {
		super(message, cause);
		this.errorkey = errorkey;
	}

	public BankManagementException(String errorkey, String message) {
		super(message);
		this.errorkey = errorkey;
	}

	public BankManagementException() {
		super();
	}

	public String getErrorkey() {
		return errorkey;
	}

	public void setErrorkey(String errorkey) {
		this.errorkey = errorkey;
	}
}
