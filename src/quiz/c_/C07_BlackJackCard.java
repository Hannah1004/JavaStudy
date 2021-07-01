package quiz.c_;

public class C07_BlackJackCard {
	private String num[];
	private String shape[];
	
	static int playerSum=0;
	static String playerNum[];
	static String playerShape[];

	static int dealerSum=0;
	static String dealerNum[];
	static String dealerShape[];

	
	C07_BlackJackCard(){
		num = new String[] {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		shape = new String[] {"  heart","  clover","diamond","  spade"};

	}
	
	String numChoose() {
		int card = (int)(Math.random() * num.length + 0);
		return num[card];
	}
		
	String shapeChoose() {
		int shape2 = (int)(Math.random() * shape.length + 0);
		return shape[shape2];
	}
	
	void cardView() {
		System.out.println("  Player \t\t Dealer");
		for(int i=0; i<playerNum.length; i++) {
			if(playerNum[i].equals("")) {
				break;
			}else {
				System.out.printf("%s%s \t\t", playerShape[i], playerNum[i]);
				System.out.printf("%s%s \n", dealerShape[i], dealerNum[i]);
			}
		}
		System.out.println("-----------------------------------------\n");
	}
	
	void sumCheck() {
		for (int i = 0; i < playerNum.length; i++) {
			if (!playerNum[i].equals("")) {
				playerSum += numReturn(playerNum[i]);
			} else {
				break;
			}
		}
		for (int i = 0; i < dealerNum.length; i++) {
			if (!dealerNum[i].equals("")) {
				dealerSum += numReturn(dealerNum[i]);
			} else {
				break;
			}
		}
	}
	
	void winLose(int playerSum, int dealerSum) {
		if ((playerSum < 21 && dealerSum < 21) && playerSum > dealerSum) {
			System.out.printf("Player숫자 합:%d Dealer숫자 합:%d Player의 승리입니다!",playerSum,dealerSum);
		} else if ((playerSum < 21 && dealerSum < 21) && playerSum < dealerSum) {
			System.out.printf("Player숫자 합:%d Dealer숫자 합:%d Dealer의 승리입니다!",playerSum,dealerSum);
		} else if ((playerSum < 21 && dealerSum < 21) && playerSum == dealerSum) {
			System.out.printf("Player숫자 합:%d Dealer숫자 합:%d 무승부입니다!",playerSum,dealerSum);
		} else if (playerSum <= 21 && dealerSum > 21) {
			System.out.printf("Player숫자 합:%d Dealer숫자 합:%d Player의 승리입니다!",playerSum,dealerSum);
		} else if (playerSum > 21 && dealerSum <= 21) {
			System.out.printf("Player숫자 합:%d Dealer숫자 합:%d Dealer의 승리입니다!",playerSum,dealerSum);
		} else if (playerSum > 21 && dealerSum > 21) {
			System.out.printf("Player숫자 합:%d Dealer숫자 합:%d 다음판으로 Pass합니다",playerSum,dealerSum);
		}
	}
	
	
	int numReturn(String num) {
		if(num.equals("A")) {
			return 11;
		}else if(num.equals("J")) {
			return 10;
		}
		else if(num.equals("Q")) {
			return 10;
		}
		else if(num.equals("K")) {
			return 10;
		}else {
			return Integer.parseInt(num);
		}
	}

}
