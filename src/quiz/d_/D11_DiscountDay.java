package quiz.d_;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class D11_DiscountDay {

	/*
	 	 � �ʰ��Կ��� ���� ��縦 ¦����° ����ϸ��� �����Ѵٰ� �Ѵ�.
	 	 �⵵�� �Է��ϸ� �ش� �⵵�� ��� ���� ��¥�� ������ִ� ���α׷��� ��������.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputYear;
		System.out.print("�⵵�� �Է��ϼ��� >> ");
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
		
		SimpleDateFormat eventDateFormat = new SimpleDateFormat("[y�� �̺�Ʈ] M�� d�� E����");
		Calendar event = getFirstEventDay(inputYear);
		
		int count = 0;
		
		while(event.get(Calendar.YEAR) == inputYear) {
			
			event.add(Calendar.DATE, 7);
			
			if(event.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 0) {
				System.out.println(eventDateFormat.format(event.getTime()));
				count++;
			}
		}
		System.out.println("������ �̺�Ʈ�� ��  " + count + "ȸ �Դϴ�.");
	}
	
}	

// ���� �Ѱ�
//	for(int i = 0; i < 12; i++) {
//		int maxDay = event.getActualMaximum(Calendar.DAY_OF_MONTH);
//		
//		for(int j = 1; j <= maxDay; ++j) {
//			int weekDay = event.get(Calendar.DAY_OF_WEEK); // ����
//			event.set(Calendar.YEAR, inputYear);
//			event.set(Calendar.MONTH, i);
//			event.set(Calendar.DATE, j);
//			
//			if(weekDay == 4 && (event.get(Calendar.WEEK_OF_MONTH) == 2 || event.get(Calendar.WEEK_OF_MONTH) == 4)) {
//				System.out.println(getCurrentDate(event));
//			}
//		}
//	}
