package game.inheritance;

public class Magician extends Commoner {
	private int mDam;
	
	public Magician (String name) {
		super(name);
		this.mDam = 40;	
	}
	
	public void getInfo() {
		System.out.println("레벨 : " + lv + ", 체력 : " + hp + ", 마나 : " + mp +", 마법데미지 : "+mDam+", 이름 : " + name);
	}
}
