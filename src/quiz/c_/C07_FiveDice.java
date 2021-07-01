package quiz.c_;

import java.util.Scanner;

public class C07_FiveDice {
	Scanner scan;
	static int count;
	static int restoreCount=0;
	static int dice[];
	static int diceCount[];

	C07_FiveDice(int num) {
		count = num;
		dice = new int[count];
		diceCount = new int[6];
	}

	int rollDice() {
		int num = (int) (Math.random() * 6 + 1);
		return num;
	}

	void numStore() {
		for (int i = 0; i < count; i++) {
			dice[i] = rollDice();
		}
	}
	
	void checkDice() {
		for (int i = 0; i < count; i++) {
			System.out.printf("[%d] ",dice[i]);
		}
		System.out.println();
	}

	void checkDiceCount() {
		for (int i = 0; i < dice.length; i++) {
			if (dice[i] == 1) {
				diceCount[0]++;
			} else if (dice[i] == 2) {
				diceCount[1]++;
			} else if (dice[i] == 3) {
				diceCount[2]++;
			} else if (dice[i] == 4) {
				diceCount[3]++;
			} else if (dice[i] == 5) {
				diceCount[4]++;
			} else if (dice[i] == 6) {
				diceCount[5]++;
			}
		}
	}
	
	void reStore() {
		int num;
		int reDiceNum;
		scan = new Scanner(System.in);

		while (true) {
			if(restoreCount==2) {
				System.out.println("정해진 다시던지기 횟수를 모두 사용하셨습니다 게임을 종료합니다.");
				break;
			}
			
			System.out.print("몇개의 주사위를 다시 던지고 싶은지 입력해주세요: ");
			num = scan.nextInt();
			
			if (num != 0) {
				System.out.print("다시 던지고 싶은 주사위의 번호를 입력해 주세요(1-5): ");
				for (int i = 0; i < num; i++) {
					reDiceNum = scan.nextInt();
					dice[reDiceNum-1] = rollDice();
				}
				for (int i = 0; i < diceCount.length; i++) {
					diceCount[i]=0;
				}
				checkDiceCount();
				checkDice();
				resultCheck();
			} else {
				System.out.print("최종 결과: ");
				resultCheck();
				break;
			}
			restoreCount++;
		}

	}

	void resultCheck() {
		System.out.println();
		if (diceCount[0] >= 1 && diceCount[1] >= 1 && diceCount[2] >= 1 && diceCount[3] >= 1
				&& diceCount[4] >= 1) {
			System.out.println("1 2 3 4 5 라지 스트레이트 입니다.");
		} else if (diceCount[1] >= 1 && diceCount[2] >= 1 && diceCount[3] >= 1 && diceCount[4] >= 1
				&& diceCount[5] >= 1) {
			System.out.println("2 3 4 5 6 라지 스트레이트 입니다.");
		} else if (diceCount[0] >= 1 && diceCount[1] >= 1 && diceCount[2] >= 1 && diceCount[3] >= 1) {
			System.out.println("1 2 3 4 스몰 스트레이트 입니다.");
		} else if (diceCount[1] >= 1 && diceCount[2] >= 1 && diceCount[3] >= 1 && diceCount[4] >= 1) {
			System.out.println("2 3 4 5 스몰 스트레이트 입니다.");
		} else if (diceCount[2] >= 1 && diceCount[3] >= 1 && diceCount[4] >= 1 && diceCount[5] >= 1) {
			System.out.println("3 4 5 6  스몰 스트레이트 입니다.");
		}  else {
			for (int i = 0; i < dice.length; i++) {
				if (diceCount[i] == 5) {
					System.out.printf("%d숫자가 5 다이스입니다.", i + 1);
					break;
				} else if (diceCount[i] == 4) {
					System.out.printf("%d숫자가 4 다이스입니다.", i + 1);
					break;
				} else if (diceCount[i] == 2) {
					for (int j = 0; j < diceCount.length; j++) {
						if (diceCount[j] == 3) {
							System.out.printf("%d 2개 %d 3개로 풀하우스 입니다.", i + 1, j + 1);
						}
					}
					break;
				} else if (diceCount[i] == 3) {
					for (int j = 0; j < diceCount.length; j++) {
						if (diceCount[j] == 2) {
							System.out.printf("%d 2개 %d 3개로 풀하우스 입니다.", j + 1, i + 1);
						}
					}
					break;
				}
			}
		}
	}
	
	void gameStart() {
		numStore();
		checkDice();
		checkDiceCount();
		resultCheck();
		reStore();
	}
}
