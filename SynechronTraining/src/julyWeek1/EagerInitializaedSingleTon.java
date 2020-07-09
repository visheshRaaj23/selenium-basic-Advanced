package julyWeek1;

public class EagerInitializaedSingleTon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleTonExample example = SingleTonExample.getInstance();
		example.selectSingleTon();
		System.out.println(example);

		SingleTonExample example1 = SingleTonExample.getInstance();
		example1.selectSingleTon();
		System.out.println(example1);
		if(example==example1) {
			System.out.println("Both reference Instances Pointing to same Object");
		}
	}

}

class SingleTonExample {
	private static final SingleTonExample INSTANCE = new SingleTonExample();

	private SingleTonExample() {
		// Avoid Someone instantiating.
	}

	public static SingleTonExample getInstance() {
		return INSTANCE;
	}

	public void selectSingleTon() {
		System.out.println("Only a single instance is created");
	}
}
