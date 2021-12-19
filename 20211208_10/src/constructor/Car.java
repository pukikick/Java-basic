package constructor;

public class Car {
	
	// 자동차의 상태(속성)을 나타내는 변수들
	public int gas; // 연료량
	public int speed; // 속도
	public String owner; // 차주
	
	public Car () {
		gas = 80;
		speed = 0;
		owner = "신은택";
		System.out.println("자동차 생성 완료!");
		System.out.println("연료: "+gas+", 속도: "+speed+", 주인: "+owner);
	}
	
	// 자동차 동작 추가하기
	public void getInfo() {
		System.out.println("현재 연료량:"+gas);
		System.out.println("현재 속도:"+speed);
		System.out.println("현재 주인:"+owner);
		System.out.println("==================");
	}
	
	// 운전 기능 추가하기(가속하기)
	public void accelSpeed() {
		gas -= 2;
		speed += 10;
	}
	
	// 브레이크 기능 추가하기(감속하기)
	public void breakSpeed() {
		speed -= 10;
	}
	// 주유기능을 추가해주세요.
	// 메서드명은 putGas() 입니다.
	// 한 번 주유시 개솔린은 10씩 주유됩니다.
	// 만들고 main 쪽에서 주유도 해 보세요
	public void putGas() {
		speed = 0; // 주유 하니까 속도는 0이
		gas += 10;		
	}
}
