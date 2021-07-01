package quiz.a_;

public class A09_ConditionQuiz {

	public static void main(String[] args) {
		int a=15, b=4, c=21, hour = 20;
		int d = 3, e = 33, year = 120;
		int minsuAge = 22, cheolsuAge = 20;
		int minsuMonth = 3, cheolsuMonth = 6;
		boolean powerOn = false;
		String str = "yes";
		
		System.out.println("1:"+(a > 10 && a < 20));
		System.out.println("2:"+(b % 2 == 0));//(b % 2 != 1)
		System.out.println("3:"+(c % 7 == 0));
		System.out.println("4:"+(!(hour < 0 || hour >= 24) && hour >= 12));//(hour < 24 && hour >= 12)
		System.out.println("5:"+(((e-d) == 30) || (d-e) == 30));//(Math.abs(d-e)==30)
		System.out.println("6:"+(year % 400 == 0 || (year %4 == 0 && year % 100 != 0)));
		System.out.println("7:"+(minsuAge - cheolsuAge == 2));
		System.out.println("8:"+(cheolsuMonth - minsuMonth == 3));
		System.out.println("9:"+(!powerOn));
		
		//타입명이 대문자로 시작하는 참조형 변수들은 반드시 .equals()를 이용해 비교해야 한다.
		//참조형 변수의 == 비교는 두 변수가 서로 같은 주소를 지니고 있는지를 비교한다.
		System.out.println("10:"+(str.equals("yes")));

	}

}
