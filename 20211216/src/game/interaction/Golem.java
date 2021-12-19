package game.interaction;
// 골렘 생성
public class Golem {
	private int hp;
	private int atk;
	private int def;
	
	public Golem() {
		this.hp = 40;
		this.atk = 15;
		this.def = 7;
	}
	
	// doBattle은 유저의 공격력을 받아 골렘의 체력을 차감합니다.
	public void doBattle (int uAtk) {
		// Golem의 체력을 유저 공격력 만큼 차감시켜주세요.
		hp=(hp+def)-uAtk;
		if(hp<=0) {
			hp=0;
			System.out.println("골렘이 죽서서 반응하지 않습니다.");
			return;
			}
		System.out.println("골렘의 남은 체력 : "+hp);
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
