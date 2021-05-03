package fastcampuswork.exception;

class AuthException extends RuntimeException{
	public AuthException(String message) {
		super(message);
	}
}

class IdNotRegisteredException extends AuthException{
	public IdNotRegisteredException(String message) {
		super(message);
	}
}

class PasswordMisMatchedException extends AuthException{
	public PasswordMisMatchedException(String message) {
		super(message);
	}
}

class PasswordExpiredException extends AuthException{
	public PasswordExpiredException(String message) {
		super(message);
	}
}

class IdLengthOverException extends AuthException{
	public IdLengthOverException(String message) {
		super(message);
	}
}


public class AuthExceptionTest{
	public static void main(String args[]) {
		throw new AuthException("AuthException");
	}
	
}
