package myobj;

public class Weapon {
	int attackPower;
	int nowReinLevel;
	double reinProbability[];
	int attackPowerIncrease[];
	
	Weapon(int nowReinLevel){
		reinProbability = new double[] {0,100,100,90,60,45,30,30,30,15,15,15,10,10,10,5,5,3,3,2,2,1,1};
		attackPowerIncrease = new int[] {5000,100,130,140,150,160,170,180,190,200,210,240,270,320,360,430,1000,1200,1400,1600,1750,1900,2200};
		
		this.nowReinLevel = nowReinLevel;
		for(int i=0; i<nowReinLevel;i++) {
			attackPower += attackPowerIncrease[i];
		}
	}
	
	void reinforce() {
		
		if(nowReinLevel==reinProbability.length) {
			System.out.println("더이상 강화할 단계가 없습니다.");
		}else {
			int pro = (int)(Math.random() * 100 + 1);
			if(pro <= reinProbability[nowReinLevel]) {
				System.out.println("강화에 성공하셨습니다!!");
				attackPower+=attackPowerIncrease[nowReinLevel];
				nowReinLevel++;
				System.out.printf("이전 레벨 %d -> 현재 레벨 %d \n",nowReinLevel-1,nowReinLevel);
				System.out.printf("이전 공격력 %d -> 현재 공격력 %d \n",attackPower-attackPowerIncrease[nowReinLevel],attackPower);
			}else {
				System.out.println("강화에 실패해셨습니다.");
			}
		}
	}
	
	void attackPowerCheck() {
		System.out.printf("현재레벨은 %d 현재 공격력은 %d 입니다\n",nowReinLevel,attackPower);
	}
}



