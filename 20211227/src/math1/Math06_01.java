package math1;

public class Math06_01 {

	public static void main(String[] args) {
		// 가위 바위 보 상수로 처리
		int myValue = (int)(Math.random()*3);
		int comValue = (int)(Math.random()*3);
		
		// 상수를 처리하는 부분
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		
		if ((myValue == SCISSORS && comValue == PAPER)||
		(myValue == ROCK && comValue == SCISSORS)||
		(myValue == PAPER && comValue == ROCK)) {
			System.out.println("내가 이겼습니다.");
		} else if ((myValue == PAPER && comValue == SCISSORS)||
				(myValue == SCISSORS && comValue == ROCK)||
				(myValue == ROCK && comValue == PAPER)) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else if(myValue == comValue) {
			System.out.println("서로 비겼습니다.");
		}
		
		// 내가 낸 것과 컴퓨터 낸 것을 숫자에서 문자로 치환해주는 배열
		String [] items = {"가위", "바위", "보"};
		
		// 내가 낸 것과 컴퓨터가 낸 것을 출력해주는 부분
		System.out.println("내가 낸 것 : "+items[myValue]);
		System.out.println("컴퓨터가 낸 것 : "+items[comValue]);
	}

}
