package overloading;

public class Main {

	public static void main(String[] args) {
		// 1. Calulator를 생성해주세요.
		Calulator c1 = new Calulator();
		// 2. plus(int, int)를 호출해주세요. 값은 임의로 넣어주세요.
		c1.plus(5,6);
		// 3. plus(double)을 호출해주세요. 값은 임의로 넣어주세요.
		c1.plus(1.7);
		// 4. plus(String)을 Calulator에 새로 추가해주시고 호출해주세요.
		// 이 메서드 System.out.println("문자열은 연간 대상이 아닙니다."); 라고 출력합니다.
		c1.plus("asdf");
	}

}
