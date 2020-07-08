package string_programs;

import java.util.StringTokenizer;

public class Demo_A11 {

	public static void main(String[] args) {
		int count=0;
		String str="Volvo Buses in India has sold around around 3200 Buses in 2019";
		StringTokenizer stk = new StringTokenizer(str," ");
		while(stk.hasMoreElements()==true) {
			String token = stk.nextToken();
			char[] ch=token.toCharArray();
			int m=token.length();
			for(int i=m-1;i>=0;i--) {
				System.out.print(ch[i]);
				count++;
			}
			System.out.println("");
			
		}
		System.out.println(count);

	}

}
