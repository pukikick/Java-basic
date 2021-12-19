
public class ForQ9P118 {

	public static void main(String[] args) {
		// 중첩 반복문을 이용해서
		// 다음 방정식의 양의 정수 ( 양의 정수=0을 포함하지 않는다. )
		// 해를 모두 구하세요.
		// 4x + 5y = 60
		// x포문, y포문, if문이 필요합니다.
		for (int x=1;x<15;x++) { // x가 1인 경우부터 시작해서 14인 경우까지 반복
			for (int y=1;y<12;y++) {
				if(x*4+y*5==60) {
					System.out.println("x는"+x+",y는"+y+"가 해입니다.");
					}
				}
			}
		}
	}