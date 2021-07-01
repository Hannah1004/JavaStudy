package answer;

import java.util.ArrayList;

public class D01_StudentList {
	public static void main(String[] args) {
		ArrayList<D01_Student> student_list = new ArrayList<>();
		
		for(int i=0;i<30;i++) {
			student_list.add(new D01_Student());
		}
		
		for(D01_Student student : student_list) {
			System.out.println(student);
		}
		
		System.out.println("가장 높은 점수:" + D01_Student.best_avg);
		System.out.println("가장 높은 점수 학번:" + D01_Student.best_avg_snum);
	}
}
