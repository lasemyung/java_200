package section4;

//읽은 갯수만큼 *를 표시하는 문제 4-11을 변경해서 5개 단위로 줄 바꿈해서 표시하는 프로그램을 작성
import java.util.Scanner;

public class ex4_17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇개의 *를 표시할까요?");
		int a = scan.nextInt();

		if (a > 0) {
			for (int i = 0; i < a; i++) {
				System.out.print('*');
				if (i % 5 == 4) 
					System.out.println();
			}
			if ( a%5 !=0)
				System.out.println( );
		}
	}
}