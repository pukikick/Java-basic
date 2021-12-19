package constructor;

public class Main03P204 {

	public static void main(String[] args) {
		Webtoon a = new Webtoon("마음의 소리","신은택");
		a.getInfo();
		
		// series 1회차 반영
		a.uplodWebtoon();
		a.uplodWebtoon();
		a.uplodWebtoon();
		a.uplodWebtoon();
		a.uplodWebtoon();
		a.uplodWebtoon();
		a.uplodWebtoon();
		a.uplodWebtoon();
		a.getInfo();
		
		// complete true로 번경
		a.completeWebon();
		a.getInfo();
	}
}
