package quiz.d_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class D02_JiphapQuiz {
	ArrayList<Integer> jip1 = new ArrayList<>();
	ArrayList<Integer> jip2 = new ArrayList<>();	
	HashSet<Integer> result = new HashSet<Integer>();
	
	D02_JiphapQuiz(){
		jip1.add(1);
		jip1.add(2);
		jip1.add(3);
		jip1.add(4);
		
		jip2.add(3);
		jip2.add(4);
		jip2.add(5);
		jip2.add(6);
	}
	
	void reset() {
		jip1.clear();
		jip2.clear();
		result.clear();
		
		jip1.add(1);
		jip1.add(2);
		jip1.add(3);
		jip1.add(4);
		
		jip2.add(3);
		jip2.add(4);
		jip2.add(5);
		jip2.add(6);
	}
	
	HashSet union(Collection list1, Collection list2) {
		
		list2.addAll(list1);
		result.addAll(list2);
		
		return result;		
	}
	
	HashSet minus(Collection list1, Collection list2) {
		
		list1.removeAll(list2);
		result.addAll(list1);
		
		return result;		
	}
	
	HashSet intersection(Collection list1, Collection list2) {
		
		list1.retainAll(list2);
		result.addAll(list1);
		
		return result;		
	}
	
	void printHash(HashSet set) {
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(set);
		Collections.sort(list);
		System.out.println(list);
	}
}














