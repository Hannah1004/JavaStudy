package study.d_;
import java.util.ArrayList;
import java.util.Collections;

public class D03_Collections {
	/*
		Collections 클래스
			- 컬렉션을 편리하게 다룰 수 있는 다양한 기능들이 모여있는 클래스
	 */
	
	public static void main(String[] args) {
		
		ArrayList<String> foods = new ArrayList<>();
		
		foods.add("햄버거");
		foods.add("돈까스");
		foods.add("돈부리");
		foods.add("청국장");
		foods.add("카라아게");
		foods.add("짜장면");
		
		System.out.println(foods);
		
		System.out.println(Collections.max(foods));
		System.out.println(Collections.min(foods));
		
		//정렬
		Collections.sort(foods);
		System.out.println(foods);
		
		//뒤섞기
		Collections.shuffle(foods);
		System.out.println(foods);
		
		Collections.addAll(foods, "감자튀김", "치즈스틱", "치킨너겟","오징어튀김", "새우튀김");
		System.out.println(foods);
		
		//해당 값이 몇 개 들어있는지를 쉽게 검사할 수 있다
		foods.add("치즈스틱");
		int a = Collections.frequency(foods, "치즈스틱");
		System.out.println(a);
		
		//컬렉션을 거꾸로 뒤집는다.
		Collections.reverse(foods);
		System.out.println(foods);
		
		//컬렉션 내부의 값의 위치를 교환
		Collections.swap(foods, 0, 8);
		System.out.println(foods);
		
		//오른쪽으로 5칸 이동
		Collections.rotate(foods, 5);
		System.out.println(foods);
		Collections.rotate(foods, -5);
		System.out.println(foods);
	}
}





















