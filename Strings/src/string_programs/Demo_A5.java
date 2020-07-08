package string_programs;

public class Demo_A5 {

	public static void main(String[] args) {
		String s1="RAMA";
		String s2="rama";
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1=s2");
		}
		else {
			System.out.println("s1!=s2");
		}
	}

}
