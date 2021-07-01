package quiz.d_;

import java.util.ArrayList;
import java.util.Random;

public class D02_Lotto {
	static boolean win = false;
	static int count=0;
	static double useMoney = 0;
	private int specialNum;

	Random random;
	
	ArrayList<Integer> lotto = new ArrayList<>();
	ArrayList<Integer> user = new ArrayList<>();
	ArrayList<Integer> matchNum = new ArrayList<>();

	void winNumChoice() {
		for (int i = 0; i < 6; i++) {
			int num;
			while (true) {
				num = (int) (Math.random() * 45 + 1);
				if (!lotto.contains(num)) {
					lotto.add(num);
					break;
				}
			}
		}
		while (true) {
			int num;
			num = (int) (Math.random() * 45 + 1);
			if (!lotto.contains(num)) {
				specialNum = num;
				break;
			}
		}
	}

	void userChoice() {
		count++;
		useMoney += 1000;
		for (int i = 0; i < 6; i++) {
			int num;
			while (true) {
				num = (int) (Math.random() * 45 + 1);
				if (!user.contains(num)) {
					user.add(num);
					break;
				}
			}
			if (lotto.contains(user.get(i))) {
				matchNum.add(user.get(i));
			}
		}
	}

	void clear() {
		user.clear();
		matchNum.clear();
	}

	void winCheck() {
		if (matchNum.size() == 6) {
			System.out.println("축하합니다 1등에 당첨되셨습니다!");
			System.out.println("맞은번호: " + matchNum);
			System.out.println("로또번호: " + lotto);
			System.out.println("선택번호: " + user);
			System.out.printf("총 시도 횟수는 %d번이고 사용하신 금액은 %.0f원 입니다.",count,useMoney);
			win = true;
		} else if (matchNum.size() == 5) {
			if (user.contains(specialNum)) {
				matchNum.add(specialNum);
				System.out.println("축하합니다 2등에 당첨되셨습니다!!");
				System.out.println("당첨번호: " + matchNum + " 스페셜번호: " + specialNum);
				System.out.println("로또번호: " + lotto);
				System.out.println("선택번호: " + user);
				System.out.printf("총 시도 횟수는 %d번이고 사용하신 금액은 %.0f원 입니다.",count,useMoney);
				win = true;
			}
		}
	}
}
