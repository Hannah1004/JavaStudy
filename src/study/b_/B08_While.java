package study.b_;

public class B08_While {

	public static void main(String[] args) {
		
		/*
			while
				- for문과 사용법이 약간 다른 반복문
				- 초기값과 증가값의 위치가 정해져 있지 않다.
				- ()안의 조건이 참인 동안  {}안의 내용을 반복한다
		 		- 증가값의 위치에 따라 프로그램 실행이 달라질 수 있으므로 주의 
		 */
		int i = 0;
		
		while(i < 10) {
			++i;
			System.out.println(i);
		}
		
		i = 0;
		
		while(++i < 10) {
			System.out.println(i);
		}
		
		while(true) {
			System.out.println(++i);
			
			if(i == 140) {
				break;
			}
		}
	}

}






