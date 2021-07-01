package quiz.b_;

import java.util.Scanner;

public class B09_31Game {

	public static void main(String[] args) {
		int user, com, sequence;
		int gameNum=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("선공할 플레이어를 정하겠습니다(1-user, 2- com)");
		sequence = (int) (Math.random() * 2 + 1);
		
		if(sequence == 1) {
			System.out.printf("%d: user의 선공입니다.\n",sequence);
			while(true) {
				System.out.print("user의 차례입니다. 숫자를 입력해주세요>>");
				user = scan.nextInt();
				if(user < 0 || user > 3) {
					System.out.println("범위가 벗어났습니다.");
					continue;
				}
				gameNum+=user;
				System.out.println("현재숫자:"+gameNum);
				if(gameNum >= 31) {
					System.out.println("user의 패배입니다.");
					break;
				}
				System.out.print("com의 차례입니다");
				com = (int) (Math.random() * 3 + 1);
				System.out.println(com);
				gameNum+=com;
				System.out.println("현재숫자:"+gameNum);
				if(gameNum >= 31) {
					System.out.println("com의 패배입니다.");
					break;
				}
			}
			
		}else {
			System.out.printf("%d: com의 선공입니다.\n",sequence);
			while(true) {
				System.out.print("com의 차례입니다>> ");
				com = (int) (Math.random() * 3 + 1);
				System.out.println(com);
				gameNum+=com;
				System.out.println("현재숫자:"+gameNum);
				if(gameNum >= 31) {
					System.out.println("com의 패배입니다.");
					break;
				}
				
				System.out.print("user의 차례입니다. 숫자를 입력해주세요>>");
				while(true) {
					user = scan.nextInt();
					if(user < 0 || user > 3) {
						System.out.println("범위가 벗어났습니다");
						System.out.print("다시 입력해주세요>> ");
						continue;
					}else {
						break;
					}
				}
				gameNum+=user;
				System.out.println("현재숫자:"+gameNum);
				if(gameNum >= 31) {
					System.out.println("user의 패배입니다.");
					break;
				}
			}
		}
	}

}
