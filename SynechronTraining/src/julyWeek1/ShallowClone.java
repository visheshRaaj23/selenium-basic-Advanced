package julyWeek1;

import java.util.Arrays;

public class ShallowClone implements Cloneable {

	public int[] numbers;
	public String nameString = "Supriya";
	public float value = 5.5f;
	public Float floatWrapper = 23.9f;

	public ShallowClone(int size) {
		numbers = new int[size];
	}

	public void cloneTest(int size) {
		// THE INT ARRAY IS SHALLOW CLONED AS ONLY THE ADDRESS IS COPIED AND THE VALUES
		// ARE NOT COPIED
		ShallowClone originalObject = new ShallowClone(size);
		originalObject.numbers[0] = 100;
		try {
			ShallowClone clonedObject = (ShallowClone) originalObject.clone();
			System.out.println("Cloned Successfully");
			System.out.println("Original Object" + originalObject);
			System.out.println("Cloned Object" + clonedObject);
			originalObject.numbers[1] = 500;
			originalObject.numbers[2]=400;
			nameString = "Vishesh";
			value = 8.8f;
			floatWrapper = 23.9f;
			System.out.println("Original Object" + originalObject);
			System.out.println("Cloned Object" + clonedObject);

		} catch (CloneNotSupportedException exception) {
			System.out.println("You cannot clone this Object");
			exception.printStackTrace();
		}

	}

	/*public static void main(String[] args) {
		ShallowClone clone = new ShallowClone(2);
		clone.cloneTest(2);
	}*/

	@Override
	public String toString() {
		return "ObjectToBeCloned[numbers:" + Arrays.toString(numbers) + ",nameString:[" + nameString + "],value:["
				+ floatWrapper + "],floatWrapper[" + floatWrapper + "]";
	}

}
