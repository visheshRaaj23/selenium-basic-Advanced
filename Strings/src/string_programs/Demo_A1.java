package string_programs;

public class Demo_A1 {

	public static void main(String[] args) {
		String s1="Rama";
		String s2="Rama";
		System.out.println(s1);
		System.out.println(s2);
		if(s1.equals(s2)) {
			System.out.println("s1 and s2 are pointing to same object");
		}
		else {
			System.out.println("S1 and S2 are not pointing to a same object");
		}
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		String s3=new String("BMW");
		String s4=new String("bmw");
		System.out.println(s3);
		System.out.println(s4);
		if(s3.equals(s4)) {
			System.out.println("s3 and s4 are pointing to same object");
		}
		else {
			System.out.println("s3 and s4 are pointing to different object");
		}
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

	}
	
	

}
