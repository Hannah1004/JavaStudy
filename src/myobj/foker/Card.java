package myobj.foker;

import java.util.ArrayList;
import java.util.Collections;

public class Card {
	final private int SUITNUM = 4;
	final private int RANKSNUM = 13;
	final private static char[] SUITS = { '¢½', '¡Þ', '¢¼', '¢À' };
	final private static String[] RANKS = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	boolean hidden;
	public static ArrayList<String> cards = new ArrayList<>();
	public static ArrayList<String> usedCards = new ArrayList<>();

	Card() {
		for (int i = 0; i < SUITNUM; ++i) {
			for (int j = 0; j < RANKSNUM; ++j) {
				cards.add(SUITS[i] + RANKS[j]);
			}
		}
		Collections.shuffle(cards);
	}

	String selectCard() {
		String card = cards.remove(0);
		usedCards.add(card);
		return card;
	}

	void giveCardAllUsers(int userNum, int seet) {
		Player player = new Player();
		for (int i = 0; i < userNum; i++) {
			if (player.engage.get(i)) {
				for (int j = 0; j < seet; j++) {
					player.getCard(i, selectCard());
				}
			}
		}
	}

	public static void main(String[] args) {
		Card card = new Card();
		System.out.println(cards.get(0));

	}

}
