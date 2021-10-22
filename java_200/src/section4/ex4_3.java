package section4;

import java.util.Random;
import java.util.Scanner;

//2자리의 정숫값을 맞추는 숫자 맞추기 게임을 만들자, 난수 생성과 if문 그리고 do문을 사용
public class ex4_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int no = 10 + rand.nextInt(90); // 맞춰야 하는 숫자 : 10~ 99 난수 생성
		System.out.println("게임을 시작하겠습니다");
		System.out.println("1~99의  숫자를 맞추세요");
		int x;
		do {
			System.out.println("어떤 숫자일까요?");
			x = scan.nextInt();
			if (x < no) {
				System.out.println("더 큰 숫자입니다.");
			} else if (x > no) {
				System.out.println("더 작은 숫자입니다.");
			}

		} while (x != no);
		System.out.println("정답입니다");
	}
}
