package quiz.b_;

import java.util.Scanner;

public class B07_Prime {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);	
		for(;;) {
			System.out.print("숫자 하나를 입력하세요>> ");
			num = scan.nextInt();
			if(num<=0) {
				System.out.println("양수가 아닙니다 다시 입력해주세요");
			}else {
				break;
			}
		}
		for(int i=1; i<=num; i++) {
			if(!(i%2==0 || i%3==0 || i%5==0 || i%7==0)) {
				System.out.printf("소수: %d입니다\n",i);
			}
		}
	}
}
