package study.c_;

public class C07_Abstract {

	public static void main(String[] args) {
		/*
		 * 추상 클래스 - 형태만 만들어 놓고 완성은 자식클래스 - 내부에 추상 메서드를 포함하고 있는 클래스
		 * 
		 * 추상 메서드 - 몸통이 없는 메서드 - abstract가 붙은 메서드는 직접 구현할 수 없고 상복받은 클래스에서 구현해야 한다
		 */
		
		Poketmon p = new Pikachu();		
		p.skill1();
		p.skill2();
		
		testPoketmon(new Pikachu());
		testPoketmon(new LongStone());
	}
	
	//Poketmon 클래스를 상속받은 모든 인스턴스가 매개변수로 들어올 수 있는 메서드
	public static void testPoketmon(Poketmon p) {
		p.skill1();
		p.skill2();
	}
/*	이런식으로 추가하면 포켓몬 한마리마다 메서드가 추가되어 비효율적 위의 방법처럼 부모클래스를 사용하는 것이 효율적
	public static void testPoketmon(Pikachu p) {
		p.skill1();
		p.skill2();
	}
	
	public static void testPoketmon(LongStone stone) {
		stone.skill1();
		stone.skill2();
	}
*/
}

abstract class Poketmon {

	abstract void skill1();

	abstract void skill2();


}

class Pikachu extends Poketmon{

	@Override
	void skill1() {
		System.out.println("몸통박치기");
	}

	@Override
	void skill2() {
		System.out.println("백만볼트");
	}
	
}

class LongStone extends Poketmon{

	@Override
	void skill1() {
		System.out.println("땅파기");
	}

	@Override
	void skill2() {
		System.out.println("박치기");
	}
	
}












