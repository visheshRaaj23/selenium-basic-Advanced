package exceptionHandling;

import java.util.Scanner;

public class Demo_A7aATM {

	private long accountNumber= 223322;
	private long password = 910455;
	public long accN;
	public long pw;
	public void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the account number");
		accN=scan.nextLong();
		System.out.println("Enter the password");
		pw=scan.nextLong();
	
	}
	public void verify() throws Exception {
		
		if((accountNumber==accN) &&(password==pw)) {
			System.out.println("Welcome to Home Page");
			System.out.println("Click here to collect your Money");
		}else {
			InvalidCustomerException except=new InvalidCustomerException();
			except.getMessage();
			
		}
	}
	
}
