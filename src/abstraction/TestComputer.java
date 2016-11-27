package abstraction;

public class TestComputer {

	public static void main(String[] args) {
		
		Abacus abacus = new DesktopComputer();
		abacus.addNumbers();
		abacus.subtract();
		
		Calculator calculator = new DesktopComputer();
		calculator.division();
		calculator.multiply();
		
		DesktopComputer desktopComputer = new DesktopComputer();
		desktopComputer.squareRoots();
		desktopComputer.exponential();
		desktopComputer.squareRoots();
		
		Lcd lcd = new DesktopComputer();
		lcd.lcdScreen();
		
		Laptop laptop = new Laptop();
		laptop.sonyLaptop();
		
		Transistor transistor = new UltraThinLaptop();
		transistor.generateBinaryNumbers();
	}

}
