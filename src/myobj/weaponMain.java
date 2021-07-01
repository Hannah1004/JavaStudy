package myobj;

public class weaponMain {

	public static void main(String[] args) {
		Weapon wp = new Weapon(1);
		for(int i=1; i<=30; i++) {
			wp.reinforce();
		}
		wp.attackPowerCheck();
	}

}
