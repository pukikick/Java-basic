package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		// 여기에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요.
		// 샐러리맨에는 본인 이름과 희망 연봉을 적어주세요.
		// 학생은 그냥 알아서 작성해주세요.
		// 생성한 객체의 정보를 콘솔에도 같이 찍어주세요.
		Student s1 = new Student();
		s1.name="신은서";
		s1.age=24;
		s1.stuNum=17;
		s1.getInfo();
		s1.getStudentInfo();
		
		Salaryman s2 = new Salaryman();
		s2.name="신은택";
		s2.age=27;
		s2.salary=4000;
		s2.getInfo();
		s2.getsalaryInfo();
	}

}
