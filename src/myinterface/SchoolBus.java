package myinterface;

public class SchoolBus implements Vehicle{	
	static int acc=0;
	static int student=0;

	@Override
	public int acceleration() {
		acc++;
		return acc;
	}

	@Override
	public int deceleration() {
		acc--;
		return acc;
	}

	@Override
	public boolean ride() {
		if(student>14) {
			return false;
		}else {
			student++;
			System.out.printf("현재인원: %d명 입니다.",student);
			return true;
		}

	}
	
}
