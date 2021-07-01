package quiz.b_;

public class B08_WhileBasicQuiz {

	public static void main(String[] args) {
		//1번
		System.out.println("-------1번문제-------");
		int sum=0;
		int i = 1;
		while(i <= 100) {
			if(i % 3 == 0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("3의 배수의 총합은:"+sum);
		
		System.out.println("-------2번문제-------");
		//2번
		i = 355;
		while(i >= 237) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("-------3번문제-------");
		//3번
		i = 3000;
		while(i <= 5000) {
			if(i % 7 != 0) {
				i++;
				continue;
			}else {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("-------4번문제-------");
		//4번
		i = 1;
		sum=0;
		while(i <= 200) {
			if(i % 2 !=0 && i % 3 !=0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("총합은:"+sum);
	}

}











