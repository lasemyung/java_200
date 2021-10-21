package section2;

import java.util.Scanner;

//키보드에서 입력한 정숫값에서 마지막 자릿수를 제외한 값과 마지막 자릿수 값만 표시하는 프로그램을 작성
public class ex2_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("정숫값 입력");
		int x = scan.nextInt();
		
		System.out.println("마지막 자릿수를 제외한 값은" + (x/10) + "입니다.");
		System.out.println("마지막 자릿수는" + (x%10) + "입니다.");
	}
}
