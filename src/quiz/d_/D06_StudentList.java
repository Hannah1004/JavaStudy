package quiz.d_;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


public class D06_StudentList {
	public static void main(String[] args) {
		
		TreeSet<D06_Student> studentList = new TreeSet<>();
		for(int i=0;i<100;i++) {
			studentList.add(new D06_Student());
		}
		
		//System.out.println(studentList);
		//System.out.println(studentList.size());	
		
		D06_Student from = new D06_Student();
		D06_Student to = new D06_Student();
		
		from.avg=50;
		to.avg=70;
		
		System.out.println(studentList.subSet(from, to).size());
		System.out.println(studentList.subSet(from, to));
	}
	
}







