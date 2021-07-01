package quiz.b_;

import java.util.Scanner;

public class B09_GCD {

	public static void main(String[] args) {
		//최대공약수 
		
		int num1, num2, max; 
		int gcd=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 2개를 입력하세요>> ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if(num1 >= num2) {
			max = num1;
		}else {
			max = num2;
		}
		//int max = Math.max(num1, num2); 최대값구하는 함수
		//int min = Math.min(num1, num2); 최소값구하는 함수
		
		for(int i=1; i<=max; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		
		System.out.printf("%d와 %d의 최대공약수는 %d입니다",num1,num2,gcd);
	}

}
