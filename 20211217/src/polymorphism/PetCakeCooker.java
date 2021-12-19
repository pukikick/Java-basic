package polymorphism;

public class PetCakeCooker extends Person {
	
	private String ingre;
	
	public PetCakeCooker (String name, int age, String ingre) {
		super(name, age);
		this.ingre = ingre;
	}
	public void showPerson() {
		super.showPerson(); // 부모츠 조회메서드 호출
		System.out.println("오늘 케잌의 재료는 "+ingre+"입니다.");
	}
}
