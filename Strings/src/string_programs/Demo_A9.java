package string_programs;

public class Demo_A9 {

	public static void main(String[] args) {
		String str="Volvo Buses India Ltd";
		int count=0;
		int m=str.length();
		char arr[]=new char[m];
		for(int i=m-1;i>=0;i--) {
			
			arr[i]=str.charAt(i);
			
		}
		System.out.println("Default String "+str);
		for(int i=m-1;i>=0;i--) {
			System.out.println(arr[i]);
			count++;
		}
		System.out.println(count);

	}

}
