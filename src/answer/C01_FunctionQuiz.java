package answer;

import java.util.Arrays;

public class C01_FunctionQuiz {
	/*
	 	# 다음 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 */
	public static void main(String[] args) {
	/*	# 1번 응용
		String str = "한글 hanguel";
		
		for(int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			
			if(isAlphabet(ch)) {
				System.out.println(i + "번째 문자는 영어입니다.");
			}else {
				System.out.println(i + "번째 문자는 영어가 아닙니다.");
			}
		}
	*/
		System.out.println("1번 : " + isAlphabet('A'));
		
		System.out.println("2번 : " + isMul3(4));
		
		System.out.println("3번 : " + oddEven(4));
		
		System.out.println("4번 : " + Arrays.toString(allYaksu(10)));
		
		System.out.println("5번 : " + isPrime(10));
		
		System.out.println("6번 : " + factorial(3));
		
		System.out.println("6-1번(재귀) : " + recursive_factorial(3));
	}

	// 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean isAlphabet(char text) {
		return text >= 'a' && text <='z' || text >= 'A' && text <= 'Z';
	}
	
	// 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반화하는 함수
	public static boolean isMul3(int num) {
		return num % 3 == 0 || num == 0;
	}
	
	// 3. 숫자를 하나 전달하면 문자열 "짝수입니다." 또는 "홀수입니다."를 반환하는 함수
	public static String oddEven(int num) {
		
			return num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
	}
	
	// 4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
	public static int[] allYaksu(int num) {
		// 50인 경우 boolean타입 변수 50개를 생성
		boolean[] divided = new boolean[num];
		
		int count = 0;
		for(int i = 1; i <= num; ++i) {
			if(num % i == 0) {
				divided[i -1] = true; // 배열에 나누어 떨어진 숫자들을 표시 해놓음
				count++;
			}
		}

		int[] yaksu = new int[count];
		int index = 0;
		
		for(int i = 0; i < num; ++i) {
			if(divided[i]) {
				yaksu[index++] = i + 1;
			}
		}

		return yaksu;
	}
	
	// 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	public static boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}else if(num ==2) {
			return true;
		}else if(num % 2 == 0) {
			return false;
		}
		
		for(int i = 3; i <= Math.sqrt(num); i+=2) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	// 6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	//	factorial : (n)*(n-1)*(n-2) *...*3*2*1
	public static int factorial(int num) {
		int factorial = 1;
		for(int i = num; i > 0; --i) {
			factorial *= i;
		}
		
		return factorial;
	}
	
	// 어떤 함수가 자기 자신을 불러서 사용하는 것을 재귀함수라고 부른다.
	// (성능 안좋음, 겉멋, 안하는게 나음)
	public static int recursive_factorial(int num) {
		if(num == 1) {
			// 1까지 도착하면 그만 곱하고 나가라.
			return 1;
		}
		return num * recursive_factorial(num-1);
		
	}
	
}




