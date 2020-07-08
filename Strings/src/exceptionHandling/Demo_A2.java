package exceptionHandling;

import java.util.Scanner;

public class Demo_A2 {

	public static void main(String[] args) {
	
		try {
		Scanner sc_a=new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a=sc_a.nextInt();
		Scanner sc_b=new Scanner(System.in);
		System.out.println("Enter the value of b");
		int b=sc_b.nextInt();
		int c = a/b;
		System.out.println(c);
		System.out.println("Hi");
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Please provide non zero denominator");
		}
		System.out.println("Connection is terminated");
		

	}

}

//Enter the value of a 
//20
//Enter the value of b
//0
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at exceptionHandling.Demo_A2.main(Demo_A2.java:15)

