import java.util.Scanner;

public class If02P93 {

	public static void main(String[] args) {
		// 교재 93페이지 프로그램 4-1 코드입니다.
		Scanner scan = new Scanner(System.in);
		// 변수 선언
		int su;
		
		System.out.println("정수를 입력해주세요 : ");
		su = scan.nextInt();
		// 만약에 if문의 실행문이 한 줄이라면, {}를 생략해도 됩니다.
		if(su>0) {
			System.out.println("양수입니다.");
		}
		System.out.println("음수입니다.");
		
		scan.close();
	}
	
}
