package quiz.a_;

import java.util.Scanner;

public class A06_CelToFahr {

	public static void main(String[] args) {
		double cel,fahr;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("섭씨 온도를 입력해주세요 >> ");
		cel = scan.nextDouble();
		fahr = (cel*1.8)+32;
		
		System.out.printf("화씨 온도는 %.1fF 입니다",fahr);
	}

}
