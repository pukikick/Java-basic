
public class P87Q3_3 {

	public static void main(String[] args) {
		boolean su01 = true; // 참
		boolean su02 = false; // 거짓
		int k =0;
		
		// AND연산자
		System.out.println(su01&&su02); // 1. && 양쪽이 다 ture시 참
		System.out.println(su01||su02); // 2. || 둘 중 한개 이사이 true시 참
		
		// NOT연산자
		System.out.println(!su01); // 3
		System.out.println(!(!su01)); //4
		
		k = (su01 && su02) ?0:3;
		k = (k != 0) ? 10 : 5;
		
		k %= 10; // 5
		System.out.println(++k);
	}

}
