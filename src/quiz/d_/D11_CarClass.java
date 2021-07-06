package quiz.d_;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class D11_CarClass {

	int ranCarNum = (int)(Math.random() * 9000 + 1000); //랜덤 차량번호 4자리 (1000~9999)
	int lastCarNum = ranCarNum % 10; //4번째자리 숫자
	String[] carTypes = {"장애인", "유아동승", "경차" , "대형", "소형", "중형", "준중형"}; //차 타입
	int ranType = (int)(Math.random() * 7); //차 랜덤으로뽑아줄 숫자
	String carType = carTypes[ranType];  // 랜덤 차 타입
	
	Random random;
	
	void finalCheck() {
		
		LocalDate nowDay = LocalDate.now();  //현재 시간
		LocalDate startDay = LocalDate.of(2018, 8, 31);  //차량 출입제한 시행 기간 시작 날짜
		
		DateTimeFormatter nowDayFormat = DateTimeFormatter.ofPattern("y년 M월 d일 E요일");
		
		int nowWeek = nowDay.getDayOfWeek().getValue(); // 현재 요일
		
		System.out.println("오늘 날짜 : " + nowDayFormat.format(nowDay));
		System.out.println("차 타입 : " + carType + ", 차 번호 : " + ranCarNum);
		
		String holiday = "" + nowDay;
		if(nowDay.isAfter(startDay)) {
			if(holidayCheck(holiday)) {
				System.out.println("오늘은 공휴일입니다.");
				System.out.println("모든 차량 출입 가능!");
			}else if(carType.equals("장애인") || carType.equals("유아동승") ||carType.equals("경차")) {
				System.out.println("출입제한에서 제외된 차량입니다.");
				System.out.println("언제든지 출입 가능합니다!");
			}else {
				numCheck(nowWeek, lastCarNum);
			}
		}else{
			System.out.println("차량출입제한 시행 기간이 아닙니다.");
		}
	}
	
	public static void numCheck(int dayWeek, int lastCarNum) {
		if((dayWeek == 1 && (lastCarNum == 1 || lastCarNum == 6))  //월요일
		|| (dayWeek == 2 && (lastCarNum == 2 || lastCarNum == 7))  //화요일
		|| (dayWeek == 3 && (lastCarNum == 3 || lastCarNum == 8))  //수요일
		|| (dayWeek == 4 && (lastCarNum == 4 || lastCarNum == 9))  //목요일
		|| (dayWeek == 5 && (lastCarNum == 5 || lastCarNum == 0))  //금요일
		) {
			System.out.println("출입제한되는 차량입니다.");
		}else {
			System.out.println("출입가능한 차량입니다.");
		}
	}
	
	// 공휴일 체크
	public static boolean holidayCheck(String holiday) {
		boolean holiCheck = false;
		String[] holidays = {"01-01", "03-01", "05-05" ,"06-06", "08-15", "10-03", "10-09", "12-25"};
		for(int i = 0; i < holidays.length; ++i) {
			if(holiday.contains(holidays[i])) {
				holiCheck = true;
			}
		}
		return holiCheck;
	}
	
}
