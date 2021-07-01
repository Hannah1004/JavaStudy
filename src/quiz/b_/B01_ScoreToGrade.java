package quiz.b_;

import java.util.Scanner;

public class B01_ScoreToGrade {

	public static void main(String[] args) {
		int score;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요>> ");
		score = scan.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("옳바른 점수 입력값이 아닙니다.");
		}else if(score >=90) {
			System.out.println("당신은 A등급 입니다");
		}else if(score >=80) {
			System.out.println("당신은 B등급 입니다");
		}else if(score >=70) {
			System.out.println("당신은 C등급 입니다");
		}else if(score >=60) {
			System.out.println("당신은 D등급 입니다");
		}else {
			System.out.println("당신은 F등급 입니다");
		}
		
	}
}
