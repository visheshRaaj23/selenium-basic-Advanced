package string_programs;

import java.util.Scanner;
// To Check whether given string is palindrome or not?
public class Demo_A7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word to check whether is it palindrome or not??");
		String original=sc.nextLine();
		sc.close();
		String reverse="";
		int length=original.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
			
		}
		System.out.println(reverse);
		if(original.equals(reverse)) {
			System.out.println("The given word is palindrome"+":"+original);
		}
		else {
			System.out.println("The given string is not a palindrome");
		}

	}

}
