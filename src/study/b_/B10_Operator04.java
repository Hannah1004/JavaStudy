package study.b_;


public class B10_Operator04 {

	public static void main(String[] args) {
		// 삼항 연산자 
		// 조건 ? 예: 아니오;
		
		int apple = 15;
		int basket = apple % 10 !=0 ? apple / 10 +1 : apple / 10;
		
		char ch = '0';
		String msg = ch >='A' && ch <= 'Z' ? "대문자입니다" : "대문자가 아닙니다.";
		
		System.out.println(basket);
		System.out.println(msg);
	}

}
