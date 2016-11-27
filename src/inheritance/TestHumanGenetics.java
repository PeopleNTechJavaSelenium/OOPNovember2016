package inheritance;

public class TestHumanGenetics {

	public static void main(String[] args) {
		GrandFather gf = new GrandFather();
		gf.sportsMan();
		
		Father father = new Father();
		father.goldenHair();
		father.sportsMan();
		
		GrandSon gs = new GrandSon();
		gs.hobby();
		

	}

}
