package study.b_;

public class B03_Switch {

	public static void main(String[] args) {
		/*
			switch - case
				- ()안의 연산 결과에 따라 실행할 코드를 결정
				- ()boolean 타입은 들어갈 수 없다
				- if문으로 완벽하게 대체 가능
				- default는 if문의 else역할
				- break를 안 쓰면 break를 만날 때까지 내려가면서 모든 case를 실행
		 */
		
		int a = 10;
		
		switch(a % 2){
		case 1:
			System.out.println("case1 실행");
			System.out.println("a는 홀수");
			break;
		case 0:
			System.out.println("case0 실행");
			System.out.println("a는 짝수");
			break;
		default:
			System.out.println("default 실행");
			System.out.println("해당하는 case가 없습니다");
			break;
		}
		char cmd = 'q';
		
		switch (cmd) {
		case 'w':
			System.out.println("move forward");
		case 's':
			System.out.println("move backward");
		case 'a':
			System.out.println("move left");
			break;
		case 'd':
			System.out.println("move right");
			break;
		case 'p':
			System.out.println("move pause");
			break;
		case 'q':
			System.out.println("move quit");
			break;
		default:
			System.out.println("해당하는 case가 없습니다");
			break;
		}
		
	}

}








