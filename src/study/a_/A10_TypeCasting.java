package study.a_;

public class A10_TypeCasting {

	public static void main(String[] args) {
		
		/*
			타입 캐스팅
				1. 타입이 자연스럽게 변하는 경우 (암묵적인 타입 캐스팅)
					- 작은 타입에서 큰 타입으로 변할 때는 아무 문제도 생기지 않음
					- 때문에 자연스러운 타입변환
					
				2.타입을 강제로 변환시키는 경우 (명시적인 타입 캐스팅)
					- 타입을 변환 시킬 때 문제가 생길 가능성이 있는 경우에는
					  프로그래머가 직접 명시적으로 타입을 변환시켜야 한다
				
			타입 크기
				byte < short <= char < int < long < float < double
				
					- long은 8바이트고 float는 4바이트지만 숫자의 표현범위는 float가 더 넓다
					- 실수 타입은 전수 타입보다 표현범위가 넓다
		 */	
		
		System.out.println((char)75);
		
		int i = 3000;
		byte b = (byte)i;		
		System.out.println(b);
		
		//음수까지 포함하고 있는 타입은 char타입으로 변활할 떄 문제가 생길 위험이 있다.
		byte c = -50;
		char ch = (char)b;
		System.out.println((int)ch);
		
		// 일반적으로는 크기가 큰 타이벵서 작은 타입으로 변할 때도 명시적인 타입 캐스팅이 필요하다
		float f = 123.123f;
		long l = (long)f;
		System.out.println(l);
		
		//문제가 생기지는 않지만 같은 값이 다르게 해석될 필요가 있는 경우에도 명시적 타입 캐스팅이 필요
		System.out.println('A');
		System.out.println((int)'A');
		
		System.out.println(80);
		System.out.println((char)80);
	}

}






