package quiz.d_;

import java.time.LocalDate;
import java.util.Scanner;

public class MakeCalendar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		int month;
		
		System.out.print("궁금하신 년도를 적어주세요 >> ");
		year = sc.nextInt();
		
		System.out.print("궁금하신 달을 적어주세요 >> ");
		month = sc.nextInt();
		
		System.out.println("=====" + year + "년 " + month + "달 달력 =====");
		calendar(year, month);
		System.out.println("==========================");
		
	}
	
	public static void calendar(int year, int month) {
		
		LocalDate searchDate = LocalDate.of(year, month, 1);
		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
		
		int finalDate = searchDate.withDayOfMonth(searchDate.lengthOfMonth()).getDayOfMonth(); 
		
		for(int i = 0; i <= 6; ++i) {
			System.out.print(strWeek[i] + "  ");
		}
		System.out.println();
		
		System.out.println(searchDate.getDayOfWeek().getValue());
		
		for(int i = 1; i <= finalDate; ++i) {
			
			
			//System.out.println(searchDate.getDayOfWeek());
			System.out.print(i + " ");
		}
		
		System.out.println();
		
	}
	
	
}
