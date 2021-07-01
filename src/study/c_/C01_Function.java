package study.c_;

public class C01_Function {
	/*
		함수
			기능을 미리 정의해두고 나중에 가져다 쓰는것
			자바에서 함수는 반드시 클래스 내부에 선언해야 한다
			
		함수의 리턴
			함수를 정의할 때 함수명 앞에 해당 함수가 반환하는 값의 타입을 적는다
			함수를 호출하면 호출한 자리에 함수의 실행결과가 반환된다
			리턴타입 void는 해당 함수가 반환하는 값이 없다는 것을 의미하는 반환타입이다.
	 */
	public static void printRabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >♡");
	}
	
	public static void main(String[] args) {
		printRabbit();

	}

}
