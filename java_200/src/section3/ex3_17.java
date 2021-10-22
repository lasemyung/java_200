package section3;

import java.util.Scanner;

// 키보드에서 입력한 2개의 정숫값 중 작은 값과 큰 값을 표시하는 프로그램을 작성하자, 두 정숫값이 같으면 "두 값이 같습니다"라고 표시한다
public class ex3_17 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("2개의 정수를 입력하세요");
	int a =scan.nextInt();
	int b =scan.nextInt();
	
	if(a==b) {
		System.out.println("두 정숫값이 같습니다");
	} else {
		int min,max;
	if(a <b) {
		min =a;
		max=b;
	} else {
		min=b;
		max=a;
	}
	System.out.println("작은 값은"+min+"입니다.");
	System.out.println("큰 값은"+max+"입니다.");
	}

}
}
