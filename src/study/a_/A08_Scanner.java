package study.a_;

import java.util.Scanner;

public class A08_Scanner {
	public static void main(String args[]) {
		/*
		 	Scanner 클래스
		 		- 프로그램 외부로부터 입력을 받을 수 있는 기능들이 있는 클래스
		 		- 어디에서 입력을 받을지 결정한 뒤에 다양한 값들을 입력받을 수 있다
				- System.in 으로부터 입력받는 새로운 스캐너를 하나 생성한다
		 		- 그 후 Scanner 타입 변수 sc에 생성한 스캐너를 담아 놓는다
		 */

		Scanner sc = new Scanner(System.in);
		
		//정수형
		System.out.print("정수를 입력해보세요>");
		int num = sc.nextInt();		
		System.out.println("입력한 값은 "+num+"입니다");
		
		//실수형
		System.out.print("실수를 입력하세요>");
		double d =sc.nextDouble();
		System.out.printf("입력한 소수는 %.5f입니다.",d);	
		
		//문자열(next()는 공백을 기준으로 입력받고, nextLine()은 \n을 기준으로 입력)
		System.out.print("문자열을 입력하세요>> ");
		String str = sc.next();
		System.out.println("당신 : "+str);
		
		System.out.print("문자열을 입력하세요>> ");
		String str2 = sc.nextLine();
		System.out.println("당신 : "+str2);
	}
}










