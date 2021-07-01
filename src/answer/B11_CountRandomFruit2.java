package answer;

import java.util.Scanner;

public class B11_CountRandomFruit2 {

	public static void main(String[] args) {
		int num=100;
		Scanner scan = new Scanner(System.in);
		
		String fruits[] = {"apple", "banana", "kiwi", "orange", "grape", "peach"};
		int[] fruit_count = new int[fruits.length];
		
		for(int i=0; i<num; i++ ) {
			int random_number = (int)(Math.random() * fruits.length);
			System.out.println(fruits[random_number]);
			fruit_count[random_number]++;
		}
		System.out.println("### 과일 등장 횟수 ###");
		
		for(int i=0; i<fruits.length; i++) {
			System.out.printf("%s는 %d번 등장했습니다 \n", fruits[i], fruit_count[i]);
		}
		
	}

}
