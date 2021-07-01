package myobj.blackjack;

public class Dealer extends Player{
	
	void add(Card card) {
		if(count==0) {
			card.hidden = true;
		}
		if(card.rank==0) {
			ace_count++;
		}
		
		tables[count++] = card;
	}
}
