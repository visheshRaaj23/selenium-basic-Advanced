package string_programs;

public class Demo_A16 {

	public static void main(String[] args) {
		String str=new String("Welcome to KSRTC");
		String str1=str.intern();
		String str2="Welcome to KSRTC";
		if(str1==str2) {
			System.out.println("S2 and S3 are pointing to same object");
		}
		else {
			System.out.println("s2 nd s3 pointing to different object");
		}

	}

}
