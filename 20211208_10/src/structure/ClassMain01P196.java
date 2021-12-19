package structure;

public class ClassMain01P196 {
	// PersonClass의 메서드는 작성할 필요가 없습니다.
	// 이미 PersonClass의 내부에 필요한 메서드를 다 작성해놨기 때문입니다.
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어 보세요.
		PersonClass a = new PersonClass();
		a.name="신은택";
		a.age=27;
		a.area="인천";
		a.pNum="010-4801-6928";
		a.uNum=20211209;
		// 만든 사람 두 명의 정보를 콘솔에 찍어보세요.
		a.getInfo(); // PersonClass에 getInfo정보 호출
		
		PersonClass b = new PersonClass();
		b.name="이종민";
		b.age=27;
		b.area="인천";
		b.pNum="010-2024-8517";
		b.uNum=1209;
		// 만든 사람 두 명의 정보를 콘솔에 찍어보세요.
		b.getInfo(); // PersonClass에 getInfo정보 호출
	}
}
