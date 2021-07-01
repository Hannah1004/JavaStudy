package quiz.d_;

import java.util.Scanner;

public class D07_CheckValidPhoneNumber {
	Scanner scan;

	void checkPhone() {
		String phone;
		while (true) {
			int checkCount=0;
			scan = new Scanner(System.in);
			System.out.print("핸드폰 번호를 입력해주세요:");
			phone = scan.nextLine();
			if (phone.charAt(3) != '-' || phone.charAt(8) != '-') {
				System.out.println("잘못된 번호입니다. 다시 입력해 주세요.");
			}else {
				for(int i=0;i<phone.length();i++) {
					char ch = phone.charAt(i);
					if(i==3 || i==8) {
						continue;
					}else if(ch<'0'||ch>'9') {
						System.out.println("잘못된 번호입니다. 다시 입력해주세요. ");
						break;
					}else {
						checkCount++;
					}
				}
			}
			if(checkCount==11) {
				break;
			}
		}
		System.out.println("입력하신 번호:"+phone+"가 입력되었습니다.");
	}
	
	public static void main(String[] args) {
		new D07_CheckValidPhoneNumber().checkPhone();
	}
}
