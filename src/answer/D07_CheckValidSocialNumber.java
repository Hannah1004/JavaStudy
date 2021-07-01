package answer;

import java.util.Collections;
import java.util.HashSet;

public class D07_CheckValidSocialNumber {
	private static HashSet<Integer> month30;
	private static HashSet<Integer> month31;
	
	static {
		month30 = new HashSet<>();
		month31 = new HashSet<>();		
		
		Collections.addAll(month30 ,4,6,9,11);
		Collections.addAll(month30 ,1,3,5,7,8,10,12);
	}
	
	private static boolean validGender(char gender) {
		return gender >='1' && gender <='4';
	}
	
	public static int calcYear(int year, char gender) {		
		return gender < '3'? year+1900 : year+2000;
	}
	
	public static boolean check(String sn) {
		char[] sn_arr = sn.toCharArray();
		
		int year = Integer.parseInt(""+sn_arr[0]+sn_arr[1]);
		year = calcYear(year, sn_arr[7]);
		int month = Integer.parseInt(""+sn_arr[2]+sn_arr[3]);
		int date = Integer.parseInt(""+sn_arr[4]+sn_arr[5]);
		
		if(!validGender(sn_arr[7])) {
			System.out.println("성별에 문제가 있습니다.");
			return false;
		}else if(month30.contains(month) && (date <1 || date >30)) {
			System.out.println("날짜에 문제가 있습니다.");
			return false;
		}else if(month31.contains(month31) && (date <1 || date >31)) {
			System.out.println("날짜에 문제가 있습니다.");
			return false;
		}else if(month==2) {
			boolean leapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
			if(leapYear && (date< 1 ||date>29)) {
				System.out.println("윤년은 29일까지 입니다.");
			}else if(!leapYear && (date < 1 || date > 28)){
				System.out.println("2월은 28일까지 입니다.");
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		if (check("000229-3234567")) {
			System.out.println("옳바른 주민번호 입니다.");
		}else {
			System.out.println("잘못된 주민번호 입니다.");
		}
	}
}

















