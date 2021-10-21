package section2;

import java.util.Random;

// 한자리 양의 정수 값( 1~9 ) 을 랜덤으로 생성해서 표시
	// 두자리 음의 정숫값 ( -9~-1 ) 을 랜덤으로 생성해서 표시
	// 두자리 양의 정숫값을 랜덤으로 생성해서 표시
public class ex2_11 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int x1 = 1 + random.nextInt(9);
		int x2 = -1 -random.nextInt(9);
		int x3 = 10 + random.nextInt(90);
		
		System.out.println("x1의 값은" + x1);
		System.out.println("x2의 값은" + x2);
		System.out.println("x3의 값은" + x3);
	}
}
