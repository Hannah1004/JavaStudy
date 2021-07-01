package quiz.d_;

import java.util.Scanner;

public class D07_CheckValidSocialNumber {
	Scanner scan;
	boolean check = true;

	boolean checkRule(String number) {
		if (number.length() != 14) {
			System.out.println("주민등록번호 14자리가 아닙니다.");
		} else if (number.charAt(6) != '-') {
			System.out.println("주민등록번호 중간에 -가 없습니다.");
		} else if (number.charAt(2) > '1') {
			System.out.println("태어난 달의 앞자리가 2가 될 수 없습니다.");
		} else if (number.charAt(2) == '0' && number.charAt(3) == '0') {
			System.out.println("00월에 태어날 수 없습니다.");
		} else if (number.charAt(2) == '1' && number.charAt(3) > '2') {
			System.out.println("12월 이상의 달은 없습니다.");
		} else {
			for (int i = 0; i < number.length(); i++) {
				char ch = number.charAt(i);
				if ((i == 0 || i == 1) && !Character.isDigit(ch)) {
					System.out.println("맨앞 두자리중 하나가 숫자가 아닙니다.");
					return true;
				} else if (i > 6 && !Character.isDigit(ch)) {
					System.out.println("뒤의 7자리는 전부 숫자여야합니다.");
					return true;
				}
			}
			return false;
		}
		return true;
	}

	void monthCheck(String number) {
		int year = Integer.parseInt(number.substring(0, 2));
		int month = Integer.parseInt(number.substring(2, 4));
		int day = Integer.parseInt(number.substring(4, 6));

		if (month==2 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			if (day > 29) {
				System.out.println("윤년에는 29일 초과할 수 없습니다.");
			}else {
				check = false;
			}
		} else if (month==2 && (year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
			if (day > 28) {
				System.out.println("2월은 28일 초과할 수 없습니다.");
			}else {
				check = false;
			}
		} else if (month < 8 && month % 2 != 0 && day > 31) {
			System.out.println("해당 월에 일 수는 31일을 넘길 수 없습니다.");
		} else if (month < 8 && month % 2 == 0 && day > 30) {
			System.out.println("해당 월에 일 수는 30일을 넘길 수 없습니다.");
		} else if (month >= 8 && month % 2 == 0 && day > 31) {
			System.out.println("해당 월에 일 수는 31일을 넘길 수 없습니다.");
		} else if (month >= 8 && month % 2 != 0 && day > 30) {
			System.out.println("해당 월에 일 수는 30일을 넘길 수 없습니다.");
		} else {
			check = false;
		}

	}

	void checkStart() {
		String number = null;
		while (check) {
			scan = new Scanner(System.in);
			System.out.println("주민등록번호를 입력해 주세요.");
			number = scan.nextLine();
			if(checkRule(number)) {
				continue;
			}
			monthCheck(number);
		}
		System.out.println("주민등록번호: " +number+"를 입력받았습니다.");
	}

	public static void main(String[] args) {
		new D07_CheckValidSocialNumber().checkStart();
	}
}
