package answer;

import java.util.Scanner;

public class C17_InputRightPassword {
	static Scanner scan;
	static char[] specialCharacter = {'!','@','#','$','%','^','&','*'};
	
	public static void main(String[] args) {
		try {
	         try {
				test();
			} catch (OnlyOneKindException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SpecialCharacterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberLengthException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      } catch (NotNumberException e) {

	      }
	}

	public static void test() throws NotNumberException, OnlyOneKindException, SpecialCharacterException, NumberLengthException{
		String pass;
		int count=0;
		int numCount=0;
		int upperCount=0;
		int lowerCount=0;
		int scCount=0;
		
		scan = new Scanner(System.in);
		System.out.print("사용하실 비밀번호를 입력해주세요:");
		pass = scan.nextLine();
		
		if(pass.length()<8 || pass.length()>24) {
			throw new NumberLengthException();
		}
		
		for(int i=0; i<pass.length(); i++) {
			if(pass.charAt(i)>='0' && pass.charAt(i)<='9' ) {
				count++;
			}
		}
		if(count==pass.length()) {
			throw new NotNumberException();
		}
		
		for(int i=0; i<pass.length();i++) {
			char ch = pass.charAt(i);
			if(ch >= '0' && ch <='9') {
				numCount++;
			}else if(ch > 'a' && ch <'z') {
				lowerCount++;
			}else if(ch > 'A' && ch <'Z') {
				upperCount++;
			}else {
				boolean sc = false;
				for(int j=0;j<specialCharacter.length;j++) {
					if(ch==specialCharacter[j]) {
						sc = true;
						break;
					}
				}
				if(sc) {
					scCount++;
				}else {
					throw new SpecialCharacterException();
				}
			}
		}
		
		if(numCount==0 || upperCount==0 || lowerCount==0 || scCount==0) {
			throw new OnlyOneKindException();
		}
	}
}

class NotNumberException extends Exception {
	public NotNumberException() {
		super("모두 숫자인 패스워드는 사용할 수 없습니다.");
	}
}

class OnlyOneKindException extends Exception {
	public OnlyOneKindException() {
		super("대문자, 소문자, 숫자, 특수문자가 모두 섞여있어야 합니다.");
	}
}

class SpecialCharacterException extends Exception {
	public SpecialCharacterException() {
		super("지정된 특수문자가 아닙니다.");
	}
}

class NumberLengthException extends Exception {
	public NumberLengthException() {
		super("비밀번호의 길이가 알맞지 않습니다.");
	}
}