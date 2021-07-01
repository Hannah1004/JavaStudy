package quiz.c_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C16_InputRightThing {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("숫자를 입력해주세요.(숫자만!!)");
				num = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("다른 형태를 입력하셨네요. 정수만 입력해주세요!!!!");
				scan = new Scanner(System.in);
			}
		}
		System.out.println("숫자를 입력하셨습니다. 프로그램을 종료합니다.");
	}
}
