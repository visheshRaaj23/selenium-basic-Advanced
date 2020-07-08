package string_programs;

public class Demo_A2 {

	public static void main(String[] args) {
		String s1,s2;
		s1="rama"+"sita";
		s2="rama"+"sita";
		System.out.println(s1);
		System.out.println(s2);
		if(s1==s2) {
			System.out.println("Both are pointing to same object");
		}
		else {
			System.out.println("Both are not pointing to same object");
		}
		String s3,s4,s5,s6;
		s3="rama";
		s4="sita";
		s5=s3+s4;
		s6=s3+s4;
		if(s5==s6) {
			System.out.println("Both are pointing to same object");
		}
		else {
			System.out.println("Both are not pointing to same object");
		}

	}

}
