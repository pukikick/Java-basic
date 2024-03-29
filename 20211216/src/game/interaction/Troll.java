package game.interaction;
// Warrior에 huntTroll을 만들어주세요.
// Troll 클래스를 생성해주시고
// 생성된 트롤과 전사가 상호작용하게 해 주시고
// Main02에서 둘을 상호작용도 시켜보세요.

public class Troll {
	private int hp;
	private int atk;
	private int def;
	
	public Troll() {
		this.hp=4;
		this.atk=7;
		this.def=1;
	}
	public void appear () {
		System.out.println("트롤이 등장했습니다.");
	}
	// doBattle은 유저의 공격력을 받아 트롤의 체력을 차감합니다.
	public void doBattle (int uAtk) {
		hp=(hp+def)-uAtk;
		if(hp<=0) {
			hp=0; // 필수는 아님, 죽은 몬스터 체력은 0으로 보정
			System.out.println("트롤이 죽어서 반응하지 않습니다.");
			return; // return시 메서드를 강제로 종료시킵니다. else문 안써도 가능
		}// else {
			System.out.println("트롤의 남은 체력 : "+hp);	
		}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
	

}
