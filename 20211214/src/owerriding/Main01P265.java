package owerriding;

public class Main01P265 {

	public static void main(String[] args) {
		// 말과 돼지를 생성해보겠습니다.
		Horse h1 = new Horse();
		h1.howl();
		h1.Animal = "말";
		h1.name = "말돌이";
		h1.age = 34;
		h1.food = "건초";
		h1.rank = 1;
		h1.getInfo();
		
		Pig p1 = new Pig();
		p1.howl();
		p1.Animal = "돼지";
		p1.name = "돼순인";
		p1.age = 10;
		p1.food = "곡물사료";
		p1.weight = 40;
		p1.getInfo();

	}

}
