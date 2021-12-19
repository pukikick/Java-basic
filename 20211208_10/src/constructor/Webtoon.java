package constructor;

public class Webtoon {
	public String name; // 제목
	public int series; // 회차
	public String painter; // 작가
	public boolean complete; // 완결여부
	
	public Webtoon(String n, String p) { // 이거 틀림
		name = n;
		series = 1; // 모든웹툰은 첫 회차가 1회차이므로
		painter = p;
		complete = false; // 연재작은 처음에는 미완결 상태임
	}
	// 클래스 내부에서 메서드 만드는 방법
	// public 리턴자료형(int, void등) 메서드명(요구할자료들...){
	      // 실행할 내용들...;
	// }
	
	public void getInfo() {
		System.out.println("제목: "+name+", 회차: "+series+", 작가: "+painter+", 완결여부: "+complete);
	}
	// 회차가 진행될 때 마다 series를 1씩 올려줍니다.
	public void uplodWebtoon() {
		series += 1;
	}
	public void completeWebon() {
		complete = true;
	}

}
