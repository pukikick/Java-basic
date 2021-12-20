package casting;

// Animal 클래스를 정의해주세요.
public class Animal {
	// 이름, 나이를 가집니다.
	private String name;
	private int age;
	
	// 생성자로 초기화합니다.
	public Animal (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// sit()을 실행하면 콘솔창에 "앉습니다."라고 콘솔에 호출됩니다.
	public void sit() {
		System.out.println("앉습니다.");
	}

}
