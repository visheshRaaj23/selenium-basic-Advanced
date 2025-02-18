package julyWeek1;

import org.omg.CORBA.Object;
import org.w3c.dom.css.Counter;

public class MethodReference {
	public static void main(String[] args) {
		
	}
	
	private static void staticMethodReference() {
		
		Integer[] intArray = {23,04,06,24};
		counter counter = arr ->Utils.objectArray(arr);
		System.out.println(counter.count(intArray));
		
		
	}
	
	private static void objectInstanceMethodReference() {
		Integer[] intArray = {23,04,06,24};
		Counter counter2 = new Utils::countElementsInstance;
	}	
}
class Utils{
	public static int objectArray(Object[] array) {
		return array.length;
	}
	
	public static int countElementsInstance(Object[] array1) {
		return array1.length;
	}
}
@FunctionalInterface
interface counter{
	int count(Object[] array);
	
	
}




