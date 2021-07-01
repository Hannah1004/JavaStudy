package quiz.d_;

import java.util.Random;

public class D06_MyCharacter implements Comparable<D06_MyCharacter> {
	int makeNum;
	int attackPower;
	int swordPower;
	int basicPower;
	double avgPower;
	
	static int startNum = 100;
	static final int OBJNUM = 3;
	
	D06_MyCharacter(){
		makeNum = startNum++;
		attackPower = (int)(Math.random()*500+1);
		swordPower = (int)(Math.random()*500+1);
		basicPower = (int)(Math.random()*500+1);
		avgPower = (attackPower+swordPower+avgPower) / (double)OBJNUM;
	}
	
	public String toString() {
		return String.format("[%d]번 user의 평균 공격력은 %.2f입니다.\n", makeNum, avgPower);
	}

	@Override
	public int compareTo(D06_MyCharacter o) {
		return Double.compare(avgPower, o.avgPower) !=0?
				Double.compare(avgPower, o.avgPower) : Integer.compare(this.makeNum, o.makeNum);
	}		
}








