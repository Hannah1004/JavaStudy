package study.d_;
import java.util.ArrayList;

public class D01_ArrayList {
	/*
		Java Collections
			- 자바에서 기본적으로 제공하는 자료구조 인터페이스
			- Collection 인터페이스를 구현한 클래스는 List, Set 등이 있다
		
		java.util.ArrayList
			- 배열과 유사하지만 크기가 자동적으로 조절되는 자료구조 인터페이스
			- 배열처럼 데이터를 순차적으로 저장한다
			- 순차적으로 모든 데이터에 접근해야 할 때 가장 유리하다
	 */
	public static void main(String[] args) {
		/*
			# 타입을 지정하며 ArrayList 생성하기
				- 타입을 지정할 때 사용하는 <>를 제네릭(Generic)이라고 부른다
				- 해당 클래스 내부의 아직 지정되지 않은 타입을 지정하는 문법
				- 제네릭에는 기본형 타입을 사용할 수 없다
		 */
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> numbers2 = new ArrayList<>();
		ArrayList<Character> chars = new ArrayList<>();
		
		//add 뒤에서 부터 추가
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("banana");
		
		chars.add('A');
		chars.add('B');
		chars.add('C');
		chars.add('D');
		chars.add('E');
		
		//add(index, item): 리스트의 원하는 위치에 데이터를 추가한다
		numbers.add(0,1);
		numbers.add(0,2);
		numbers.add(0,3);
		numbers.add(0,4);
		numbers.add(0,5);
		
		numbers2.add(0,5);
		numbers2.add(0,6);
		numbers2.add(0,7);
		numbers2.add(0,8);
		numbers2.add(0,9);
		
		System.out.println(fruits);
		System.out.println(numbers);
		System.out.println(numbers2);
		System.out.println(chars);
		
		numbers.addAll(numbers2);
		
		System.out.println(numbers);
		
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(2));
		System.out.println("현재 과일 개수:"+fruits.size());
		
		System.out.println(fruits.remove(0));
		
		System.out.println(numbers.indexOf(10));
		System.out.println(numbers.indexOf(4));
		System.out.println(numbers.contains(10));
		System.out.println(numbers.contains(4));
	}
}



















