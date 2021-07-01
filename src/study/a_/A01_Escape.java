package study.a_;

public class A01_Escape {
	public static void main(String[] args) {
		// Escape 문자(특수한 기능을 가짐)
		// \+문자의 형태
		
		System.out.println("1. 안녕하세요, 반갑습니다.");
		
		// \n은 줄바꿈
		System.out.println("2. 안녕하세요, 반\n갑\n습니다.");
		
		// \t은 tab키
		System.out.println("3. 안녕하세요, 반\t갑\t습니다.");	
		
		// \\는 \키
		System.out.println("4. 안녕하세요, 반\\갑\\습니다.");
		
		// \" 그냥 "을 출력하고 싶을때
		System.out.println("말했습니다 \"나는 못해요\"");
		System.out.println("말했습니다 '나는 못해요'");
	}
}
