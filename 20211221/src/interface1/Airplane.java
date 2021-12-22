package interface1;

public class Airplane implements Vehicle {

	// 속도, 연료량, 기관사명을 선언합니다.
	private int speed;
	private int gas;
	private String name;
	
	public Airplane(String name) {
		this.speed = MIN_SPD;
		this.gas = AIRPLANE_MAX_GAS;
		this.name = name;
	}
	
	@Override
	public void accel() {
		// 최대속도 400/ 50씩 증가
		if(speed + AIRPLANE_INCREASE_SPD > AIRPLANE_MAX_SPD) {
			speed = AIRPLANE_MAX_SPD;
		} else {
			speed += AIRPLANE_INCREASE_SPD;
		}
		// 가속 후 연료 차감
		// -7씩 차감
		gas -= AIRPLANE_DECREASE_GAS;
	}

	@Override
	public void breakSpeed() {
		// 감속도 50씩
		if(speed - AIRPLANE_DECREASE_SPD < MIN_SPD) {
			speed = MIN_SPD;
		} else {
			speed -= AIRPLANE_DECREASE_SPD;
		}		
	}

	@Override
	public void reFuel() {
		// 연료량은 70씩 채웁니다
		if(gas + AIRPLANE_INCREASE_GAS > AIRPLANE_MAX_GAS) {
			gas = AIRPLANE_MAX_GAS; 
		} else {
			gas += AIRPLANE_INCREASE_GAS;
		}
	}

	@Override
	public void showStatus() {
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 연료 : " + gas);
		System.out.println("현재 기장 : " + name);
		System.out.println("-------------------------"); 
	}

}
