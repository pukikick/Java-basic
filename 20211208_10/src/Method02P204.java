
public class Method02P204 {
	
	public static int add2(int a) {
		return a+1; // return 시 int 로 작성
		            // java에서는 return 구문 2개 사용 불가
	}

	public static void main(String[] args) {
		// 반환자료가 void가 아닌 경우는 호출 위치에
		// return문 오른쪽 자료를 그대로 갖다놓습니다.
		// 자료를 반환하는 것은 console창에 표시한다 라는 말과
		int b = add2(10);
		// int b = 11;
		
		System.out.println(b);

	}

}
