package string_programs;

import java.io.IOException;
import java.util.Scanner;

//WAP to determine the frequency of a particular character in given string

public class Demo_A13 {

	public static void main(String[] args) throws IOException {
		int count=0;
		char k;
		String input;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		input= scan.nextLine();
		//scan.close();
		char arr[]=input.toCharArray();
		int m=input.length();
		System.out.println("Enter the Specific Character");
		k=(char)System.in.read();
		for(int i=0;i<=m-1;i++) {
			
			if(arr[i]==k) {
				count++;
			}
			
		}
		System.out.println(count);
		
		

	}

}
