package section2;

import java.util.Scanner;

// 키보드로 입력한 성과 이름으로 인사하는 프로그램을 작성
public class ex2_14 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("차례대로 성과 이름을 입력하세요");
		String a =scan.next();
		String b =scan.next();
		
		System.out.println("성은 " +  a + "이고" + " 이름은 " + b + " 입니다.");
	}
}
