package math1;

public class Math05 {

	public static void main(String[] args) {
		// 주사위 게임을 만들어주세요.
		// 주사위게임은 내 값은 myValue변수에,
		// 컴퓨터값은 comValue 변수에 값을 난수발생으로 1~6번으로 부여한 뒤
		// 값이 같다면 무승부, 아니면 나, 혹은 컴퓨터 중 승자가 누구인지 알려주는 방식입니다.
		int myValue = (int)(Math.random()*6)+1; // (0~5)+1 이다
		int comValue = (int)(Math.random()*6)+1;
		
		// .random( ) : 랜덤메서드는 0~1 사이의 값들이 랜덤으로 나옵니다.
		// 0~1 사이의 수가 나오므로 int으로 형변환시켜 정수값이 나오게 합니다.
		// 0~1 사이 값에 *6을 하면 0~5가 되므로 +1이 필요합니다.
		if(myValue > comValue) {
			System.out.println("내가 승리했습니다.");
		} else if(myValue == comValue) {
			System.out.println("무승부 했습니다.");
		} else {
			System.out.println("컴퓨터가 승리했습니다.");
		}
		System.out.println("내 값 : "+myValue);
		System.out.println("컴퓨터 값 : "+comValue);

	}

}
