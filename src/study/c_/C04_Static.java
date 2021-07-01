package study.c_;

public class C04_Static {
	
	static int a = 10;
	int b = 10;
	
	public static void main(String[] args) {
		/*
			static (정적 영역, 클래스 영역)
				- static 영역은 같은 클래스의 모든 인스턴스가 공동으로 사용하는 영역이다
				- 앞에 static이 붙은 자원은 같은 클래스로 만들어진 모든 인스턴스가 공동으로 사용하는 자원이 된다.
				- static 영역은 아무리 인스턴스가 많이도 클래스당 하나밖에 생성되지 않기때문에 메모리가 절약
				- static 영역은 클래스당 하나이기 때문에 클래스 이름에 .을 찍고 접근하는 것이 가능
				- static이 붙은 자원은 인스턴스가 생기기 전에도 호출할 수 있다.
				- static 베서드는 static 자원만을 활용할 수 있는 메서드이다.
				- 인스턴스가 하나도 존재하지 않을 때도 static 메소드가 사용될 가능성이 존재하기 때문에
				  static 메서드에서는 인스턴스 자원을 사용할 수 없다
		 */

	}

}
