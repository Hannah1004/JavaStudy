package study.a_;
import java.util.Scanner;

public class A09_Operator02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // ctrl + shift + o
		
		/*
			비교 연산자
				- 두 값을 비교하면 연산
				- 비교 연산의 결과는 boolean 타입
				- 산술 연산과 비교 연산이 함께 있으면 산술 연산을 먼저 계산
		 */
		int a = 10, b = 7;
		
		System.out.println(a>b);
		System.out.println(a<b);
		
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		System.out.println(a==b);
		System.out.println(a!=b);
		
		/*
			논리 연산자
				- boolean 타입 값으로 하는 연산
				- 비교연산과 논리연산이 함께 있으면 비교 연산을 먼저 계산한다
				- && : 양 옆의 값이 모두 true일 때만 true
				- || : 양 옆의 값 중 하나만 true여도 true
				- ! : true면 false, false면 true
	 */
		System.out.println("true && true: "+(true && true));
		System.out.println("true && false: "+(true && false));
		System.out.println("false && true: "+(false && true));
		System.out.println("false && false: "+(false && false));
		
		System.out.println("true || true: "+(true || true));
		System.out.println("true || false: "+(true || false));
		System.out.println("false || true: "+(false || true));
		System.out.println("false || false: "+(false || false));
		
		System.out.println(!true);
		System.out.println(!false);
		
		int c = 53;
		
		System.out.print("c가 짝수");
		System.out.println(c % 2 == 0);
		
		System.out.print("c가 홀수");
		System.out.println(c % 2 == 1);
		System.out.println(!(c % 2 == 0));
		System.out.println(c % 2 != 0);
		
		System.out.print("c가 짝수이면서 50보다 큰가?");
		System.out.println(c % 2 == 0 && c > 50);
		
		System.out.print("c가 짝수이거나 50보다 큰가?");
		System.out.println(c % 2 == 0 || c > 50);
		
		//변수 x y z 가 모두 3의 배수가 아닐때 true
		int x = 5, y = 8, z = 11, k = 12;
		System.out.println(x % 3!=0 && y % 3!=0 && k % 3!=0);
		System.out.println(x % 3!=0 && y % 3!=0 && z % 3!=0);
	}

}







