package myobj.foker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Player {
	Scanner scan;
	public static ArrayList<ArrayList> users;
	public static ArrayList<ArrayList> hiddenCard;
	public static ArrayList<Boolean> engage;
	public static ArrayList<Integer> userMoney;
	

	
	int playerChoice() {
		int player;
		scan = new Scanner(System.in);
		while(true) {
			player = scan.nextInt();
			if(player < 2 || player > 5) {
				System.out.println("허용된 인원수가 아닙니다. 다시 입력해 주세요");
			}else {
				break;
			}
		}
		return player;
	}
	
	void makePlayer(int num) {
		users = new ArrayList<>();
		hiddenCard = new ArrayList<>();
		engage = new ArrayList<>();	
		userMoney = new ArrayList<>();

		for(int i=0; i<num;i++) {
			ArrayList<String> list = new ArrayList();
			users.add(list);
			
			ArrayList<String> list2 = new ArrayList();
			hiddenCard.add(list2);
			
			engage.add(true);
			userMoney.add(100000);
		}
	}
	
	void getCard(int user, String card) {
		users.get(user).add(card);
	}
	
	void deleteCard(int user, int cardNum) {
		users.get(user).remove(cardNum);
	}
	
	void hideCard(int user, int cardNum) {
		for(int i=0;i<users.get(user).size();i++) {
			if(i!=cardNum) {
				String hidden = (String) (users.get(user)).get(i);
				hiddenCard.get(user).add(hidden);
				users.get(user).set(i,"H");
			}
		}
	}
	
	void printCard(int num) {
		System.out.println(num+"번 Player의 카드: "+users.get(num-1));
	}
	
	void printAllPlayer() {
		for(int i=0;i<users.size();i++) {
			System.out.println((i+1)+"번 Player의 카드: "+users.get(i));
		}
		System.out.println();
	}
	
	void printPlayerMoney() {
		for(int i=0; i<userMoney.size();i++) {
			System.out.printf("%d번 Player의 소지금액:%d \n",i+1,userMoney.get(i));
		}
	}
}








