package abstraction;

public abstract class Calculator implements Abacus {
	
	public void addNumbers(){
		System.out.println("we can add two numbers");
	}
	
	public void subtract(){
		System.out.println("we can subtract two numbers");
	}

	public abstract void multiply();
	
	public abstract void division();
	
	
	
	
}
