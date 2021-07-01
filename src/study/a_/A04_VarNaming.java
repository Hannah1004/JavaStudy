package study.a_;

public class A04_VarNaming {

	public static void main(String[] args) {
		/*
		 	변수 사용 이유
		 	- 값을 한번에 변경 가능
		 	- 값에 의미를 부여 가능
		*/
		int apple_count = 8;
		int apple_price = 487;
		int apple_calorie = 123;
		
		System.out.println("사과의 개수: "+apple_count+"개");
		System.out.println("사과의 개당 가격: "+apple_price+"원");
		System.out.println("사과의 개당 칼로리: "+apple_calorie+"kcal");
		System.out.println("사과의 총 가격: "+apple_count*apple_price+"원");
		System.out.println("사과의 총 칼로리: "+apple_count*apple_calorie+"kcal");
	
		/*
		 	#선택사항
		 	
		 	두 단어를 이어 붙인 변수명은 _를 활용(snake_case)
		 		apple_count, minsu_age
		 		
		 	두 단어 이상을 이어붙은 변수명을 사용할 때 대문자를 활용(camelCase)
		 		appleCount, minsuAge
		 	
		 	변수명 첫 글자는 소문자
		 		apple, height
		 	
		 	클래스명 첫 글자는 대문자
		 		Person, Exam
		 	
		 	프로그램 내에서 값이 변하지 않을 변수(상수)는 모두 대문자 사용
		 		PI, APPLE_CALORIE
		 		
		 	변수의 용도를 추측할 수 있는 적절한 단여 사용
		 		abc(x)
		 	
		 	#필수사항
		 	
		 	변수의 첫 글자는 숫자가 될 수 없음
		 		1st, 2nd
		 	
		 	변수명 사이에는 공백을 사용할 수 없음
		 	
		 	특수문자는 _와 $만 사용할 수 있음
		 	
		 	이미 사용하고 있는 키워드는 사용 불가(eclipse 상에서 보라색으로 표시)
		 		int, short, char, void, static, public
		 	
		*/
		
	}
}












