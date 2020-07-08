package string_programs;

import java.util.StringTokenizer;

//To count number of words in a given string
public class Demo_A6 {

	//String Tokenizer is used to split the string at specified character
	//present is java.util package
	//hasMoreTokens() checks whether stk pointer would point to token or not
	//nextToken() checks for next token and retreives it.
	public static void main(String[] args) {
		String s1="Volvo,Scania,Benz,Hispano";
		int count=0;
		StringTokenizer stk=new StringTokenizer(s1,",");
		while(stk.hasMoreTokens()) {
			String element = stk.nextToken();
			count++;
			System.out.println(element);
		}
		System.out.println("The number of words present in a given string"+": "+count);

	}

}
