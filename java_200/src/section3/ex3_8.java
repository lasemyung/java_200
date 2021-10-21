package section3;

import java.util.Scanner;

//일정한 정숫값이 5로 나누어떨어지면 " 이 값은 5로 나누어집니다"라고 표시하고 그렇지 않으면 "이 값은 5로 나누어지지 않습니다." 라고 표시하는 프로그램
public class ex3_8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a =scan.nextInt();
		
		if ( a >0)
			if ( a%5==0)
				System.out.println("이 값은 5로 나누어 집니다");
			else
				System.out.println("이 값은 5로 나누어지지 않습니다");
		else
			System.out.println("이 값은 음수입니다");
	}
}
