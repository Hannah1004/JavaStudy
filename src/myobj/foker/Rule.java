package myobj.foker;

import java.util.*;

public class Rule {
	final private int SUITNUM = 4;
	final private int RANKSNUM = 13;
	final private static char[] SUITS = { '♡', '◇', '♠', '♣'};
	final private static String[] RANKS = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	
	ArrayList<ArrayList> suitsNum;
	ArrayList<ArrayList> ranksNum;
	ArrayList<Integer> userScore;
	
	Rule(){
		suitsNum = new ArrayList<>();
		ranksNum = new ArrayList<>();
	}
	
	void makeCheckList(int num) {
		userScore = new ArrayList<>();
		
		for(int i=0; i<num;i++) {
			ArrayList<Integer> list = new ArrayList<>(SUITNUM);
			suitsNum.add(list);		
			ArrayList<Integer> list2 = new ArrayList<>(RANKSNUM);
			ranksNum.add(list2);
		}
		for(int i=0; i<num; i++) {
			for(int j=0;j<SUITNUM;j++) {
				suitsNum.get(i).add(0);
			}
			for(int j=0;j<RANKSNUM;j++) {
				ranksNum.get(i).add(0);
			}
		}
		
	}
	
	void checkCardCount(int user, String card) {
		for(int i=0;i<SUITNUM;i++) {
			if(card.charAt(0)==SUITS[i]) {
				int num = (int) suitsNum.get(user).get(i);
				suitsNum.get(user).set(i,num+1);
			}
		}
		
		String rank ="";
		for(int i=0;i<card.length();i++) {
			if(i!=0) {
				rank+=card.charAt(i);
			}
		}
		for(int i=0;i<RANKSNUM;i++) {
			if(rank.equals(RANKS[i])) {
				int num = (int) ranksNum.get(user).get(i);
				ranksNum.get(user).set(i,num+1);
			}
		}
	}
	
	void checkCard(int user) {
		int maxSuit = (int) Collections.max(suitsNum.get(user));
		int maxRank = (int) Collections.max(ranksNum.get(user));
		if(maxSuit>=5 && (int)ranksNum.get(user).get(0)>=1 && (int)ranksNum.get(user).get(9)>=1
				&& (int)ranksNum.get(user).get(10)>=1 && (int)ranksNum.get(user).get(11)>=1
				&& (int)ranksNum.get(user).get(12)>=1){
			System.out.println("로얄 스트레이트 플러시입니다!!");
			userScore.add(12);
		}else if(maxSuit>=5) {
			int count=0;
			for(int i=0; i<ranksNum.get(user).size();i++) {
				if((int)ranksNum.get(user).get(i)>=1) {
					count++;
				}else {
					count=0;
				}
			}
			if(count>=5) {
				System.out.println("스트레이트 플러쉬입니다!!");
				userScore.add(11);
			}
		}else if(maxRank>=4) {
			System.out.println("포카드입니다!!");
			userScore.add(10);
		}else if(maxRank==3 && ranksNum.get(user).contains(2)==true) {
			System.out.println("풀하우스입니다!!");
			userScore.add(9);
		}else if(maxSuit>=5) {
			System.out.println("플러쉬입니다!!");
			userScore.add(8);
		}else if((int)ranksNum.get(user).get(0)>=1 && (int)ranksNum.get(user).get(9)>=1
				&& (int)ranksNum.get(user).get(10)>=1 && (int)ranksNum.get(user).get(11)>=1
				&& (int)ranksNum.get(user).get(12)>=1) {
			System.out.println("마운틴입니다!!");
			userScore.add(7);
		}else if((int)ranksNum.get(user).get(0)>=1 && (int)ranksNum.get(user).get(1)>=1
				&& (int)ranksNum.get(user).get(2)>=1 && (int)ranksNum.get(user).get(3)>=1
				&& (int)ranksNum.get(user).get(4)>=1) {
			System.out.println("백스트레이트입니다!!");
			userScore.add(6);
		}else if(maxRank==3) {
			System.out.println("트리플입니다!!");
			userScore.add(4);
		}else if((int)Collections.frequency(ranksNum.get(user), 2)>=2) {
			System.out.println("투페어입니다!!");
			userScore.add(3);
		}else if((int)Collections.frequency(ranksNum.get(user), 2)>=1) {
			System.out.println("원페어입니다!!");
			userScore.add(2);
		}else if((int)Collections.frequency(ranksNum.get(user), 1)>=1) {
			System.out.println("탑입니다!!");
			userScore.add(1);
		}
		int count=0;
		for(int i=0; i<ranksNum.get(user).size();i++) {
			if((int)ranksNum.get(user).get(i)>=1) {
				count++;
			}else {
				count=0;
			}
		}
		if(count>=5) {
			System.out.println("스트레이트입니다!!");
			userScore.add(5);
		}
		System.out.println();
	}
	
	void winnerCheck() {
		boolean sameCheck[] = new boolean[new Foker().playerNum];
		int maxNum [] = new int[new Foker().playerNum];
		int max = (int)Collections.max(userScore);
		int winner=0;
		if(max==1 && Collections.frequency(userScore, max)>=2) {
			for(int i=0;i<new Foker().playerNum;i++) {
				if(userScore.get(i)==max) {
					sameCheck[i]=true;
				}
				if(sameCheck[i]) {
					for(int j=0;j<ranksNum.get(i).size();j++) {
						int count=0;
						count += (int)ranksNum.get(i).get(j);
						if(count==7) {
							maxNum[i] = j;
						}
					}
				}
			}
			int a = -99;
			for(int i=0;i<maxNum.length;i++) {
				if(maxNum[i]>a) {
					a=maxNum[i];
					winner = i;
				}
			}
		}else {
			winner = userScore.indexOf(max);
		}
		int curMoney = new Player().userMoney.get(winner);
		new Player().userMoney.set(winner, curMoney+new Foker().gameMoney);
		System.out.printf("승자는 %d번Player입니다!!\n",winner+1);
		System.out.printf("총 베팅액 %d원을 수령하셨습니다\n",new Foker().gameMoney);
	}

	
	void printRule() {
		System.out.println(suitsNum);
		System.out.println(ranksNum);
	}
}
























