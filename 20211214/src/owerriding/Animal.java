package owerriding;

public class Animal {
	
	public String Animal;
	public String name;
	public int age;
	public String food;
	
	public void howl() {
		System.out.println("동물이 웁니다.");
	}
	
	public void getInfo() {
		System.out.println("종류 :"+Animal+", 이름 :"+name+
				            ", 나이 :"+age+", 사료 :"+food);
		
	}
}
