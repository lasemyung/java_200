package section3;

import java.util.Random;

//월을 1~12의 정숫값으로 읽어서 해당하는 계절을 표시하는 프로그램을 작성하자
public class ex3_21 {
public static void main(String[] args) {
	Random rand =new Random(); 

	int a=rand.nextInt(12) +1;
	
	switch(a) { 
	case 3,4,5 : System.out.println("봄"); break;
	case 6,7,8 : System.out.println("여름"); break;
	case 9,10,11 : System.out.println("가을"); break;
	case 12,1,2 : System.out.println("겨울"); break;
	default : System.out.println("그런 월은 없습니다."); break;
	}
}
}
