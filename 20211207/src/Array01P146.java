import java.util.Arrays;

public class Array01P146 {

	public static void main(String[] args) {
		// 배열은 일반 변수와 달리 하나의 변수명에 여러 값을
		// 입력할 수 있고 자료항에 []를 붙이는 것으로 선언합니다.
		// 배열은 크기를 정해서 생성할수도 있고, 정하지 않고 생성할수도
		// 있는데, 설정된 크기 이상으로 자료를 넣을 수 없습니다.
		// 배열의 크기(저장가능개수)는 "배열의 길이"라 표현합니다.
		// 배열명.length를 이용해 배열크기를 알 수 있습니다.
		
		// 배열의 선언 1(길이 확정x)
		int a[] = {1, 2, 3, 4};
		System.out.println(Arrays.toString(a));// sysout(a)
		
		// 배열의 선어 2(길이 확정x)
		double[] b = {5.1, 6.3, 7.2, 8.77};
		System.out.println(Arrays.toString(b));
		
		// 배열의 생성(길이 확정) // 자동으로 0이 채워집니다.
		int[] c = new int[10]; // 10칸 확보(0~9번까지 전부 0으로 자동으로 채워짐)
		System.out.println(Arrays.toString(c));
		
		// 배열의 길이는 .length로 알 수 있습니다.
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
	}
}
