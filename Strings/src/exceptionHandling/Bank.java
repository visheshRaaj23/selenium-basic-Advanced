package exceptionHandling;

public class Bank {

	public void initialize() {
		Demo_A7aATM atm=new Demo_A7aATM();
		
		try {
			atm.acceptInput();
			atm.verify();
		}
		catch(Exception e) {
			try {
				atm.acceptInput();
				atm.verify();

				
			}
			catch(Exception f) {
				try {
					atm.acceptInput();
					atm.verify();
				}
				catch(Exception g) {
					System.exit(0);
				}
			}
		}
	}
}
