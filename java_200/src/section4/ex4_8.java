package section4;

import java.util.Scanner;

//읽은 값의 갯수만큼 '*'와 '+'를 번갈아가며 표시하는 프로그램을 작성 (마지막 줄에는 줄바꿈 문자를 출력)
public class ex4_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int a =scan.nextInt();
		
		if( a>0) {
			int i=0;
			while( i<a) {
				if(i%2==0) 
					System.out.print('*');
				else 
					System.out.print('+');
				i++;
			}
			System.out.println();
		}
	}
}
