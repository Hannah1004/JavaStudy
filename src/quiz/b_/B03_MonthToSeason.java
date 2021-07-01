package quiz.b_;

import java.util.Scanner;

public class B03_MonthToSeason {

	public static void main(String[] args) {
		int month;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("현재 달을 입력해주세요>> ");
		month = scan.nextInt();
		
		switch(month) {
		case 12: case 1: case 2: 
			System.out.println(month+"월은 겨울입니다");
			break;
		case 3: case 4: case 5:
			System.out.println(month+"월은 봄입니다");
			break;
		case 6: case 7: case 8:
			System.out.println(month+"월은 여름입니다");
			break;
		case 9: case 10: case 11:
			System.out.println(month+"월은 가을입니다");
			break;
		default:
			System.out.println("잘못된 월을 입력했습니다");
		}

	}

}
