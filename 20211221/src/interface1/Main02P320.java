package interface1;

public class Main02P320 {

	public static void main(String[] args) {
		// 기차생성 후 명령 7개 이상
		Vehicle t1 = new Train("나기차");
		
		t1.accel();
		t1.accel();
		t1.accel();
		t1.showStatus();
		t1.breakSpeed();
		t1.showStatus();
		t1.reFuel();
		t1.showStatus();
	}

}
