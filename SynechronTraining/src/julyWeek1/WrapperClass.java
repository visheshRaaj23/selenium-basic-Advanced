package julyWeek1;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
	
	public static void main(String[] args) {
		
		//Primitive is converted into reference type is called Boxing.
		int i=10;
		Integer integer=i;
		System.out.println(i+i);
		System.out.println(integer.toString()+"---"+integer.toString());
		
		int x =integer;
		
		List<Object> list = new ArrayList<Object>();
		list.add(x);
		list.add((Integer)x);
		list.add("Supriya");
		System.out.println(list);
		
	}

}
