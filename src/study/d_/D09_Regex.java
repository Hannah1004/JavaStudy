package study.d_;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	/*
		정규 표현식 (Regular Expression)
			- 문자열의 패턴을 표현할 수 있는 표현식
			- 특정 프로그래밍 언어에 종속되지 않는 공통의 규칙
			- 정의한 문자열 패턴과 일치하는 문자열을 걸러낼 수 있다.
		
		Java에서 정규표현딕을 다룰 떄 사용하는 클래스
			- Pattern
			- Matcher
	 */
	public static void main(String[] args) {
		//Pattern.matches(regex, input) : input이 regex에 일치하는지 여부를 검사
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		//[]: 해당 위치의 한 글자에 어떤 문자들이 올 수 있는지 정의하는 표현식
		System.out.println(Pattern.matches("s[ㅣ@]eep", "sleep"));
		System.out.println(Pattern.matches("s[ㅣ@]eep", "sheep"));
		System.out.println(Pattern.matches("s[ㅣ@]eep", "s@eep"));
		System.out.println(Pattern.matches("s[ㅣ@]eep", "saeep"));
		System.out.println(Pattern.matches("s[ㅣ@]ee[abcdefghijk]", "sleek"));
		System.out.println(Pattern.matches("s[ㅣ@]ee[abcdefghijk]", "sleeK"));
		
		System.out.println("----------------------------------");
		
		/*
			[abc] : 해당자리에 a또는 b또는 c허용
			[^abc] : 해당자리에 abc를 제외한 모든것을 허용
			[a-z] : a부터 z까지 모두 허용
			[A-Z] : A부터 Z까지 모두 허용
			[\\-] : 문자로서 -를 허용 (Escape) 평소에는 그냥 -만써도 괜찮음 영어 사이에 붙을때만 \\사용
			[a-e&&c-z] : a-e와 c-z를 모두 만족시키는 교집합
		 */
		
		System.out.println(Pattern.matches("s[A-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[A\\-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[a-e&&c-z]eep", "saeep"));
		System.out.println("----------------------------------");
		
		/*
			하나로 여러 문자를 나타내는 것들
			
				. : 모든문자
				\d : 모든숫자
				\D : 숫자를 제외한 모든것
				\s : 모든 공백 (\t \n \r)
				\S : 공백을 제외한 모든것
				\w : 일반적인 문자들을 허용[a-zA-Z0-9_]
				\W : \w를 제외한 모든것
		 */
		System.out.println(Pattern.matches("s.eep", "s3eep"));
		System.out.println("----------------------------------");
		/*
			해당 패턴이 적용될 문자의 개수를 정의하는 방법
			[.]{n} : {}앞의 패턴이 n개 일치해야 한다 
			[.]{n,m} : {}앞의 패턴이 최소 n개 최대 m개 일치해야한다
			[.]{n,} : {}앞의 패턴이 최소 n개이상 일치해야한다
			[.]? : ?앞의 패턴이 0번또는 한번 나와야 한다
			[.]+ : +앞의 패턴이 최소 한번 이상 나와야 한다
			[.]* : *앞의 패턴이 최소 0번 이상 나와야 한다
		 */
		System.out.println(Pattern.matches("[.a-zA-Z]{5}", "abs..")); 
		System.out.println(Pattern.matches("[.]{2,5}", "..."));
		System.out.println(Pattern.matches("s?heep","sheep"));
		System.out.println(Pattern.matches("s?heep","sssheep"));
		System.out.println(Pattern.matches("s?heep","heep"));
		System.out.println(Pattern.matches("s?heep","kheep"));
		System.out.println(Pattern.matches("s+heep","sssssheep"));
		System.out.println(Pattern.matches("s+heep","heep"));
		
		System.out.println("----------------------------------");
		
		//핸드폰번호
		System.out.println(Pattern.matches("010-\\d{4}-\\d{4}", "010-1234-1234"));
		System.out.println(Pattern.matches("010-\\d{4}-\\d{4}", "010-12234-1234"));
		System.out.println(Pattern.matches("010-\\d{4}-\\d{4}", "010-1234-12t4"));
		System.out.println(Pattern.matches("010-?[2-9]\\d{3}-\\d{4}", "010-1234-12t4"));
		
		//주민등록번호
		System.out.println(Pattern.matches("\\d{2}[0-1]\\d[0-3]\\d-[1-4]\\d{6}", "960520-1234567"));
		System.out.println(Pattern.matches(
				"\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01]-?[1-4]\\d{6})", "960520-1234567"));
		
		//이메일
		System.out.println(Pattern.matches("\\w+@\\w+(\\.\\w+)?(\\.\\w+)","ggg123@gmail.com"));
		
		// Match 사용해서 긴 문자열 검사하기
		String fruit ="apple/banana/orange/pineapple/greenapple/redapple/mango";
		
		Pattern pattern1 = Pattern.compile("na");
		
		// pattern1로 fruit을 검사한 결과를 반환한다
		Matcher matcher = pattern1.matcher(fruit);
		
		// matcher.find() : 찾은 것들 중에 다음 것이 존재하면 true
		while(matcher.find()) {
			System.out.println("찾은 것: "+matcher.group());
			System.out.println("위치: "+matcher.start()+"부터"+ matcher.end()+"까지");
			System.out.println(fruit.substring(matcher.start(),matcher.end()));
		}
	}
}















