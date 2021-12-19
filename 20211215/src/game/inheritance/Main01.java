package game.inheritance;

public class Main01 {
	
	public static void main(String[] args) {
		// 초보자 계정을 하나 생성하고 정보를 조회해보세요.
		Commoner c1 = new Commoner ("신은택"); 
		// Commoner=자료형 c1 = new {Commoner ("신은택")=생성지 호출};
		// 생성자는 객체 생성시 new를 써서 딱 한번만 호출
		c1.getInfo();		
	}
}
