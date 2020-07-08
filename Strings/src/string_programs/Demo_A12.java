package string_programs;

import java.io.IOException;
import java.util.Scanner;

//Java Program to accept character as input and count the frequency of the character in given string


public class Demo_A12 {

	public static void main(String[] args) throws IOException {
		String input;
		int count=0;
		char k;
		Scanner sc=new Scanner(System.in);
		input=sc.nextLine();
		char arr[]=input.toCharArray();
		int m=input.length();
System.out.println("Enter the Key");
k=(char)System.in.read();
for(int i=0;i<=m-1;i++) {
	if(arr[i]==k) {
		count++;
	}
}
System.out.println(count);
	}
	

}
