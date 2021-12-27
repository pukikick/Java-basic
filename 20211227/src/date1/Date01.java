package date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// Date는 널짜를 표현하는 클래스로 DB등과 통신할 때
		// Date를 이용해 날짜자료를 받아오거나 넘겨주는 것이 권장됩니다.
		// 사용시 import java.util.Date를 해야합니다.
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(now);
		System.out.println(strNow);
		
		// 표현되는 양식을 바꿀 때 SimpleDateFormat을 활용합니다.
		// import를 추가로 해야합니다. ctrl + space를 활용해주새요.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM"); // 양식을 넣어줘야함
				                     // yyyy는 연도, MM은 월, dd는 일, hh는 시, mm은 분, ss는 초;
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		// now 변수에 들어있는 출력양식을 2021년 12월 27일 aa시 bb분cc초로 변경해서 콘솔에 찍어주세요.
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일, hh시 mm분 ss초 기준시 : z");
		String strNow3 = sdf1.format(now);
		System.out.println(strNow3);

	}

}
