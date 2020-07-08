package exceptionHandling;

public class InvalidCustomerException extends Exception {
	
	public String getMessage() {
		
		return "Invalid Cridentials!! Try Again After Sometime!!";
		
		
	}

}
