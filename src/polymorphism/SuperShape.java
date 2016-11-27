package polymorphism;

public class SuperShape extends Shape  {
	
	@Override
	public int areaOfLand(int a, int b, int c, int d){
		int total = a + b + c + d + 2;
		
		return total;
	}

}
