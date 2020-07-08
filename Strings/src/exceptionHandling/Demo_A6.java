package exceptionHandling;

public class Demo_A6 {

	public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	try {
		try {
			System.out.println(a[7]);
		}
		catch(Throwable obj) {
			System.out.println(obj);
		}
		System.out.println(1/0);
		
	}
	catch(Throwable obj1) {
		System.out.println(obj1);
	}

	}

}
