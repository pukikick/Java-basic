package owerriding;

public class Pig extends Animal {
	
	public int weight;
	
	public void howl() {
		System.out.println("꿀꿀");
	}
	public void getInfo() {
		System.out.println("종류 :"+Animal+", 이름 :"+name+
				            ", 나이 :"+age+", 사료 :"+food+", 무게 :"+weight+"kg입니다.");
	}

}
