package study.c_;

public class C05_Inherit {

	public static void main(String[] args) {
		/*
			클래스 상속
				- 예전에 미리 만들어 뒀던 클래스를 그대로 물려받아서 사용하는 것
				- 물려받은 후에는 해당 클래스를 마음대로 고쳐서 사용할 수 있다.
				- 원본을 보존하면서 새롭게 수정해볼 수 있는 것이 장점이다
				- 상속받는 클래스를 자식 클래스 또는 서브클래스
				- 상속하는 클래스를 부모 클래스 또는 슈퍼클래스
			
			상속의 규칙
				- extends라는 키워도를 사용
				- 생성자에서 반드시 가정 먼저 부모 클래스의 생성자를 호출해야 한다
				- 부모 클래스와 자식클래스에 똑같은 이름을 가진 자원이 있는 경우에는 super와 this로 구분할 수 있다
				- super()는 부모의 생성자
				- this()는 자신의 생성자
		 */
		
		Person gildong = new Person("고길동",42);
		gildong.sayHi();
		
		Programmer chulsoo = new  Programmer("김철수",28);
		chulsoo.sayHi();
		chulsoo.program("오목");
		
	}
}

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void sayHi() {
		System.out.println("안녕 내이름은 " +name+"이야. 나이는 "+age+"살 이야.");
	}
}

class Programmer extends Person{

	Programmer(String name, int age) {
		super(name, age);
		
	}
	
	void program(String to_program) {
		System.out.println(name+"씨는 이번에는 "+to_program+"을 만들기 시작했습니다.");
	}
	
	//override : 자식 클래스는 부모클래스의 메서드를 수정해서 사용 가능
	void sayHi() {
		System.out.println("Hello world!");
	}
}
 
class Tree{
	Tree(){
		
	}
		
	Tree(int a){
		
	}
}

class OrangeTree extends Tree{
	OrangeTree(){
		//super(); // 부모클래스에 기본생성자가 있는 경우는 super()를 생략할 수 있다 기본생성자가 아닌경우는 자식에서 호출 해야함
	}
}














