package game.interaction;

public class Archer {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	
	public Archer() {
		this.hp=20;
		this.mp=10;
		this.atk=4;
		this.def=1;
		this.exp=0;
	}
	public void huntGolem(Golem golem) {
		golem.doBattle(this.atk);
		this.hp=this.hp+this.def-golem.getAtk();
		System.out.println("교전 결과 궁수의 체력 : "+this.hp);
	}
	public void huntOrc(Orc orc) {
		// 마법사가 오크를 때리기 위해서 먼저 Orc의 doBattle을 호출합니다.
		orc.doBattle(this.atk);
		// 마법사도 오크에게 공격을 받습니다.
		this.hp = this.hp+this.def-orc.getAtk();
		System.out.println("교전 결과 궁수의 체력 : "+this.hp);
	}
	public void huntTroll (Troll troll) {
		troll.doBattle(this.atk);
		if(troll.getHp()>0) { // 반대로 해도 상관없다.
			this.hp=this.hp+this.def-troll.getAtk();
			System.out.println("교전 결과 궁수의 체력 : "+this.hp);
		} else {
			System.out.println("트롤이 이미 죽어서 교전이 끝났습니다.");
			System.out.println("교전 결과 궁수의 체력 : "+this.hp);
			}	
		}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
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

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
}
