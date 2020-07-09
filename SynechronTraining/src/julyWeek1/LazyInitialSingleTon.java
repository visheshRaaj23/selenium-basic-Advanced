package julyWeek1;

public class LazyInitialSingleTon {

	public static void main(String[] args) {
		SingleTonExample1 example = SingleTonExample1.getInstance();
		example.selectSingleTon();
		System.out.println(example);

		SingleTonExample1 example1 = SingleTonExample1.getInstance();
		example1.selectSingleTon();
		System.out.println(example1);
		if (example == example1) {
			System.out.println("Both reference Instances Pointing to same Object");
		}

	}

}

class SingleTonExample1 {
	private static SingleTonExample1 INSTANCE = null;

	private SingleTonExample1() {
		// Avoid Someone instantiating.
	}

	public static  synchronized SingleTonExample1 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingleTonExample1();
		}
		return INSTANCE;
	}

	public void selectSingleTon() {
		System.out.println("Only a single instance is created");
	}
}
