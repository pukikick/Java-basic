package string1;

import java.util.Scanner;

public class String10P399 {

	public static void main(String[] args) {
		// 로그인 로직을 만들어보겠습니다.
		// 먼저 String id에 여러분이 설정한 아이디를 
		// String pw에 여러분이 설정한 임의의 비밀번호를 저장해주세요.
		// 다음 사용자에게 Scanner를 이용해
		// uId 변수에는 아이디를(사용자 입력)
		// uPw 변수에는 비밀번호를(사용자 입력)받아서
		// "XX님이 로그인 하셨습니다"
		// id가 일치하나 비밀번호가 틀리면 "비밀번호가 틀렸습니다."
		// id가 일치하지 않으면 "그런 아이디는 없습니다."
		// 라고 출력되도록 코드를 작성해주세요.
		
		// 내가 작성
		/*Scanner scan = new Scanner(System.in);
		
		String id = new String("ShinEunTaek");
		String pw = new String("20211224");
		
		System.out.println("아이디 : ");
		String uId = scan.next();
		System.out.println("비밀번호 : ");
		String uPw = scan.next();
		if(id.equals(uId) && pw.equals(uPw)) { // && 
			System.out.println(id+"님 환영합니다.");
		}else {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
		}
		scan.close(); */
		
		// 강사님 작성
		String id = "abc1234";
		String pw = "123456";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("사용자 아이디를 입력해주세요.");
		String uId = scan.nextLine();
		
		if(uId.equals(id)) {
			System.out.println("비밀번호를 입력해주세요.");
			String uPw = scan.nextLine();
			
			if(uPw.equals(pw)) {
				System.out.println(id+"님 환영합니다.");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("그런 아이디는 없습니다.");
		}
		scan.close();
	}

}
