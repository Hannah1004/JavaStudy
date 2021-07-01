package study.d_;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class D08_String {
	public static void main(String[] args) {
		String fruits = "apple/banana/orange/pineapple/kiwi";
		
		//String.split(delimiter) : 문자열을 원하는 기준으로 자른 문자열 배열을 반환
		
		String splitted[] = fruits.split("/");
		
		for(int i=0; i< splitted.length; i++) {
			System.out.println(i+": "+splitted[i]);
		}
		
		//String.join(delim, 이어붙일 것) : 여러 문자열을 원하는 구분자를 추가하여 이어붙인다.
		String after = String.join(",", splitted);
		System.out.println(after);
		System.out.println(String.join("-", "연어","장어","우럭","도미"));
		
		printRabbitWithMessage("커피", "우유", "주스", "당근", "피망");
		printRabbitWithMessage("감자", "고구마");
		
		//substring(start): 문자열을 start부터 마지막까지 자른 인스턴스를 반환
		//substring(start,end): 문자열을 start부터 end미만까지 자른 인스턴스를 반환		
		String year= "991234-1234567".substring(0,2);
		System.out.println(year);
		
		//contains(seq): 문자열에 해당 문자열이 포함되어 있는지 검사한다
		String ph = "010-1234-4321";
		System.out.println(ph.contains("1234"));
		System.out.println(ph.contains("5678"));
		
		//startWith(seq): 문자열이 해당 문자열로 시작하는지 검사
		System.out.println(ph.startsWith("010"));
		
		//endsWith(seq) : 문자열이 해당 문자열로 끝나는지 검사
		System.out.println(ph.endsWith("4"));
		
		//replace(old, new) : 문자열을 다른 문자열로 교체한 인스턴스를 반환한다
		String result = ph.replace("1234", "abcd");
		System.out.println("원본: "+ ph + "결과: "+result);
		
		//getByte() : 문자열을 byte[]로 변환한다
		System.out.println(Arrays.toString("Hello".getBytes()));
		System.out.println(Arrays.toString("안녕하세요".getBytes()));
		
		//byte[]로 나눠졌던 데이터들을 다시 문자열로 합칠 수 있다
		//byte[] message = "안녕하세요 반갑습니다.".getBytes();
		//System.out.println(new String(message));
		
		//어떤 규칙을 사용해 byte[]로 변환할지 결정할 수 있다.
		try {
			System.out.println(Arrays.toString("안녕하세요 반갑습니다.".getBytes("UTF-8")));
			System.out.println(Arrays.toString("안녕하세요 반갑습니다.".getBytes("UTF-16")));
			System.out.println(Arrays.toString("안녕하세요 반갑습니다.".getBytes("EUC-KR")));
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		byte[] message = "안녕하세요 반갑습니다.".getBytes();
		System.out.println(new String(message));
		
		//trim() : 문자열 바깥쪽의 공백을 제거해준다
		String userInput = "  java";
		String answer = "java";
		
		System.out.println(userInput.trim().equals(answer));
		
		//toUpperCase() : 문자열을 대문자로 변환한 인스턴스를 반환
		//toLowerCase() : 문자열을 소문자로 변환한 인스턴스를 반환
		String text = "hello, java!!";
		System.out.println(text.toUpperCase());
		System.out.println(text.toUpperCase().toLowerCase());
		
		// indexOf(seq): 원하는 문자열의 인덱스를 반환
		// indexOf(seq, start): 원하는 문자열의 인덱스를 반환, 시작위치를 정할 수 있음
		String languages = "Java, Python, C, C++, C#, Kotlin, JavaScript";
		languages += languages;
		languages += languages;
		languages += languages;
		
		System.out.println(languages.indexOf("Java"));
		System.out.println(languages.indexOf("Java",1));
		
		int lanIndex=0;
		ArrayList<Integer> index = new ArrayList<>();
		while(lanIndex!=-1) {
			for(int i=lanIndex; i<languages.length();i++) {				
				if(lanIndex!=0) {
					lanIndex = languages.indexOf(i);
					index.add(i);
				}
			}	
		}
		System.out.println(index);
	}
	
	// TYPE...: 가변인자, 정해지지 않은 개수의 인자를 해당 타입 배열로 넘겨받을 수 있다
	// 항상 가변인가는 메서드의 마지막에 정의해야한다.
	static void printRabbitWithMessage(String... msgs) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >♡)");
		System.out.println(Arrays.toString(msgs));
	}
}















