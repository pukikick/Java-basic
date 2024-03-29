package game.inheritance;

public class Commoner {

		//레벨, 체력, 아이디, 마나수치
		protected int lv;
		protected int hp; // private, protected 차이 비교
		protected int mp;
        protected String name;
		
		// 생성자는 레벨1, 체력20, 마나10을 기본으로, 아이디는 입력받아 처리
		public Commoner(String name) {
			// 생성자 내부에서 멤버변수를 초기화할때는 this.를 붙이는경우가 많습니다.
			this.lv = 1;
			this.hp = 20;
			this.mp = 10;
			this.name = name;
		}
		
		public void getInfo(){
			System.out.println("레벨 : " + lv + ", 체력 : " + hp + ", 마나 : " + mp + ", 이름 : " + name);
		}
		
	}