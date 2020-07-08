package number_series;

import java.util.Scanner;

public class Demo_A1 {

	public static void main(String[] args) {
		int t1=0;
		int t2=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n to get top n fibonacci numbers");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(t1+" ");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		}
		
	}

}
