package polymorphism;

// Person 상속
public class Developer extends Person {
	
	// 개발언어
	private String devLang;
	
	public Developer (String name, int age, String devLang) {
		super(name,age);
		this.devLang = devLang;
	}
	public void showPerson() {
		super.showPerson(); // 부모츠 조회메서드 호출
		System.out.println("개발언어는 "+devLang+"입니다.");
	}
}
