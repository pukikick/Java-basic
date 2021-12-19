
public class ForQ8P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		//     *
		//    **
		//   ***
		//  ****
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		// 힌트 : 띄어쓰기를 3/2/1/개순으로 적는 반목문 하나와
		//       *을 1/2/3/4개순으로 적는 반복문 하나 해서
		//       i반목문 내부에 j,k 총 2개의 반복문이 추가로 돕니다.
		for ( int i=1;i<=4;i++) {
			for ( int k=0;k<4-i;k++){//for ( int k=3;k>0;k--)
				                     // 이거 틀림
				System.out.print(" ");
			}
			for ( int j=0;j<i;j++) { // i=1이면 k실행+j실행
				System.out.print("*");
				}
			System.out.println();
			}
		}
	}		
