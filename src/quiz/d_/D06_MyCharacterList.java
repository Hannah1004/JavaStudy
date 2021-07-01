package quiz.d_;

import java.util.TreeSet;

public class D06_MyCharacterList {
	public static void main(String[] args) {
		TreeSet<D06_MyCharacter> character = new TreeSet<>();
		
		for(int i=0; i<100; i++) {
			character.add(new D06_MyCharacter());
		}
		
		//System.out.println(character);
		
		D06_MyCharacter start = new D06_MyCharacter();
		D06_MyCharacter end = new D06_MyCharacter();
		
		start.avgPower = 200;
		end.avgPower = 400;
		
		System.out.println("평균공격력 200-400 사이 user의 수: "+character.subSet(start, end).size());
		System.out.println(character.subSet(start, end));
	}
}








