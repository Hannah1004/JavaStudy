package study.c_;

public class C14_AnonymousInnerClass {
	/*
		익명 내부 클래스
			- 클래스를 정의하자마자 이름도 짓지 않고 바로 사용한 다음 버리는 방식
	 */
	public static void main(String[] args) {
		fight(new Dragon());
		fight(new SkeletonWarrior());
		
		// 익명 내부 클래스는 즉석으로 해당 클래스의 상속을 구현한다
		// 생성자 뒤에 {}를 열어서 즉석에서 클래스를 개조해서 사용하는 방법을 익명 내부 클래스라고 한다.
		Dragon dragon01 = new Dragon() {
			void attack() { //업캐스팅이고 원래 가지고 있던 메서드를 상속받아서 사용하는 개념이기에 attack을 사용 가능
				System.out.println("얼음드래곤은 얼음을 뿜어서 공격합니다.");
			}
		};
		
		fight(dragon01);
		fight(new SkeletonWarrior(){
			void attack() {
				System.out.println("스켈레톤 방패병은 방패를 밀어서 공격합니다.");
			}
		});
		
		//인스턴스화 할 수 없는 추상 클래스를 즉성에서 상속받아 구현할 수 있다.
		Monster monster01 = new Monster() {
			void attack() {
				System.out.println("몸통 박치기!");
			}
		};	
		fight(monster01);
	}
	
	private static void fight(Monster monster) {
		monster.attack();
	}
}


abstract class Monster{
	abstract void attack();
}

class Dragon extends Monster{
	@Override
	void attack() {
		System.out.println("드래곤은 불을 뿜어서 공격합니다.");
		
	}
}

class SkeletonWarrior extends Monster{
	@Override
	void attack() {
		System.out.println("해골전사는 칼을 휘둘러서 공격합니다.");
		
	}
}