package owerriding;

public class Horse extends Animal { // Animal에 특성이 들어있다.
	
	public int rank;
	
	// 오버라이딩 요건
	// 이름과 리턴자료형 등이
	// 같은 부모쪽 메서드를
	// 중복해서 작성함
	public void howl() { // Animal에 들어있는 howl을 재정의을 합니다.
		System.out.println("히히힝");
	}
	public void getInfo() {
		System.out.println("종류 :"+Animal+", 이름 :"+name+
				            ", 나이 :"+age+", 사료 :"+food+", 랭크 :"+rank+"위 입니다.");
	}

}
