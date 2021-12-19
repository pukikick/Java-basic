package structure;

public class Structure02P190 {
	
	// Person 내부의 정보를 쉽게 조화하기 위해 메서드 생성
	public static void getInfo(Person p) {
		System.out.println(p.name+"의 정보입니다.");
		System.out.println("이름:"+p.name+", 나이:"+p.age+", 번호:"+p.pNum+", 회원번호:"+p.uNum);
	}

	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요(a,b)
		Person a = new Person();
		a.name = "신은택";
		a.age = 27;
		a.pNum = "010-4801-6928";
		a.uNum = 4040403;
		
		Person b = new Person();
		b.name = "강태양";
		b.age = 27;
		b.pNum = "010-2304-9359";
		b.uNum = 249940;
		
		getInfo(a); // a의 주소값을 getInfo의 p에 전달
		getInfo(b); // b의 주소값을 getInfo의 p에 전달

	}

}
