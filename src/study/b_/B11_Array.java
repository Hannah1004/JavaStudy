package study.b_;

public class B11_Array {

	public static void main(String[] args) {
		/*
			배열
				- 변수와는 다르게 생성과 동시에 초기화 되어있음
				  (정수: 0 실수: 0.0 boolean: false 참조형: null)
				- 크기가 정해지면 크기를 변경할 수 없음
				- 방번호는 0부터 길이-1까지
		 */
		
		int randomNum[] = new int[100];

		System.out.println("배열길이:"+ randomNum.length);
		System.out.println("마지막 인덱스번호:"+(randomNum.length -1));
		
		/*
			벼열 선언 방법
			
				1. 타입[] 변수명 = new 타입[크기];
				2. 타입[] 변수명 = {값1, 값2, 값3};
				3. 타입[] 변수명 = new 타입[] {값1, 값2, 값3};
		 */
		int[] numbers = new int[10];
		char[] blackList = {'#','@','&','^','\\',65,111};
		
		//배열은 반복문과 쓰기에 최적화 되어있음
		for(int i = 0; i < blackList.length; i++) {
			System.out.println(blackList[i]);
		}
		
		//String은 char[]로 변환할 수 있다
		char[] hello = "Hello World!".toCharArray();
		for(int i=0; i<hello.length; i++) {
			System.out.println(hello[i]);
		}
	}

}









