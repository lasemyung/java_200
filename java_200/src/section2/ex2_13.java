package section2;

import java.util.Random;

// 0.0이상 1.0미만의 실숫값을 랜덤으로 생성해서 표시
	// 0.0이상 10.0미만의 실숫값을 랜덤으로 생성해서 표시
	// -1.0 이상 1.0미만의 실숫값을 랜덤으로 생성해서 표시
public class ex2_13 {
	public static void main(String[] args) {
		Random rand=new Random();
		
		double x1= rand.nextDouble();
		double x2= rand.nextDouble() * 10;
		double x3= -1 + rand.nextDouble();
	
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
	}
}
