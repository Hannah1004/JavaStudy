package quiz.a_;

import java.util.Scanner;

public class A06_GeussAge {

	public static void main(String[] args) {
		int userYear;
		int nowYear;
		int userAge;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력해주세요 >>");
		userYear = scan.nextInt();
		System.out.print("현재 년도를 입력해주세요 >>");
		nowYear = scan.nextInt();
		
		userAge = nowYear-userYear+1;
		System.out.println("당신의 나이는 "+userAge+"입니다");
	}

}
