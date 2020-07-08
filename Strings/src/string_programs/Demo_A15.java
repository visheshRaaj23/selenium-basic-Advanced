package string_programs;

import java.util.Scanner;

//Accept the number in the from of number and print in words
public class Demo_A15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int number=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number between 0 and 999 or type -1 to exit");
		number=scan.nextInt();
		while(number!=-1) {
			if(number>=0 && number<=999) {
				if(number==0) {
					System.out.println("Number after conversion"+" "+"ZERO");
				}
				else {
					System.out.println("Number after conversion:/t");
					Demo_A15.numberToWord(((number/100)%10),"  HUNDRED");
					Demo_A15.numberToWord((number%100), " ");
				}
			}
			else {
				System.out.println("Number is out of range");
			}
			System.out.println("\n Please enter the type between 0 to 999 or type=-1 to exit");
			number=scan.nextInt();
			
		}
		

	}
	public static void numberToWord(int num,String val) {
		String ones[]= {" ","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
		String tens[]= {" "," ","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};
		if(num>19) {
			System.out.print(" "+tens[num/10]+" "+ones[num%10]);
		}else {
			System.out.print(ones[num]);
		}
		if(num>0) {
			//System.out.println("HI");
			System.out.print(val);
		}

	}
}
