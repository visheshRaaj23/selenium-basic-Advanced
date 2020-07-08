package string_programs;
//Write a java program to compare the 2 strings
public class Demo_A4 {

	public static void main(String[] args) {
		String s1="yuvi";
		String s2="yuva";
		int m = s1.compareTo(s2);
		System.out.println(m);
		if(m==0) {
			System.out.println("s1=s2");
		}
		else if(m>0) {
			System.out.println("s1>s2");
		}
		else {
			System.out.println("s1<s2");
		}

	}

}
