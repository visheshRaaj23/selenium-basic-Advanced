package number_series;


import java.util.Scanner;

public class Demo_A2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		while(number!=-1) {
			if((number>=0) && (number<=999)) {
				if(number ==0) {
					System.out.println("Number after conversion is : Zero");
				}
				else {
					System.out.println("Number after conversion is");
					Demo_A2.numberToWord((number/100)%10, "HUNDRED AND");
					Demo_A2.numberToWord((number%100), " ");
				}
				
			}
			else {
				System.out.println("Number is out of range");
			}
			System.out.println("Number after conversion is");
			number=scan.nextInt();
		}

	}
	
	public static void numberToWord(int num,String val) {
		String ones[]= {" ","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
		String tens[]= {" "," ","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINTY"};
		
		if(num>19) {
			System.out.println(" "+tens[num/10] + " "+ones[num%10]);	
			
		}
		else {
			System.out.println(" "+ones[num]);
		}
		if(num>0) {
			System.out.println(val);
		}
		
		
		}

}
