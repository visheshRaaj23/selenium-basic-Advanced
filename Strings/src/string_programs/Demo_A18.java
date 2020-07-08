package string_programs;

import java.util.Scanner;

public class Demo_A18 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Name of the Bus to check the popularity in particular route");
		String busName = scan.nextLine();
		
		switch(busName) {
		
		case "National_Travels":{
			System.out.println("Most popular route for National travels is Hyderabad");
			break;
		}
		case "VRL Travels":{
			System.out.println("Most popular route for VRL travels is Mumbai, Belgavi,Hubli");
			break;
		}
		case "KPN Travels":{
			System.out.println("Most popular route for KPN travels is Chennai, Trivandrum");
			break;
		}
		default:{
			System.out.println("Invalid operaator");
			break;
		}
		}

	}

}
