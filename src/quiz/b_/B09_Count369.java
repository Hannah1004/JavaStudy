package quiz.b_;

import java.util.Scanner;

public class B09_Count369 {

	public static void main(String[] args) {
		// 정수 하나를 입력받은 후 해당숫자까지 369게임을 하면 박수를 총 몇 번 쳐야하는가 33이면 2번 333이면 3번
		int num, count=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력하세요>> ");
		while(true) {
			num = scan.nextInt();
			if(num <= 0) {
				System.out.print("음수아닌 숫자를 입력해주세요>> ");
				continue;
			}
			break;
		}
		
		String str = ""+num;
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j<str.length(); j++) {
				if(str.charAt(j)=='3' ||str.charAt(j)=='6' ||str.charAt(j)=='9') {
					count++;
				}
			}
		}
		System.out.println("count= "+count);
	}

}
