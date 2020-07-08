package number_series;

import java.util.ArrayList;
import java.util.Iterator;

//Program to add 10 countries to the arrayList and retrieve it from list
public class Demo_A4 {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("INDIA");
		arr.add("USA");
		arr.add("JAPAN");
		arr.add("LONDON");
		arr.add("GERMANY");
		arr.add("ITALY");
		arr.add("AUSTRIA");
		arr.add("IRELAND");
		arr.add("AUSTRALIA");
		arr.add("BHUTAN");
		System.out.println(arr);
		
		Iterator itr=arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
