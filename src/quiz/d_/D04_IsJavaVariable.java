package quiz.d_;

import java.util.Scanner;

public class D04_IsJavaVariable {
	static boolean check = true;
	
	static void checkVariable() {
		Scanner scan = new Scanner(System.in);
		System.out.println("사용할 변수명을 입력해 주세요");
		String var = scan.nextLine();
		
		if(var.charAt(0)>='0' && var.charAt(0)<='9');{
			check = false;
			System.out.println("처음에 숫자는 올 수 없습니다.");
		}
		for(int i=0;i<var.length();i++) {
			char varCheck = var.charAt(i);
			if(varCheck==' ') {
				check = false;
				System.out.println("공백은 사용할 수 없습니다.");
				break;
			}else if(varCheck>='가' && varCheck <='힣') {
				check = false;
				System.out.println("한글은 사용할 수 없습니다.");
				break;
			}
			if((varCheck >= 'a' && varCheck <= 'z') || varCheck == '_' || varCheck == '$' || (varCheck >= '0' && varCheck <= '9')){
				
			}else {
				check = false;
				System.out.println("허용된 특수문자가 아닙니다");
			}
		}
	}
	public static void main(String[] args) {
		checkVariable();
	}
}












