package section2;
	// 3개의 int형 변수에 각각 값을 대입해서 합계와 평균을 구하는 프로그램을 작성하자
public class ex2_4 {
	public static void main(String[] args) {
		int x = 10;
		int y = 3;
		int z = 15;
		
		System.out.println("x값은" + "x" + "입니다.");
		System.out.println("y값은" + "y" + "입니다.");
		System.out.println("z값은" + "z" + "입니다.");
		System.out.println("합계는" + (x+y+z) + "입니다.");
		System.out.println("평균은" + (x+y+z)/3 + "입니다.");
		
		int sum=x+y+z;
		
		System.out.println("합계는" + sum + "입니다.");
	}
}
