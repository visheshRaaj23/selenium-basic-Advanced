package string_programs;
//WAP to print String in String format and array format


public class Demo_A8 {

	public static void main(String[] args) {
		
		String str="Volvo Buses";
		int count=0;
		int m=str.length();
		char[] arr=new char[m];
		for(int i=0;i<=m-1;i++) {
			arr[i]=str.charAt(i);
			
		}
		System.out.println("String format is"+str);
		for(int i=0;i<=m-1;i++) {
			System.out.println(arr[i]);
			count++;
		}
		System.out.println(count);
	}

}
