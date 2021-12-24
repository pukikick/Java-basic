package string1;

public class String11P399 {

	public static void main(String[] args) {
		// String.valueOf()는 괄호 사이의 자료를 문자열로 바꿔줍니다.
		String a = String.valueOf(1000);
		// int a = 1000;
		System.out.println(a);
		System.out.println(a+1);
		
		// 실수 하나를 임의로 문자열로 바꿔서 저장해보세요.
		String b = String.valueOf(5232.4567);
		// double b = 5232.4567; 이 식이랑 같다
		System.out.println(b);
		System.out.println(b+1);
		
		// String.valuOf()를 쓰지 않고도
		// +""만으로도 문자열로 만들 수 있습니다.
		// 자바는 문자열 + 다른자료형이 오는 경우 전부 문자로 치환해 처리합니다.
		String c = 1000+""; // ="1000"
		System.out.println(c);
		System.out.println(c+1);
		
		// boolean 자료형에 대해서 여러분들이 원하는 방식으로
		// 문자열화 해서 콘솔에 찍어주세요.
		String d = String.valueOf(true);
		System.out.println(d);
		System.out.println(d+1);
		String e = false+"";
		System.out.println(e);
		System.out.println(e+1);
		
	}

}