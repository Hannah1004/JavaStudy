package answer;

import java.util.Arrays;

public class C01_FunctionQuiz2 {
	/*
	 	# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요2
	 	
	 		1. 최대값을 매개변수로 전달받으면
	 		   0부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성하여 반환하는
	 		   range 함수를 만들어보세요
	 		   
	 		   ex : range(10)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 		   
	 		2. 최소값과 최대값을 매개변수로 전달받으면
	 		   최소값 부터 최대값 미만의모든 정수값을 포함하는 int배열을 생성하여 반환하는
	 		   range 함수를 만들어보세요
	 		   
	 		   ex : range(5, 10)의 결과 -> [5, 6, 7, 8, 9]
	 		   
	 		3. 최소값과 최대값과 증가값을 매개변수로 전달받으면
	 		   최소값부터 최대값 미만까지 증가값만큼 증가하는 int배열을 생성하여 반환하는
	 		   range 함수를 만들어보세요
	 		   
	 		   ex : range(40, 50, 3)의 결과 -> [40, 43, 46, 49]
	 		   		range(40, 45, 5)의 결과 -> [40]
	 */
	public static void main(String[] args) {
		range(7);
		System.out.println();
		range(19,10);
		System.out.println();
		range(1, 99, 3);
		
	}
	
	/*
	 	# 함수 오버로딩(overloading)
	 		- 매개변수의 개수 또는 타입이 다르면 똑같은 함수명을 사용할수있다.
	 */
	public static int[] range(float num) {
		// println()에는 다양한 타입들의 오버로딩이 존재한다.
		// 가로()안에 각각 다른 타입을 넣을 수 있도록 오버로딩이 존재한다.
		System.out.println();
		System.out.println(123);
		System.out.println("123");
		System.out.println('A');
		
		return null;
	}
	
	public static int[] range(int num) {
		int[] maxNum = new int[num];
		for(int i = 0; i < num; ++i) {
			maxNum[i] = i;
		}
		System.out.println(Arrays.toString(maxNum));
		return maxNum;
	}
	
	public static int[] range(int start, int end) {
		
		int increase = start > end ? -1 : 1;
		int[] midNum = new int[increase < 0 ? start - end : end - start];
		
		for(int value = start, index = 0; value != end; value += increase) {
			midNum[index++] = value;
		}
		System.out.println(Arrays.toString(midNum));
		
		return midNum;
	}
	
	/**
	  	문서화 주석 (이 기능에 대한 설명을 할 수있다.)(/** 별 두개 사용)
	 
	 	@start : 시작하는 값을 넣으세요
	 	@end : 끝나는 값을 넣으세요
	 	@param increse
	 	@return : 잘못된 값을 넣으면 null이 나오고, 제대로 넣으시면 int[]가 나옵니다.
	 */
	public static int[] range(int start, int end, int increase) {
		if(increase < 0 && start <= end) {
			return null;
		}else if(increase > 0 && start >= end) {
			return null;
		}else if(increase == 0) {
			return null;
		}
		
		int size;
		if(increase > 0) {
			int range = end - start;
			size = start % increase == 0 ? range /increase : range / increase + 1;
		}else {
			int range = start - end;
			size = start % (increase * -1) == 0 ?
					range / (increase * -1) : range / (increase * -1) + 1;
		}
		
		int[] arr = new int[size];
		
		for(int value = start, index = 0; 
				increase > 0 ? value < end : value > end; value += increase) {
		
			arr[index++] = value;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		return arr;
	}

}
