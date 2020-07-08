package string_programs;

public class Demo_A3 {

	public static void main(String[] args) {
		String s1="RajaRamMohanRoy";
		System.out.println(s1.charAt(3));
		System.out.println(s1.endsWith("Roy"));
		System.out.println(s1.indexOf("R"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.lastIndexOf("R"));
		System.out.println(s1.contains("ram"));
		System.out.println(s1.contains("Gunda"));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4,10));
	}

}
