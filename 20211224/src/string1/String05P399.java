package string1;

import java.util.Scanner;

public class String05P399 {

	public static void main(String[] args) {
		// .length()와 charAT()을 활용해 입력된 전체 문자열을
		// 한 글자씩 한 줄 씩 처리하는 로직을 작성해보세요.
		// 문자열은 Scanner로 입력받습니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열을 입력해주세요.");
		String str = scan.next();
		
		for(int i=0; i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}

}
