package answer;

import java.util.Scanner;

public class B09_Count369_2 {

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
		
		for(int i = 1; i <= num; i++) {			
			int checkNum = i;
			
			System.out.printf("[%d]\t:", checkNum);
			
			while(checkNum != 0) {
				int digit = checkNum % 10;
				
				if(digit != 0 && digit % 3 == 0) {
					System.out.println("짝");
					count++;
				}
				
				checkNum /= 10;
			}
			System.out.println();
		}
		System.out.printf("박수는 총 %d회 쳤습니다.\n",count);
	}

}
