package answer;

import java.util.*;

public class D02_Lotto {
	// quiz패키지에 D02_Lotto를 강사님이 풀어준 버전

	final private static int LOTTO_SIZE = 45;
	final private static int BONUS_INDEX = 3;

	private int bonus = 0;

	public Set<Integer> generate(int len) {
		HashSet<Integer> lotto = new HashSet<>();

		while (lotto.size() != len) {
			int ranNum = (int) (Math.random() * LOTTO_SIZE + 1);
			// System.out.println("Set에 " + ranNum + "이 더해집니다.");
			lotto.add(ranNum);

			if (lotto.size() == BONUS_INDEX) {
				bonus = ranNum;
			}
		}

		return lotto;
	}

	public static void main(String[] args) {
		D02_Lotto quiz = new D02_Lotto();

		Set<Integer> win = quiz.generate(7);

		System.out.println("당첨번호는 " + win + "입니다. 그 중 보너스 번호는 " + quiz.bonus + "입니다.");

		List<Integer> checkList = new ArrayList<>(7);
		long spent = 0;
		long count = 0;

		while (true) {
			Set<Integer> blackCow = quiz.generate(6);
			count++;

			checkList.addAll(win);
			checkList.removeAll(blackCow);

			if (checkList.size() == 1) {
				spent = count * 1000;
				if (checkList.get(0) == quiz.bonus) {
					System.out.println("1등 당첨입니다. 쓰신 돈은 " + spent + "원 입니다.");
				} else {
					System.out.println("2등 당첨입니다. 쓰신 돈은 " + spent + "원 입니다.");
				}
				break;
			}
			checkList.clear();
		}
	}
}
