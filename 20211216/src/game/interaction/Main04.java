package game.interaction;

public class Main04 {
	public static void main(String[] args) {
		// 궁수 생성
		Archer a1 = new Archer();
		// 마법사 생성
		Magician m1 = new Magician();
		// 전사 생성
		Warrior w1 = new Warrior();
		// 골렘 생성
		Golem g1 = new Golem();
		
		a1.huntGolem(g1);
		m1.huntGolem(g1);
		w1.huntGolem(g1);
	}
}
