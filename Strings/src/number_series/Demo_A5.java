package number_series;

import java.util.Scanner;

public class Demo_A5 {

	
	//To check whether number is even or not
	
	public static void main(String[] args) throws InterruptedException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		Thread.sleep(1000);
		if(number%2==0) {
			System.out.println("Number is even:"+" "+number);
			
		}
		else {
			System.out.println("Number is odd"+" "+number);
		}

	}

}
