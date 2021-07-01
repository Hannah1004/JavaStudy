package study.b_;

public class B02_CharAt {

	public static void main(String[] args) {
		/*
			"문자열".charAt(index);
				- 해당 문자열에서 원하는 번째의 문자를 char타입으로 꺼내는 함수
				- 첫 번째 문자는 0번 인덱스
			
			"문자열".length();
				- 해당 문자열이 총 몇글자인지를 int타입으로 알려줌
		 */
		String text = "Hello, everyone!!";
		
		System.out.println(text.charAt(0));
		System.out.println(text.charAt(1));
		System.out.println(text.charAt(2));
		System.out.println(text.charAt(3));
		System.out.println(text.length());
		
		//0번 인덱스부터 17개의 문자가 있기 때문에 16번이 마지막 인덱스
		System.out.println(text.charAt(text.length()-1));
		System.out.println(text.charAt(text.length()-2));
		System.out.println(text.charAt(text.length()-3));
		System.out.println(text.charAt(text.length()-4));
	}

}
