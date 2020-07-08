package number_series;


//Program to print 10 random number between 0 to 10??


import java.util.Random;

public class Demo_A3 {

	public static void main(String[] args) {
	
		Random rnum=new Random();
		System.out.println("Random numbers are");
		System.out.println("**********************");
		for(int i=0;i<=15;i++) {
			System.out.println(rnum.nextInt(10));
		}

	}

}
