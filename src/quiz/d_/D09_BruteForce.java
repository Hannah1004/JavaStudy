package quiz.d_;

import java.util.Scanner;

public class D09_BruteForce {
	Scanner scan;
	static String charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*";

	
	public static void bruteforce(int password_size) {
		char[] arr = charset.toCharArray();
		int len = charset.length();
		long all_password = (int)Math.pow(charset.length(),password_size);
		
		for(int i=0; i< all_password; i++) {
			long value = i;
			
			String password="";
			while(value>0) {
				password += arr[(int)value%len];
				value/=len;
			}
			
			if(password.length() < password_size) {
				int gap = password_size - password.length();
				for(int j=0; j < gap;j++){
					password = "a" + password;
				}
			}
			
			System.out.println(password);
		}
		
		System.out.println("len : " + len);
	}
	
	public static void main(String[] args) {
		bruteforce(10);
	}
}


/*
비밀번호의 길이를 입력받으면 다음 문자로 만들 수 있는 모든 해당 길이의 비밀번호를 출력

- 영어 대소문자
- 숫자
- 특수문자(shift로 가능한 것들)
ex) 4글자 0000-zzzz
*/