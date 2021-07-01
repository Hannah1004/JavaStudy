package study.b_;

public class B04_Operator03 {

	public static void main(String[] args) {
		
		/*
			대입 연산자
				= : 왼쪽의 변수에 오른쪽의 값을 대입한다
			
			복합 대입 연산자
		 */
		
		int num = 10;
		
		System.out.println(num += 5);
		System.out.println(num -= 3);
		System.out.println(num *= 5);
		System.out.println(num /= 5);
		System.out.println(num %= 5);
	}

}
