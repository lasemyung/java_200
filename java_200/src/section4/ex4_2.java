package section4;

import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

//3자리 양의 정수값을 읽는 프로그램을 작성하라 (입력한 값이 3자리 값이 아니면 다시 입력)
public class ex4_2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	int a;
	do {
		System.out.println("3자리 정수값 입력하세요");
		 a=scan.nextInt();
	} while( a<100 || a>999);
	System.out.println("입력한 값은"+a+"입니다.");
}
}
