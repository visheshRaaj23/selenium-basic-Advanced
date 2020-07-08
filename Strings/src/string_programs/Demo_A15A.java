package string_programs;

import java.util.Scanner;

public class Demo_A15A {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value between 99 and 999 or enter the values <99 to exit");
		int number = scan.nextInt();
		while(number!=98) {
			if((number>99) && (number<999)) {
				if(number==99) {
					System.out.println("Number after conversion is : 99");
				}
				else {
					System.out.println("Number after conversion is");
					Demo_A15A.numberToWord(((number/100)%10), "HUNDRED");
					Demo_A15A.numberToWord((number%100), " ");
				}
			}
			else {
				System.out.println("Number is out of range");
			}
			System.out.println("Enter the value between 99 and 999 or enter the values <99 to exit");
			number=scan.nextInt();
		}
		
	}
	
	public static void numberToWord(int num,String val) {
		String ones[]= {" ","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
		String tens[]= {" "," ","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};
		if(num>=99)
		{
			System.out.println(" "+ones[num%10]);
			
		}
		if(num>0) {
			System.out.println(val);
		}
		
		
	}
}


