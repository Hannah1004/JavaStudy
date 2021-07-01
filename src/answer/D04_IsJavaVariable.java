package answer;

import java.util.Scanner;

public class D04_IsJavaVariable {
	
	public static void main(String[] args) {
		String str = "String";
		
		System.out.println(str.toCharArray());
		
		System.out.println(check("java123".toCharArray()));
		
	}
	
	public static boolean check(char[] str) {
		//Character.isJavaIdentifierStart : 자바 변수명의 첫 번째 글자로 적합한지 체크
		boolean check = Character.isJavaIdentifierStart(str[0]);
		
		// Character.isJavaIdentifierPart : 자바 변수명의 나머지 부분으로 적합한지 체크
		for(int i=0;i<str.length;i++) {
			check = check && Character.isJavaIdentifierPart(str[i]);
		}
		
		return check;
	}

}












