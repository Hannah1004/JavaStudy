package study.d_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import quiz.d_.D06_Student;

public class D07_HashMap {
	/*
		Map
			- 데이터를 key와 value 한 쌍으로 저장하는 방식의 자료구조
			- key값을 통해 value에 접근할 수 있다
			- key는 중복을 허용하지 않는다
	 */
	public static void main(String[] args) {
		//첫 번째 제네릭은 key의 타입이고 두 번째 제네릭은 value의 타입
		HashMap<String, String> addr = new HashMap<>();
		/*
			Map.put(key,value) - 맵에 데이터를 추가한다
			Map.putAll(map) - 다른 맵의 데이터를 모두 추가한다
			Map.putIfAbsent - 해당 키값이 비어있으면 넣고, 뭔가 있으면 꺼내온다, 넣은경우 null을 리턴한다
		 */
		
		addr.put("집", "서울특별시...");
		addr.put("직장1", "노량진");
		addr.put("직장2", "강남");
		
		System.out.println(addr.putIfAbsent("우리집", "넣을 수 없다."));
		System.out.println(addr.putIfAbsent("우리집", "넣을 수 있다"));
		
		addr.put("직장2", "없어짐");
		System.out.println(addr);
		
		System.out.println(addr.get("집"));
		System.out.println(addr.get("직장1"));
		System.out.println(addr.get("직장2"));
		
		HashMap<Integer, D06_Student> students = new HashMap<>();
		
		students.put(1, new D06_Student());
		students.put(2, new D06_Student());
		
		System.out.println(students.get(1));
		System.out.println(students.get(2));
		
		//여러가지 타입을 사용할 수있다
		HashMap<String, Object> info = new HashMap<>();
		
		info.put("이름", "홍길동");
		info.put("나이", 23);
		info.put("전화번호", "010-1234-1234");
		info.put("좋아하는 것", new String[] {"영화","운동","햄버거"});
		info.put("친구 목록", new ArrayList<>());
	
		ArrayList<String> friends = (ArrayList<String>) info.get("친구 목록");
		friends.add("철수");
		friends.add("영희");
		friends.add("민수");
		
		((ArrayList<Object>) info.get("친구 목록")).add("강감찬");
		((ArrayList<Object>) info.get("친구 목록")).add("이순신");
		((ArrayList<Object>) info.get("친구 목록")).add("김유신");
		
		System.out.println(info.values());
		
		/*
			반복문으로 Map타입 활용하기
			
			- Map.keySet() : key들로 이루어진 Set을 반환한다
			- Map.values() : 값들로 이루어진 Collections을 반환한다
			- Map.enrtySet() : Entry<key, value>로 이루어진 Set을 반환한다
		 */
		
		System.out.println(info.keySet());
		
		for(String key : info.keySet()) {
			System.out.println("반복문으로 꺼낸 내용: "+ info.get(key));
		}
		
		System.out.println("-------------------------------");
		
		System.out.println(info.values());
		
		List value_list = new ArrayList<>(info.values());
		System.out.println(value_list);
		
		for(Object value : info.values()) {
			System.out.println(value);
		}
		
		for(Entry<String, Object> entry : info.entrySet()) {
			System.out.print(entry.getKey()+"\t");
			System.out.println(entry.getValue());
		}
	}
}












