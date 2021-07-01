package quiz.c_;

import java.util.Scanner;

public class C07_PirateGame {
	int randomNum;
	int player;
	int holeNum;
	int turnPlayer;
	static int hole[];
	
	C07_PirateGame(){
	}
	
	C07_PirateGame(int holeNum){
		hole = new int[holeNum];
		for(int i=0; i<holeNum; i++) {
			hole[i]=0;
		}
		hole[randomNumChoose(holeNum)] = 99;
	}
	
	int randomNumChoose(int holeNum) {
		int num = (int)(Math.random() * holeNum + 0);
		return num;
	}
	
	void gameStart() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("최대 구멍 개수를 설정해주세요.");
		holeNum = scan.nextInt();
		C07_PirateGame pg = new C07_PirateGame(holeNum);
		
		System.out.print("게임을 할 플레이어 수를 입력해 주세요.");
		player = scan.nextInt();
		
		while(true) {
			if(player > holeNum || player <0) {
				System.out.print("잘못된 인원수 설정입니다 다시 입력해주세요.");
				player = scan.nextInt();
			}else {
				break;
			}
		}
		
		turnPlayer = randomNumChoose(player-1);
		System.out.println("선 플레이어를 설정합니다. 나온번호를 가지고 있는 사람이 선 플레이어 입니다.");
		System.out.println(turnPlayer+"번이 선 플레이어 입니다.\n");
		
		while(true) {
			if(turnPlayer >= player) {
				turnPlayer=0;
			}
			System.out.printf("%d번 플레이어의 차례입니다.",turnPlayer);
			
			for(int i=0; i<holeNum; i++) {
				if(i%5==0) {
					System.out.println();
				}
				if(hole[i]==0 || hole[i]==99) {
					System.out.printf("[%d] = O \t",i);
				}else {
					System.out.printf("[%d] = X \t",i);
				}			
			}
			System.out.println();
			
			System.out.print("아래 번호에서 O표시가 있는 번호중 하나를 선택해 주세요");
			int playerChoose = scan.nextInt();
			
			while(true) {
				if(playerChoose >= holeNum ||playerChoose<0) {
					System.out.print("잘못된 번호선택입니다 다시 입력해주세요.");
					playerChoose = scan.nextInt();
				}else {
					break;
				}
			}
			
			if(hole[playerChoose]==99) {
				System.out.printf("%d의 자리는 해적 아저씨 자리입니다. %d번 플레이어의 패배로 게임을 종료합니다.",playerChoose,turnPlayer);
				break;
			}else if(hole[playerChoose]==1) {
				System.out.println("이미 선택된 번호입니다.");
				continue;
			}else {
				hole[playerChoose]=1;
				System.out.println();
			}
			turnPlayer++;
		}
	}
	
}
















