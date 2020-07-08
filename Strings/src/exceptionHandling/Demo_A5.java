package exceptionHandling;

public class Demo_A5 {

	
	//StringIndexOutOfBoundsException
	
	
	public static void main(String[] args) {
	String str="Vishesh";
		System.out.println(str.charAt(3));
		try {
			System.out.println(str.charAt(11));
			
		}
		catch(StringIndexOutOfBoundsException exc){
			System.out.println("Impossible");
		}
		finally {
			System.out.println("BMW");
		}
		

	}

}
