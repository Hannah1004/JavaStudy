package quiz.d_;


public class D02_LottoMain {
	
	public static void main(String[] args) {
		D02_Lotto lo = new D02_Lotto();
		lo.winNumChoice();
		while (!lo.win) {
			lo.userChoice();
			lo.winCheck();
			lo.clear();
		}
	}
}
