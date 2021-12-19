package structure;

public class Structure03P190 {
	
	private static void getcatInfo(Cat p) { // getcatInfo 고양이 정보가 있다를 알려준다.
		System.out.println(p.name+" 고양이의 정보입니다.");
		System.out.println("고양이 이름:"+p.name+", 고양이 나이:"+p.age+"살, 고양이 성별:"+p.sex);
	}

	public static void main(String[] args) {
		Cat a = new Cat();
		a.name = "고돌이";
		a.age = 3;
		a.sex = "수컷";
		
		Cat b = new Cat();
		b.name = "고순이";
		b.age = 2;
		b.sex = "암컷";
		
		getcatInfo(a);
	}

}
