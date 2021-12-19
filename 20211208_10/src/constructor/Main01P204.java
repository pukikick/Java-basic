package constructor;

public class Main01P204 {

	public static void main(String[] args) {
		// 자동차 한 대를 만들어주세요.
		// 연료량은 100
		// 속도 0
		// 주인은 본인이름으로 만들어주세요.
		Car a = new Car();
		// 생성자로 gas, speed, owner를 처리
		// a.gas = 100;
		// a.speed = 0;
		// a.owner = "신은택";
		
		// 차를 뽑자마자 먼저 상태 확인
		System.out.println();
		a.getInfo();
		
		// 액셀을 두 번 밟아주세요.
		a.accelSpeed();
		a.accelSpeed();
		// 상태 다시 확인
		a.getInfo();
		
		// 브레이크를 밟아주세요.
		a.breakSpeed();
		// 상태 다시 확인
		a.getInfo();
		
		// 주유 1번 실행
		a.putGas();
		// 상태 다시 확인
		a.getInfo();
	}

}
