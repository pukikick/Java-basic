package io1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class File01P674 {

	public static void main(String[] args) throws IOException {
		// 외부에 텍스트파일을 만들기 위해서 FileOutputStream을 사용합니다.
		// 변수를 만들고 거기에 파일 경로를 적습니다.
		// main메서드에 반드시 throws IOException을 작성해야 합니다.
		// FileOutputStream output = 
		// 	    	new FileOutputStream("c:/io/test.txt");
		

		// 간편한 사용을 위해 FileOutStream 자료형 대신
		// FileWriter 자료형을 쓸 수 있습니다.
		FileWriter output = new FileWriter("c:/io/test.txt");
		
		// .write("내용")을 이용해 메모장 내부에 필기할 수 있다.
		// 단, 줄바꿈이 자동으로 안 되기 때문에 줄바꿈이 필요한 부분에
		// \n을 추가로 붙여주시면 됩니다.
		output.write("123"); // 메모장에 필기
		
		// 저장까지 해 줘야 내용이 적힌 파일이 남습니다.
		output.close();
	}

}
