package overloading;

public class Main {

	public static void main(String[] args) {
		// 1. Calculator를 생성해주세요.
		Calculator c1 = new Calculator();
		// 2. plus(int, int)를 호출해주세요. 값은 임의로 넣어주세요.
		c1.plus(5, 6);
		// 3. plus(double)을 호출해주세요. 값은 임의로 넣어주세요.
		c1.plus(1.7);
		// 4. plus(String)을 Calculator에 새로 추가해주시고 호출해주세요.
		// 이 메서드는 System.out.println("문자열은 연산 대상이 아닙니다."); 라고 출력합니다.
		c1.plus("asdf");
	}
}
