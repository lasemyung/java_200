package section4;

import java.util.Scanner;

// 입력한 정숫값의 모든 약수와 그 개수를 구하는 프로그램을 작성하라
public class ex4_18 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("정숫값을 입력하세요");
	int a = scan.nextInt();
	
	int count =0;
	for(int i=1; i <a; i++)
		if(a%i ==0) {  //a의 나머지가 0이면 카운트를 하나 올린다
		System.out.println(i+"");
		count++;
		}
	System.out.println("\n의 약수는" +count+"개입니다."); //약수의 개수를 표시한다.
}

}
