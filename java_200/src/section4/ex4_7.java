package section4;

import java.util.Scanner;

//입력한 값의 갯수만큼 *를 표시하는 프로그램을 작성하자, 마지막에는 줄바꿈을 출력할 것, 단 읽은 값이 1미만이면 줄바꿈 문자를 표시해선 안된다
public class ex4_7 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("정수를 입력해주세요");
	int a =scan.nextInt();
	if(a>0) {
		int i =0;
		while(i<a) {
			System.out.print('*');
			i++;;
		}
		System.out.println();
	}
}
}
