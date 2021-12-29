package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		Map<String, Integer> map = new HashMap<>(); 
		// Object은 모든 자료형 사용가능(하지만 권장하지는 않는다)
		map.put("공기밥", 1000);
		map.put("김치찌개", 8000);
		map.put("된장찌개", 8000);
		map.put("순두부찌개", 8000);
		map.put("삼겹살", 12000);
		System.out.println(map);
		
		System.out.println("김치찌개 가격 : "+map.get("김치찌개"));
		System.out.println("공기밥 가격 : "+map.get("공기밥"));
		System.out.println("삼겹살 가격 : "+map.get("삼겹살"));
	}

}
