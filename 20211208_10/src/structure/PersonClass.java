package structure;

public class PersonClass {
	// 사람 정보를 Person에서 만들었던 것처럼 만들어주시되
	// 여러분들이 추가하고 싶은 특성을 하나 더 추가해서 만들어주세요.
	public String name;
	public int age;
	public String area;
	public String pNum;
	public int uNum;
	
	// 추가로 아까의 조회 메서드를 내부에 생성해주세요.
	// 클래스 내부에 생성할때는 static을 적지 않습니다.
	// 클래스는 자기와 같은 지역에 있는 요소를 소속 명시 없이 조회 가능합니다.
	public void getInfo() {
		System.out.println(name+"의 정보를 조회합니다.");
		System.out.println("이름:"+name+
				            ", 나이:"+age+"세"+
				             ", 지역:"+area+
				              ", 번호:"+pNum+
				               ", 회원번호:"+uNum);	
		System.out.println("==============================");
	}

}
