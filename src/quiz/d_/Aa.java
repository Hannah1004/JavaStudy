package quiz.d_;

public class Aa {
	public static void main(String[] args) {
		String number = "960520-1ㅇ99611";
		for (int i = 0; i < number.length(); i++) {
			char ch = number.charAt(i);
			if ((i == 0 || i == 1) && !Character.isDigit(ch)) {
				System.out.println("맨앞 두자리가 숫자가 아닙니다.");
				break;
			} else if (i > 6 && !Character.isDigit(ch)) {
				System.out.println("뒤의 7자리는 전부 숫자여야합니다.");
				break;
			}else {
				System.out.println("gg");
			}
		}
	}
}
