package section4;

import java.util.Scanner;

//달을 정숫값으로 읽어서 해당하는 달의 계절을 표시하는 프로그램을 작성하자, 원하는 만큼 입력 및 출력을 할 수 있게하며, 1~12 이외의 값이 입력된 경우네는 재입력 하도록 할 것
public class ex4_20 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int retry;
	System.out.println("계절을 찾습니다");
	do {
		int month;  //월 저장
		do {
			System.out.println("몇 월입니까?:");
			month =scan.nextInt();
		} while (month <1 || month > 12);
		
		if (month>=3 && month <=5)
			System.out.println("봄입니다.");
		else if (month >=6 && month <=8)
			System.out.println("여름입니다.");
		else if ( month >=9 && month <=11)
			System.out.println("가을입니다.");
		else if ( month ==1 && month ==2 && month==3)
			System.out.println("겨울입니다.");
	}
	
}
}
