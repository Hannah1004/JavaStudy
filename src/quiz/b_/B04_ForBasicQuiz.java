package quiz.b_;

import java.util.Scanner;

public class B04_ForBasicQuiz {

	public static void main(String[] args) {
		
		int num, q1=10, q2=1000;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 하나를 입력해주세요>> ");
		num = scan.nextInt();
		
		if(num>=q1) {
			for(int i = q1; i <= num;i++) {
				sum += i;		
			}
		}else {
			for(int i = num; i <= q1;i++) {
				sum += i;		
			}
		}		
		System.out.printf("입력한 숫자까지의 합은 %d입니다.\n",sum);
		
		
		
		if(num>=q2) {
			for(int i = q2; i <= num;i++) {
				System.out.println("i의 값은:"+i);	
			}
		}else {
			for(int i = num; i <= q2;i++) {
				System.out.println("i의 값은:"+i);			
			}
		}
		
		
		if(num<1) {
			System.out.println("배수가 없는 음수입니다");
		}
		for(int i = 1; i <= num;i++) {
			if(i%5==0) {
				System.out.printf("5의배수 %d 입니다 \n",i);
			}
		}
		
	}

}
