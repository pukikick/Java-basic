package game.accessmodifier;

public class Magician extends Commoner {
	
	public Magician(String name) {
		super(name);
	}
	public void hunt() {
		System.out.println("마법사가 사냥을 시작합니다.");
		// hp -= 2; 를 직접 실행할 수 없으므로
	    // public인 setter(setHP)를 이용합니다.
	    // setHP(5)인 경우, 기존의 값 대신 hp변수에 5로 교체해달라는 요청임.
		setHp(getHp()-2);
		// 경험치도 마찬가지로 
		// exp += 10; 를 직접 실행할 수 없으므로
		// setExp()를 활용합니다.
		setExp(getExp()+10);
	}
	
	// fireball 메서드를 생성해주세요
	// 마나가 3줄고, 경혐치는 20증가합니다.
	public void fireball() {
		System.out.println("파이어볼을 사용합니다.");
		setMp(getMp()-3);
		setExp(getExp()+20);
	}
	// heal 메서드를 생성해주세요
	// 마나가 2줄고, 체력이 10 회복됩니다.
	public void heal() {
		System.out.println("힐을 사용합니다.");
		setMp(getMp()-2);
		setHp(getHp()+10);
	}
	public void getInfo() {
		// 심지어 private요소는 수정이 아닌 조회도 불가능합니다.
		System.out.println("현재 체력 : "+getHp());
		// 체벽뿐만 아니라 나머지 요소들도 조회할 수 있도록 코드를 추가해주세요.
		System.out.println("현재 마나 : "+getMp());
		System.out.println("현재 레벨 : "+getLv());
		System.out.println("현재 경헙치 : "+getExp());
		System.out.println("현재 유저명 : "+getName());
	
	}
}


