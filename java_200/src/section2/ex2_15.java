package section2;

import java.util.Scanner;

// 입력한 주소를 표시하는 프로그램을 작성
public class ex2_15 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("차례대로 시,구,동을 입력해주세요");
		String a = scan.nextLine();
		String b = scan.nextLine();
		String c = scan.nextLine();
		
		System.out.println("주소는 " + a +" " + b+" " + c + " 입니다.");
	}
}

//next()는 하나의 변수 입력시 띄어쓰기 안됨, nextLine()은 띄어쓰기 포함해서 입력 가능,,
