package section3;

import java.util.Random;
import java.util.Scanner;

// 0,1,2중 하나의 난수를 생성해서 0이면 가위, 1이면 바위, 2이면 보를 표시하는 프로그램을 작성
public class ex3_20 {
	public static void main(String[] args) {
		Random rand =new Random(); 

		int a=rand.nextInt(3);
		
		switch(a) {
			case 0: System.out.println("가위"); break;
			case 1: System.out.println("바위"); break;
			case 2: System.out.println("보"); break;
			
		}
	}
}
