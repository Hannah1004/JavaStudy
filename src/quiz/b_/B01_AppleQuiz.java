package quiz.b_;

import java.util.Scanner;

public class B01_AppleQuiz {

	public static void main(String[] args) {
		int BASKET = 10;
		int appleCount, basketCount;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구매하고 싶은 사과의 개수를 입력하세요>> ");
		appleCount = scan.nextInt();
		basketCount = appleCount/BASKET;
		
		if(appleCount/BASKET==0) {
			System.out.println("필요한 바구니의 개수는 1개 입니다");
		} else if(appleCount % BASKET == 0){
			System.out.println("필요한 바구니의 개수는 "+basketCount+"개 입니다");
		} else if(appleCount % BASKET != 0) {
			System.out.println("필요한 바구니의 개수는 "+(basketCount+1)+"개 입니다");
		}
	}

}
