package study.a_;

public class A06_Operator01 {

	public static void main(String[] args) {
		/*
		 	연산자
		 		- 계산할 떄 사용
		 		- +,-,*,/...
		 */
		//산술 연산자
		int a = 10, b = 7;
		double c = 7.0;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//정수 나누기 정수의 결과는 몫만 나옴
		//정확한 나누기 결과를 원하면 나누기에 실수 타입이 포함되어 있어야함
		System.out.println("a / b:"+a/b);
		System.out.println("a / c:"+a/c);
		System.out.println("a / b:"+a/(double)b);
		
		System.out.println("a / b:"+a/b);
		
		//나머지 연산
		System.out.println("a % b = "+a%b);
		System.out.println("b % a = "+b%a);
		
		//^는 제곱이 아님
		System.out.println(10^2);
		System.out.println(10^3);
		System.out.println(10^4);
		
		//Math.pow(a, b) : a의 b제곱을 계산하여 반환해주는 함수
		System.out.println(Math.pow(10, 2));
		System.out.println(Math.pow(10, 3));
		System.out.println(Math.pow(10, 4));
	}

}









