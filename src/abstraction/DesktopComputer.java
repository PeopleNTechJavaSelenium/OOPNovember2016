package abstraction;

public class DesktopComputer extends Calculator implements Lcd {

	
	public void multiply() {
		System.out.println("we can multiply two numbers");
	}

	public void division() {
		System.out.println("we can divide two numbers");
	}
	
	public void squareRoots(){
		System.out.println("we can do square roots");
	}
	public void exponential(){
		System.out.println("we can do exponential");
	}

	public void lcdScreen() {
		System.out.println("We have LCD screen");
		
	}

}
