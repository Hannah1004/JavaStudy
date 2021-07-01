package study.a_;

public class A03_VarType {
	public static void main(String args[]) {
		/*
	 	정수타입
	 		- byte	(1byte) -128 ~ +127
	 			1byte => 8bit
	 			양수 0000 0000(0) ~ 0111 1111(127)
	 			음수 1000 0000(-128) ~ 1111 1111(-1)
	 			
	 		- short	(2byte) -32768 ~ 32767
	 			
	 		
	 		- char	(2byte unsigned) 0 ~ 65535 (부호가 없기 때문) 문자 코드 저장용
	 		- int	(4byte) 2,147,483,648 ~ 2,147,483,647
	 		- long	(8byte) 9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807	 	
		 */
		byte _byte = 127;
		short _short = 32767;
		char _char = 65535;
		int _int = 2100000000;
		
		//정수타입은 리터럴은 기본적으로 int
		//int 범위 벗어나는 값을 사용하고 싶다면 뒤에 l L을 붙여야함
		long _long = 200000000000000L;
		
		/*
		 실수타입
		 	- float		(4byte)
		 	- double	(8byte)
		 	
		 	실수는 주로 그래픽 계산
		 	부동 소수점 방식을 사용
		 */
		// 소수 리터럴은 기본적으로 double
		double _double = 123.1234;
		//소수 뒤에 F f 를 적어주면 float타입 리터럴로 표시
		float _float = 123.123F;
		
		/*
		 참 거짓 타입
		 	-boolean
		 	들어갈 수 있는 값음 tru2/false 밖에 없음
		 */
		boolean male = true;
		boolean female = true;
		
		/*
		 참조형 타입
		 	참조형 타입은 대문자로 시작
		 	소문자로 시작하는 타입은 모두 기본형 타입
		 	
		 	- String : 문자열을 저장
		 	- 그외 모든 클래스들
		 */
		String message = "hello world!";
		System.out.println(message);
		
		// char 타입은 문자 코드를 저장하는 정수 타입
		char ch = 97;
		char ch2 = 'a';
		
		int num1 = 'x';
		System.out.println("ch값 : "+ch);
		System.out.println("ch2값 : "+ch2);
		System.out.println("num1 : "+num1);
	}
}









