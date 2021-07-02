package quiz.d_;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class D11_DiscountDay {

	/*
	 	 어떤 옷가게에서 할인 행사를 짝수번째 목요일마다 진행한다고 한다.
	 	 년도를 입력하면 해당 년도의 모든 할인 날짜를 출력해주는 프로그램을 만들어보세요.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputYear;
		System.out.print("년도를 입력하세요 >> ");
		inputYear = sc.nextInt();

		printEventOfYear(inputYear);
	}
	
	public static Calendar getFirstEventDay(int inputYear) {
		Calendar event = Calendar.getInstance();
		
		event.set(inputYear, 0, 1);
		event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		
//		while(event.get(Calendar.DAY_OF_WEEK) != Calendar.THURSDAY) {
//			event.add(Calendar.DATE, 1);
//		}
		
		if(event.get(Calendar.YEAR) != inputYear) {
			event.add(Calendar.DATE, 7);
		}
		
		return event;
	}
	
	public static void printEventOfYear(int inputYear) {
		
		SimpleDateFormat eventDateFormat = new SimpleDateFormat("[y년 이벤트] M월 d일 E요일");
		Calendar event = getFirstEventDay(inputYear);
		
		int count = 0;
		
		while(event.get(Calendar.YEAR) == inputYear) {
			
			event.add(Calendar.DATE, 7);
			
			if(event.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 0) {
				System.out.println(eventDateFormat.format(event.getTime()));
				count++;
			}
		}
		System.out.println("올해의 이벤트는 총  " + count + "회 입니다.");
	}
	
}	

// 내가 한것
//	for(int i = 0; i < 12; i++) {
//		int maxDay = event.getActualMaximum(Calendar.DAY_OF_MONTH);
//		
//		for(int j = 1; j <= maxDay; ++j) {
//			int weekDay = event.get(Calendar.DAY_OF_WEEK); // 요일
//			event.set(Calendar.YEAR, inputYear);
//			event.set(Calendar.MONTH, i);
//			event.set(Calendar.DATE, j);
//			
//			if(weekDay == 4 && (event.get(Calendar.WEEK_OF_MONTH) == 2 || event.get(Calendar.WEEK_OF_MONTH) == 4)) {
//				System.out.println(getCurrentDate(event));
//			}
//		}
//	}
