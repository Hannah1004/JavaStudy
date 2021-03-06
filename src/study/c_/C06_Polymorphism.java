package study.c_;

public class C06_Polymorphism {

	/*
	 	# 객체의 다형성
	 	 - 객체는 다양한 형태를 지닐 수 있다
	 	 - 사과는 사과이기도 하고 과일이기도 하다
	 	 - 과일은 과일이지만 사과가 아닐 수도 있다
	 */
	
	public static void main(String[]args) {
		Fruit fruit01 = null;
		Pineapple pine01 = null;

		Fruit fruit = new Fruit();
		Pineapple pineapple = new Pineapple();

		fruit01 = fruit;
		fruit01 = pineapple; // 자식 타입은 부모 타입이 될 수 있다 (업 캐스팅)
		// 파인애플은 프룻에 모든걸 상속받아서 이미 알고있기에 가능하다,
		// 하지만 프룻이 파인애플이 되려면 파인애플의 기능을 모두 알고있지 못하기에 어렵다

		pine01 = pineapple;
		// pine01 = fruit; // 부모 타입은 없는 기능이 많아서 자식 타입이 될 수 없다 (다운 캐스팅)

		// # 다운 캐스팅이 가능한 경우
		// - 원래 자식 타입이었던 인스턴스가 업캐스팅되어 있는 경우, 다시 다운캐스팅 될 수 있다
		System.out.println(fruit01);
		System.out.println((Pineapple)fruit01);
		pine01 = (Pineapple)fruit01; // 다운 캐스팅

		// # 업캐스팅 한 인스턴스 사용해보기
		Fruit f = new Pineapple();
		Fruit f2 = new DragonFruit();


		// 업캐스팅 된 상태에서도 부모 타입에도 존재하는 메서드를 사용하면
		// 해당 메서드가 오버라이드 된 경우 오버라이드 되어있는 기능을 사용한다
		f.eat(); // 업캐스팅을해도 자식타입이 오버라이드한 상태라면 오버라이드 된걸 가져온다

		// 업캐스팅 된 상태에서는 본래 클래스가 갖고있던 기능을 잠시 잊어버린다.
		// (Pineapple에만 존재하는 기능은 사용할 수 없다)
		//f.smash(); // 파인애들이 프루있이 된다면 파인애플에 있던 기능은 잠시 잊고 프루있에있던것만 사용한다

		// 원래 기능을 사용하기 위해서는 다운캐스팅이 필요하다
		// ※ 컴파일러는 다운캐스팅시 발생하는 문제점을 찾아주지 못한다 (주의해야 하는 부분)
		((Pineapple)f).smash();
		//((Pineapple)f2).smash();
		
		// instanceof 연산자를 통해 해당 인스턴스가 특정 클래스의 인스턴스 인지를 검사할 수 있다
		System.out.println("f가 Fruit이 될 수 있는 인스턴스인가요? " 
				+ (f instanceof Fruit));
		System.out.println("f가 Fruit이 될 수 있는 인스턴스인가요? " 
				+ (f instanceof Pineapple));
		System.out.println("f가 Fruit이 될 수 있는 인스턴스인가요? " 
				+ (f instanceof DragonFruit));
		
		System.out.println("f2가 Fruit이 될 수 있는 인스턴스인가요? " 
				+ (f instanceof Fruit));
		System.out.println("f2가 Fruit이 될 수 있는 인스턴스인가요? " 
				+ (f instanceof Pineapple));
		System.out.println("f2가 Fruit이 될 수 있는 인스턴스인가요? " 
				+ (f instanceof DragonFruit));
	}
}

class Fruit{
	void eat() {
		System.out.println("과일을 먹었습니다.");
	}
}
// Apple이 안되는 이유. 같은 패키지 내부에는 같은 이름의 클래스가 존재할 수 없다.
class Pineapple extends Fruit{
	void eat() {
		System.out.println("[오버라이드] 파인애플을 먹었습니다.");
	}

	void smash() {
		System.out.println("파인애플은 세게 내리쳤습니다.");
	}
}

class DragonFruit extends Fruit{

}
