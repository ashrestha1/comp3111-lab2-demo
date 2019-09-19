package lab2.ex2;

public class MobileComputer extends Computer implements Chargeable{
	
	/*
	 * the charge function in chargeable class only accepts chargeable objects,
	 *  and Phone implements Chargeable but MobileComputer does not therefore added the line 
	 *  "public class MobileComputer extends Computer implements Chargeable" in MobileComputer.java
	 *  so that charge method in chargeable.java can accept MobileComputer object.
	
	*/
	private int battery;
	public MobileComputer() {
		
		secret = "MobileComputer secret";
		battery = 5;
		
	}
@Override
	public void work() {
		
		if(battery > 0) {	
			System.out.println("it is working on my lap.");
			battery--;
			
		} else 
			System.out.println("Running out of battery ");	
	}
	
	public void charge() {	
		if (battery < 10)
			battery++;
	}

	
}
