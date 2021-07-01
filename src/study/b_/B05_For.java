package study.b_;

public class B05_For {

	public static void main(String[] args) {
		
		/*
			for(초기값; 반복조건; 증가폭){
				가운데에 있는 반복조건이 true인 동안 반복될 명령어들을 적는 곳
			}
		 */
		/*
			가장 기본적인 형태의 for문
				- 초기값에는 0을주고 조건에는 반복하고 싶은 횟수를 적는다
				- 증가는 1씩 한다
				- 원하는 횟수만큼 반복하기 가장 좋은 형태의 for문
		 */
		for(int i = 5; i <= 22; ++i) {
			System.out.println("Hello World! "+i);
		}
		
		/*
			초기값 증가값 조건은 마음대로 변경할 수 있다			
		 */
		for (int i = 100; i > 0; --i) {
			System.out.println("Hello World! "+i);
		}
		
		/*
			초기값과 증가값의 위치는 마음대로 변경할 수 있다
		 */
		int a = 123;
		for(; a<234;) {
			a += 5;
			System.out.println("Hello! "+a);
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		
		for (int month = 1; month <= 12; ++month) {
			String season;
			
			
		}
	}

}




