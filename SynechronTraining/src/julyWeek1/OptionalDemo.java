package julyWeek1;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalDemo {
	static String testString;

	public OptionalDemo() {

	}

	public static void main(String[] args) {
		Person person = null;
		ArrayList<String> arrayList = null;
		Integer numbers[]= {};
		if (Math.random() > 0.5) {
			testString = "Welcome Supriya";
			arrayList = new ArrayList<String>();
			arrayList.add("Supriya Shankar");
			person = new Person();
			numbers[0] = 100;
			numbers[1] = 200;

		}
		Optional optionalIntegerArray = Optional.ofNullable(numbers);
		Optional optionalArrayList = Optional.ofNullable(arrayList);
		Optional optionalString = Optional.ofNullable(testString);
		Optional optionalObject = Optional.ofNullable(person);
		if (optionalIntegerArray.isPresent()) {
			System.out.println(optionalIntegerArray.get());
		} else {
			System.out.println("No Integer Element");
		}
		if (optionalArrayList.isPresent()) {
			System.out.println(optionalArrayList.get());
		} else {
			System.out.println("No Array Object");
		}
		if (optionalObject.isPresent()) {
			System.out.println(optionalObject.get());
		} else {
			System.out.println("No Object");
		}

		if (optionalString.isPresent()) {
			System.out.println(testString.length());
		} else {
			System.out.println("No String or Null String");
		}
	}

}

class Person {
	private String name = "Supriya";

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}
