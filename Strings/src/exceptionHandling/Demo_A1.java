package exceptionHandling;

public class Demo_A1 {

	//Boxing :
	//conversion of primitive datatype into respective non primitive datatype 
	
	//unboxing:
	//conversion of non primitive datatype into primitive datatype
	
	//Wrapper class
	//it is a final class it contains all the classes for primitive datatype
	//Exceptions is due to faulty inputs given by user
	
	public static void main(String[] args) {
			
		Demo_A1.boxing();
		Demo_A1.unboxing();
		

	}
	public static void boxing(){
		int a=23;
		Integer ai=Integer.valueOf(a);
		System.out.println(a);
		System.out.println(ai);
		
	}
	public static void unboxing() {
		Integer av=new Integer(23);
		int ac=av.intValue();
		System.out.println(ac);
	}

}
