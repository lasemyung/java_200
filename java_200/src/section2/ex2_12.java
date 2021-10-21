package section2;
  import java.util.Random;
//키보드에서 입력한 정숫값을 +5 또는 -5 범위의 랜덤 정숫값을 생성해라
import java.util.Scanner;

public class ex2_12 {
	public static void main(String[] args) {
		Random random =new Random();
		Scanner scan =new  Scanner(System.in) ;
		System.out.println("정숫값을 입력하세요");
		int x =  + scan.nextInt();
		
		System.out.println("x의 값은" + (x-5 + random.nextInt(11)) + "입니다.");
	}
}
