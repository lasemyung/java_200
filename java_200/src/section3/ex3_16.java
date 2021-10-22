package section3;

import java.util.Scanner;

//키보드에서 입력한 3개의 정숫값 중 중앙값을 구해서 표시하는 프로그램을 작성하자. 
public class ex3_16 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요");
		int a =scan.nextInt();
		int b =scan.nextInt();
		int c =scan.nextInt();
		
		int mid =a;
		if ( a>=b)
			if(b>=c)
				mid=b;
			else if(a<=c)
				mid=a;
			else
				mid=c;
		else if(a>c)
			mid=a;
		else if( b>c)
			mid =c;
		else
			mid=b;
		System.out.println("중앙값은"+ mid + "입니다.");
	}
}
