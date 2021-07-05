package quiz.d_;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class D11_CarClass {

	int ranCarNum = (int)(Math.random() * 9000 + 1000); //���� ������ȣ 4�ڸ� (1000~9999)
	int lastCarNum = ranCarNum % 10; //4��°�ڸ� ����
	String[] carTypes = {"�����", "���Ƶ���", "����" , "����", "����", "����", "������"}; //�� Ÿ��
	int ranType = (int)(Math.random() * 7); //�� �������λ̾��� ����
	String carType = carTypes[ranType];  // ���� �� Ÿ��
	
	Random random;
	
	void finalCheck() {
		
		LocalDate nowDay = LocalDate.now();
		DateTimeFormatter nowDayFormat = DateTimeFormatter.ofPattern("y�� M�� d�� E����");
		
		int nowWeek = nowDay.getDayOfWeek().getValue(); // ���� ����
		
		System.out.println(nowDay.getDayOfMonth());
		System.out.println("���� ��¥ : " + nowDayFormat.format(nowDay));
		System.out.println("�� Ÿ�� : " + carType + ", �� ��ȣ : " + ranCarNum);
		
		if(carType.equals("�����") || carType.equals("���Ƶ���") ||carType.equals("����")) {
			System.out.println("�������ѿ��� ���ܵ� �����Դϴ�.");
			System.out.println("�������� ���� �����մϴ�.");
		}else {
			numCheck(nowWeek, lastCarNum);
		}
		
	}
	
	public static void numCheck(int dayWeek, int lastCarNum) {
		if((dayWeek == 1 && (lastCarNum == 1 || lastCarNum == 6)) || (dayWeek == 2 && (lastCarNum == 2 || lastCarNum == 7))
				 || (dayWeek == 3 && (lastCarNum == 3 || lastCarNum == 8)) || (dayWeek == 4 && (lastCarNum == 4 || lastCarNum == 9))
				 || (dayWeek == 5 && (lastCarNum == 5 || lastCarNum == 0))) {
			System.out.println("�������ѵǴ� �����Դϴ�.");
		}else {
			System.out.println("���԰����� �����Դϴ�.");
		}
	}
	
}
