package study.c_;


public class C16_Exception {
	/*
		예외
			- 우리가 에러라고 알고 있던 빨간 글씨들을 사실 예외라고 한다.
			- 자바의 문법을 틀리는 것은 예외가 아니라 컴파일 에러라고 부른다.(오타)
			- 프로그래머가 발생 가능한 에러를 미리 예상하고 대비해두는 것을 예외처리라고 부른다
			- 예외처리의 기본 동작은 프로그램 강제종료이지만 프로그래머가 다른 조치를 취한다면
			  프로그램을 계속해서 진행할 수 있다.
			  
		예외 처리 절차
			- 예외가 발생할 가능성이 있는 코드를 try문 내부에 포함시킨다
			- try문 내부의 코드가 예외가 발생하지 않으면 모두 정상실행된다
			- try문 내부에서 예외가 발생하는 즉시 실행을 중단하고 해당 예외를 담당하는 catch문으로 
			  넘어가게 된다
			- catch문에는 발생한 예외에 대한 정보를 담고있는 예외 인스턴스가 전달된다
			- 예외가 발생하던 안하던 무조건 실행하고 싶음 코드는 finally절에 작성한다.
	 */
	
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("계산의 오류입니다");
		}finally {
			System.out.println("이부분은 무조건 실행되는 부분입니다!");
		}
		
		System.out.println("Hello!!");
	}
}
