package myobj.coffee;

/**
	# 원산지 번호
	
		1. 한국
		2. 콜롬비아
		3. 브라질
		4. 에티오피아
*/
public class Coffee {
	
	String name;
	Origin origin;
	
	public Coffee(String name, Origin origin) {
		this.name = name;
		this.origin = origin;
	}
	
	// Coffee 클래스 사용자 코드
	public static void main(String[] args) {
		new Coffee("아메리카노", Origin.BRAZIL);
		new Coffee("아메리카노", Origin.SOUTH_KOREA);
	}

}
