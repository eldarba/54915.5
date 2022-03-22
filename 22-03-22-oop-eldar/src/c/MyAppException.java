package c;

public class MyAppException extends Exception {

	public MyAppException() {
		super();
	}

	public MyAppException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MyAppException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyAppException(String message) {
		super(message);
	}

	public MyAppException(Throwable cause) {
		super(cause);
	}

}
