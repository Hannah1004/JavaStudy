package study.b_;

public class B09_Random {

	public static void main(String[] args) {
		/*
			무작위 숫자
				- Math.Random();
					0 <= x < 1 double 타입 랜덤 소수
					
					1. 생성된 랜덤 소수에 원하는 숫자의 개수를 곱한다 (10-100)
					2. 원하는 숫자 중 가장 작은 숫자를 더한다
					3. 소수점 삭제 (int)
				- Random 클래스 사용

		System.out.println(Math.random());
		for(int i = 0; i < 10; i++) {
			System.out.println((int) (Math.random() * 91 + 10));
		}
		 */		
		
		//연습문제
		for(int i = 0; i < 7; i++) {
			System.out.println((int) (Math.random() * 45 + 1));
		}
	}

}
