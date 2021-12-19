package game.polymorphism;

public class Main02P302 {
	public static void main(String[] args) {
		// Commoner 생성
	    Commoner c1 = new Commoner("초심자");
	    // Orc생성
		Monster o1 = new Orc();
		// Dragon 생성
		Monster d1 = new Dragon();
		// Slime 생성
		Monster s1 = new Slime();
		
		c1.hunt(d1);
		c1.hunt(o1);
	}

}
