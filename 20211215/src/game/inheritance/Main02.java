package game.inheritance;

public class Main02 { 
	// 순서
	// main7 > Warrior9 > Commoner12~18 > Warrior10 > main7
	// main7(new Warrior("신은택");)에 의한 
	// 호출 순서 및 복귀 과정을 적어서 보내주세요.
	// 1. 메인 영역 생성
	// 2. main7 우변 > Warrior:10번으로 이동
	// 3. Warrior:11 > Commoner:12로 이동
	// 4. Commoner:13~18 > Warrior:9로 이동
	// 5. Warrior:10~11 > main 17로 이동
	public static void main(String[] args) {
		// Warrior 생성을 하나 해 주세요.
		Warrior w1 = new Warrior ("신은택");
		// 정보 조회를 해보시고, 호출번호도 고려해보세요.
		w1.getInfo();
	}

}
