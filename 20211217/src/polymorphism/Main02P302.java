package polymorphism;

public class Main02P302 {

	public static void main(String[] args) {
		// 개발자 생성 및 정보조회, Person으로 개발자를 받음.
		Person d1 = new Developer("나개발자", 10, "자바");
		d1.showPerson();
		
		Person p1 = new PetCakeCooker("강아지케잌", 20, "연어/불고기");
		p1.showPerson();
	}
}
