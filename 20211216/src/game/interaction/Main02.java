package game.interaction;

public class Main02 {

	public static void main(String[] args) {
		// 전사 생성
		Warrior w1 = new Warrior();
		// 오크 생성
		Orc o1 = new Orc();
		// 트롤 생성
		Troll t1 = new Troll();
		
		o1.appear();
		t1.appear();
		w1.huntOrc(o1);
		w1.huntTroll(t1);
		w1.huntTroll(t1);
		w1.huntTroll(t1);
		w1.huntTroll(t1);
		w1.huntTroll(t1);
		w1.huntTroll(t1);
		

	}

}
