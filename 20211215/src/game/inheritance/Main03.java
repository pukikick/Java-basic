package game.inheritance;

public class Main03 {
	// Magician은 mDam(마법데미지) 수리를 특수 수치로 가지고 Archer는 rDam(원거리데미지)
	// 수치를 특수 수치로 가집니다.
	
	// getInfo는 오버라이딩해서 Warrior처럼 특수 수치까지 콘솔에 찍히도록 처리해 주시면 됩니다.
	
	// main03을 만들어서 Magician과 Archer를 생성하고 정보도 조회해주시면 됩니다.

	public static void main(String[] args) {
		// 마법사
		Magician m1 = new Magician("법사");
		m1.getInfo();
		// 궁수
		Archer a1 = new Archer("궁수");
		a1.getInfo();
	}

}
