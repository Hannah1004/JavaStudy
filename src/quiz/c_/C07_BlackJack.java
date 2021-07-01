package quiz.c_;

import java.util.Scanner;

public class C07_BlackJack extends C07_BlackJackCard {

	Scanner scan = new Scanner(System.in);
	int choice=1;
	C07_BlackJack() {
		playerNum = new String[10];
		playerShape = new String[10];
		dealerNum = new String[10];
		dealerShape = new String[10];
		for (int i = 0; i < playerNum.length; i++) {
			playerNum[i] = "";
			playerShape[i] = "";
			dealerNum[i] = "";
			dealerShape[i] = "";
		}
	}

	void gameStart() {
		C07_BlackJackCard bj = new C07_BlackJackCard();

		System.out.println("플레이어의 카드를 뽑겠습니다.");
		continueLoop:
		for (int i = 0; i < 2; i++) {
			String num = numChoose();
			String shape = shapeChoose();
			for (int j = 0; j < playerNum.length; j++) {
				if (playerNum[j].equals(num) && playerShape[j].equals(shape)) {
					continue continueLoop;
				} else if (dealerNum[j].equals(num) && dealerShape[j].equals(shape)) {
					continue continueLoop;
				}
			}
			playerNum[i] = num;
			playerShape[i] = shape;
		}

		System.out.println("딜러의 카드를 뽑겠습니다.");
		continueLoop:
		for (int i = 0; i < 2; i++) {
			String num = numChoose();
			String shape = shapeChoose();
			for (int j = 0; j < dealerNum.length; j++) {
				if (playerNum[j].equals(num) && playerShape[j].equals(shape)) {
					continue continueLoop;
				} else if (dealerNum[j].equals(num) && dealerShape[j].equals(shape)) {
					continue continueLoop;
				}
			}
			dealerNum[i] = num;
			dealerShape[i] = shape;
		}


		while(choice==1) {
			cardView();
			System.out.print("카드한장을 더 뽑으시겠습니까? (0/1)");
			choice = scan.nextInt();
			System.out.println(choice);
			if (choice==1) {
				breakLoop1:
				continueLoop1:
				for (int i = 0; i < playerNum.length; i++) {
					if (playerNum[i].equals("")) {
						String num = numChoose();
						String shape = shapeChoose();
						for (int j = 0; j < playerNum.length; j++) {
							if (playerNum[j].equals(num) && playerShape[j].equals(shape)) {
								continue continueLoop1;
							} else if (dealerNum[j].equals(num) && dealerShape[j].equals(shape)) {
								continue continueLoop1;
							}
						}
						playerNum[i] = num;
						playerShape[i] = shape;
						break breakLoop1;
					}
				}
			}
		}
		sumCheck();
		if (dealerSum < 17) {
			while (true) {
				if (dealerSum > 17) {
					break;
				} else {
					for (int i = 0; i < playerNum.length; i++) {
						if (playerNum[i].equals("")) {
							String num = numChoose();
							String shape = shapeChoose();
							for (int j = 0; j < dealerNum.length; j++) {
								if (playerNum[j].equals(num) && playerShape[j].equals(shape)) {
									continue;
								} else if (dealerNum[j].equals(num) && dealerShape[j].equals(shape)) {
									continue;
								}
							}
							dealerNum[i] = num;
							dealerShape[i] = shape;
							break;
						}
					}

				}
			}

		}
		cardView();
		winLose(playerSum,dealerSum);		
	}
}
