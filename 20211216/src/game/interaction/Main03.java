package game.interaction;

public class Main03 {
	public static void main(String[] args) {
		// 마법사 생성
		Magician m1 = new Magician();
		// 궁수 생성
		Archer a1 = new Archer();
		// 오크 생성
		Orc o1 = new Orc();
		// 트롤 생성
		Troll t1 = new Troll();
		
		m1.huntTroll(t1);
		a1.huntTroll(t1);
		System.out.println("----------------------");
		
		// 오크2 생성
		Orc o2 = new Orc();
		m1.huntOrc(o2);
		
		
	}

}
