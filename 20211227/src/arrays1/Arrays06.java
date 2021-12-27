package arrays1;

import java.util.Arrays;

public class Arrays06 {

	public static void main(String[] args) {
		// 유니코드를 활용하는 모든 문자
		// 유니코드를 활용하는 모든 문자
		String[] arr = {"신은택","申殷宅","😊😊", "울룽도"};
		
		// 정렬
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
