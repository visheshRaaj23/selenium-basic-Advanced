package string_programs;

public class Demo_A17 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Rama");
		str.append("Sita");
		System.out.println(str);
		System.out.println(str.capacity());
		str.append("travel to Ayodhya in Volvo 9400XL Bus with 10 degrees AC");
		System.out.println(str);
		System.out.println(str.capacity());
		System.out.println(str.length());
		
		StringBuilder sbd=new StringBuilder("Volvo");
		sbd.append("Scania");
		System.out.println(sbd);
		
		StringBuffer str1=new StringBuffer();
		System.out.println(str1.capacity());
		System.out.println(str1.length());
		
		str1.append("Hi Vishesh");
		System.out.println(str1.capacity());
		System.out.println(str1.length());
		
		
		str1.append("How are You??");
		System.out.println(str1.capacity());
		System.out.println(str1.length());
		
		str1.append("How is your bike");
		System.out.println(str1.capacity());
		System.out.println(str1.length());
		
		

	}

}
