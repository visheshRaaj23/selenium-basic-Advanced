package string_programs;

import java.util.Scanner;

public class Demo_A14 {

	//To count the number of vowels in a given string
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String input=scan.nextLine();
		scan.close();
		char arr[]=input.toCharArray();
		int count=0;
		int m=input.length();
		for(int i=0;i<=m-1;i++) {
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='U'||arr[i]=='O') {
				count++;
			}
		}
		System.out.println(count);

	}

}
