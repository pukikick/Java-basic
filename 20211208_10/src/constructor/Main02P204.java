package constructor;


public class Main02P204 {

	public static void main(String[] args) {
		// 성공사례
		BasketballPlayer a = new BasketballPlayer(180,200);
		
		a.dunkShoot();
		
		// 실패사례
		BasketballPlayer b = new BasketballPlayer(30,20);
		b.dunkShoot(); 
	}
}
