package game.inheritance;
// 1.뼈대가 되는 정보를 가진 Commoner를 Warrior 직업군을 정의 
public class Warrior extends Commoner { // extends 상속 Commoner에 내용을 상속받습니다.
	/*public Warrior(String pDam) {
		super(pDam);
		System.out.println("물리데미지 : "+pDam); */
	private int pDam;
	
	public Warrior(String name){
		super(name); // 생성자 내부에서 다른 코드에 앞서서 무조건 1순위로 들어와야함
		this.pDam = 2; // 물리데미지 설정하기
	}
	
	public void getInfo(){
		System.out.println("레벨 : " + lv + ", 체력 : " + hp + ", 마나 : " + mp +", 물리데미지 : "+pDam+", 이름 : " + name);
		}
}
