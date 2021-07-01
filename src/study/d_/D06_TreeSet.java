package study.d_;

import java.util.*;


public class D06_TreeSet {
	/*
		TreeSet
			- 순서가 있는 Set
			- 처음 Set에 데이터를 추가할 때 값을 정렬해서 넣는다
			- 중복은 허용하지 않는다(Set의 특징, 순서가 없는 것은 Hash의 특징)
			- 미리 정렬이 되어 있기 때문에 정렬된 순서로 값을 꺼내기 편리한 Set이다
			- 해당 TreeSet 인스턴스에서 사용할 Comparator을 지정할 수 있다
	 */
	private static Random ran = new Random();
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);	
		numbers.add(99);
		numbers.add(86);
		numbers.add(41);
		numbers.add(50);
		numbers.add(13);
		
		System.out.println(numbers);
		
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
				/*
					자리를 바꾸려면 양수리턴
					자리를 바꾸기 싫으면 음수 리턴
					두 값이 같은 값이면 0리턴
				 */
			}
		}) ;
			
		numbers2.addAll(numbers);
		System.out.println(numbers2);
		
		// TreeSet은 Set의 일부분을 리턴하는데에 특화된 기능이 많다
		SortedSet<Integer> head = numbers.headSet(44);		
		System.out.println(head);
		
		SortedSet<Integer> tail = numbers.tailSet(44);
		System.out.println(tail);
		
		//미리 정렬해 놓은 방향과 반대 방향인 Set 인스턴스를 반환한다
		NavigableSet<Integer> desc = numbers.descendingSet();
		System.out.println(desc);
		
		System.out.println("first "+ numbers.first());
		System.out.println("last "+ numbers.last());
		System.out.println(numbers.pollFirst());
		System.out.println(numbers);
		
		System.out.println(numbers.subSet(30, 70));
		
		System.out.println(numbers.comparator());
		System.out.println(numbers2.comparator());
		
		TreeSet<Integer> numbers3 = new TreeSet<>(numbers2.comparator());
		
		List<Integer> list = new ArrayList<>(numbers);
		Collections.sort(list,numbers2.comparator());
		
		System.out.println("list: "+list);
		
		System.out.println(list.containsAll(desc));
		System.out.println(list.containsAll(tail));
		System.out.println(list.containsAll(numbers));
		
	}
}















