package static1;

public class Main02P276 {

	public static void main(String[] args) {
		// static 변수는 생성 없이도 활용할 수 있다.
		System.out.println(StaticTest.num2);
		// System.out.println(StaticTest.num1);
		// static 메서드로 설정 가능하며 나머지 사항은 변수와 같습니다.
		StaticTest.check();
		
		// s1 생성 후 s1을 이용해 .check()를 호출헤보세요.
		StaticTest s1 = new StaticTest();
		s1.check();
	}

}
