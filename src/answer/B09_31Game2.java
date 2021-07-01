package answer;

import java.util.Scanner;

public class B09_31Game2 {

	public static void main(String[] args) {
		int user, com, turn;
		int num=0;
		Scanner scan = new Scanner(System.in);
		
		turn = (int) (Math.random() * 2 + 1);
		
		if(turn == 0) {
			System.out.println("컴퓨터 선공");
		}else {
			System.out.println("당신의 선공");
		}
		
		while(num < 31) {
			
			if(turn == 0) {
				com = (int)(Math.random() * 3 + 1);
				num += com;
				System.out.printf("컴퓨터가 %d를 골랐습니다. [현재 숫자:%d]\n",com,num);
			}else {
				user=0;
				while(user < 1 || user> 3 ) {
					System.out.println("1, 2, 3?");
					user = scan.nextInt();
				}
				num += user;
				
				System.out.printf("[현재 숫자:%d]\n",num);
			}
			turn = (turn  +1 ) % 2;
		}
		
		//System.out.printf("게임 종료! %s의 승리\n", turn == 0 ? "컴퓨터":"플레이어" ); 밑에와 같은 문장
		
		if (turn == 0) {
			System.out.println("게임 종료! 컴퓨터의 승리!");
		}else {
			System.out.println("게임 종료! 플레이어의 승리!");
		}
	}

}



