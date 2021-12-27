package math1;

public class Math06 {

	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보겠습니다.
		// Math.random( )을 이용해 1/3 확률로 가위, 바위, 보를 부여받으며
		// 가위 > 보, 바위 > 가위, 보 > 가위의 상성을 가집니다.
		// 같은 요소가 나오면 무승부 입니다.
		// 힌트) 컴퓨터가 이기는 경우, 내가 이기는 경우, 비기는 경우를 따져서
		// 조건식에 ||을 사용합니다
		
		// 0 = 가위, 1 = 바위, 2 = 보.
		// 0 > 2, 1 > 0, 2 > 1
		int myValue = (int)(Math.random()*3);
		int comValue = (int)(Math.random()*3);
		
		// 내가 가위, 컴퓨터가 보를 뽑아서 이기는 케이스
		// if(내 값 ==  0(가위) && 컴퓨터값 == 2(보){
		//     System.out.println("내가 이겼습니다.");
		// }
		
		if (myValue == 0 && comValue == 2) { // 이건 완전 노가다
			System.out.println("내가 이겼습니다.");
			System.out.println("나는 가위를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			} else if(myValue == 0 && comValue == 1) {
			System.out.println("컴퓨터가 이겼습니다.");
			System.out.println("나는 가위를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			} else if(myValue == 1 && comValue == 0) {
			System.out.println("내가 이겼습니다.");
			System.out.println("나는 바위를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			}else if(myValue == 1 && comValue == 2) {
			System.out.println("컴퓨터가 이겼습니다.");
			System.out.println("나는 바위를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			}else if(myValue == 2 && comValue == 0) {
			System.out.println("컴퓨터가 이겼습니다.");
			System.out.println("나는 보를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			}else if(myValue == 2 && comValue == 1) {
			System.out.println("내가 이겼습니다.");
	    	System.out.println("나는 보를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			} else if(myValue == comValue){
				System.out.println("비겼습니다."); 
			}
	}
}