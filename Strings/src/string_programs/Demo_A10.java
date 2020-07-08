package string_programs;
//WAP to read a sentence from keyboard and reverse every word in a given sentence.
//Count the number of words
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo_A10 {

	public static void main(String[] args) {
	
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		sc.close();
		StringTokenizer stk=new StringTokenizer(str," ");
		while(stk.hasMoreElements()) {
			String token = stk.nextToken();
			int m=str.length();
			char[] arr=new char[m];
			System.out.println(m);
			for(int i=m-1;i>=0;i--) {
				arr[i]=str.charAt(i);
				System.out.println(arr[i]);
				System.out.println(count++);
			}
			System.out.println(count);
		}
		

	}

}
