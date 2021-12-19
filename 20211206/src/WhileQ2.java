
public class WhileQ2 {
// while문을 이용해서 for문과 동일하게 사용
	public static void main(String[] args) {
		// 반복문의 경우 3개의 요소가 필요합니다.
		// 1. 조건식(참 거짓 판다능로 실행 유지 여부 결정)
		// 2. 변수 (조건식을 처음에는 true였다가 일정 시점뒤에 필요에 따라 false로 만들기 위해서)
		// 3. 변수 증감 (변수증감을 줘야 변수값이 변동이 생김)
		// while은 따로 떨어뜨려 두는것이 특징입니다.
		// 따라서 한 줄에 있냐, 떨어져있냐만 빼면 사실상 같은 구문입니다.
		    // 이거 묶음 for ( int i=2;i<10;i++)랑 같은 의미
		// i while문 변수 생성
		int i=2; // 구구단이므로 시작값 2
		// i while문의 조건식 생성 (범위 2~9를 갖게 하기 위해 10이되면 false가 되도록 설계)
		while (i<10) {
			
			// j while문 변수 생성
			int j = 1; // i가 x단이므로, j는 1부터 시작합니다.
			while (j<10) { // j while문의 조건식 생성 (범위 1~9를 가지게 합니다.)
				System.out.println(i+"*"+j+"="+i*j);
				j++ ; 
			}
			System.out.println("===============");
			// for문은 다 돌고나서 i값을 증가시키기 때문에 우선 아래쪽에 둡니다.
			i++; // i=i+1; // i+=1; 셋 중 하나를 기입해서
			// i값을 증가시킵니다.
		}
	}

}
