package study.c_;

public class C02_OOP {
	/*
	 	# 객체지향 프로그램(OOP : Object Oriented Programming)
	 	
	 		- 세상에 존재하는 모든 것들을 변수와 함수로 표현하려는 프로그래밍 방법론
	 		- 변수와 함수를 무분별하게 사용하기 보다는
	 		  현실에 존재하는 객체 단위로 묶어서 표현하여 가독성을 올린다.
	 		- 객체 (Object) :세상에 존재하는 모든 것 (사물, 개념, .. 등등)
	 		
	 		ex : 사과
	 			- 사과의 변수 : 크기, 당도, 색깔, 칼로리, 유통기한, 모양... 
	 			- 사과의 함수 : 
	 				먹는다. (크기가 줄어들면서 칼로리만큼 먹는 사람의 칼로리 증가)
	 				색이 변한다.
	 				유통기한이 줄어든다.
	 				던진다. (크기만큼의 데미지를 입힌다.)
	 				냉장고에 보관한다. (유통기한이 느리게 감소한다.)
	 		
	 		* 클래스에 딸려있는 함수들을 메서드라고 부른다. (JAVA에는 메서드밖에 없다.)
	 		
	 	# 클래스 (Class)
	 	
	 		- 객체를 프로그래밍 언어로 표현한 것
	 		- 클래스는 해당 객체의 설계도다. (정의한 시점에서는 실체가 없다.)
	 		- 설계도대로 찍어내는 실제 객체를 '인스턴스'라고 부른다.
	 		- 클래스는 참조형 변수 타입이다.
	 		
	 */
	
	// main은 반드시 public class 내부에 존재해야 한다.
	// (파일 이름과 똑같은 이름의 클래스에 존재해야 찾을 수 있다.
	public static void main(String[] args) {
		
		// new를 통해 인스턴스 생성
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		a1.size = 15;
		a1.color = "빨간색";
		
		a2.size = 13;
		a2.color = "보라색";
		
		a3.size = 25;
		a3.calorie = 100;
		
		System.out.println(a1.color);
		System.out.println(a2.color);
		
		System.out.println("먹기전 a3의 크기 : " + a3.size);
		System.out.println("먹기전 a3의 칼로리 : " + a3.calorie);
		
		a3.eat();
		
		System.out.println("먹은 후 a3의 크기 : " + a3.size);
		System.out.println("먹은 후 a3의 칼로리 : " + a3.calorie);
		
		System.out.println("****연습문제****");
		Payback p1 = new Payback();
		
		p1.name = "이한나";
		p1.pay = 10000000;
		p1.tax = 3.5;
		p1.lateCount = 3;
		p1.money();
		p1.late();
		
		System.out.println("당신의 이름은 " + p1.name);
		System.out.println("당신의 월급은 " + p1.salary + "원 입니다.");
		System.out.println("당신의 지각으로 인한 차감 월급은 " + p1.lateFine + "원 입니다.");
		
		Window window1 = new Window();
		window1.open();
		window1.lock();
		window1.status();
		
		String status = window1.getStatus();
		System.out.println("가져온 상태 문자열로 출력 : " + status);
	}
}

class Apple{
	/*
	 	# 인스턴스 변수
	 	
	 		- 인스턴스 마다 각자의 영역을 가지고 있는 변수들
	 		- aka. 필드, 속성, 멤버 변수, 멤버, 상태 ...
	*/
	int size;
	double sweet;
	String color;
	int calorie;
	/*
	 	# 인스턴스 메서드
	 	
	 		- 인스턴스 변수를 통해 해당 인스턴스의 상태를 변화시키는 메서드
	 		
	 */
	void eat() {
		size --;
		calorie -=10;
	}
}

/*
 	연습문제 : 현실의 객체를 참고하여 클래스를 하나 생성한 후 인스턴스를 생성하고 값을 채운다음 출력해보세요
 	
 	※ 인스턴스 변수는 3개 이상, 인스턴스 메서드 2개 이상, 과일 금지
 	
 */
class Payback{
	String name;
	int pay;
	double tax;
	int salary;
	int lateCount;
	int lateFine;
	
	void money() {
		salary = (int)(pay * tax);
	}
	
	void late() {
		lateFine = (10000 * lateCount);
		salary -= lateFine; 
	}
	
}

class Window{
	
	boolean open;
	boolean lock;
	double width;
	double height;
	
	void open()	{
		open = true;
	}
	void close() {
		open = false;
	}
	void lock() {
		lock = true;
	}
	void unlock() {
		lock = false;
	}
	void status() {
		System.out.printf("이 창문은 %s. [%s]\n",
				open ? "열려있습니다." : "닫혀있습니다..",
				lock ? "잠겨있습니다." : "잠금해제상태입니다.");
	}
	
	String getStatus() {
		// String.format() : 서식을 이용해 원하는 문자열을 생성한다.
		
		return String.format("이 창문은 %s. [%s]\n",
				open ? "열려있습니다." : "닫혀있습니다.",
				lock ? "잠겨있습니다." : "잠금해제상태입니다.");
	}
	
	
}
