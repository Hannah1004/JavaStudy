package quiz.e_;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class E05_HackTool {

	/*
	  	우리가 사용한 암호 방식은 키 값이 25개 밖에 없는 허접한 암호화 방식입니다.
	  	
	  	목표 파일의 맨 앞부분 10줄을 1 ~ 25의 키로 모두 복호화 해보세요
	 
	 */
	
	public static void main(String[] args) {
		
//		for(int i = 1; i <= 25; ++i) {
//			System.out.println("=================================key : " + i + " 복호화 ==================================");
//			decrypt("files/frankenstein_encrypted.txt", i); // 키 값 : 9
//		}
		
		bruteforce("files/frankenstein_encrypted.txt");
		
	}
	
	// 복호화 (내가 한거) key값이 맞지 않음
	public static void decrypt(String path, int key) {
		
		File file = new File(path);
		try(
				FileReader fin = new FileReader(file);
				BufferedReader in = new BufferedReader(fin);
		){
			
			String line;
			int count = 0;
			while((line = in.readLine()) != null) {
				
				for(char ch : line.toCharArray()) {
					if(Character.isUpperCase(ch)) {
						ch = (char)((ch - key) % 26 + 'A');
					}else if(Character.isLowerCase(ch)){
						ch = (char)((ch - key) % 26 + 'a');
					}
					System.out.print(ch);
				}
				System.out.println();

				if(count == 10) {
					break;
				}
				
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 복호화 (강사님이 풀어준거)
	public static void bruteforce(String path) {
		ArrayList<String> lines = new ArrayList<>();
		
		File file = new File(path);
		try(
				FileReader fin = new FileReader(file);
				BufferedReader in = new BufferedReader(fin);
		){
			
			String line;
			
			// 10줄을 읽거나 또는 파일이 끝날때까지 반복
			for(int i = 0; i < 10 && (line = in.readLine()) != null; ++i) {
				
				// 줄이 비어있거나 문자가 5개도 안되는 줄은 안본걸로 치겠다. 
				if(line.trim().equals("") || line.length() < 5) {
					--i;
				}else {
					lines.add(line);
				}
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		
		for(int key = 1; key < 26; ++key) {
			System.out.printf("---- Key : %d -------------------------\n", key);
			for(String line : lines) {
				
				for(char ch : line.toCharArray()) {
					if(Character.isUpperCase(ch)) {
						ch = (char) (ch - key < 'A' ? ch - key + 26 : ch - key);
					}else if(Character.isLowerCase(ch)) {
						ch = (char) (ch - key < 'a' ? ch - key + 26 : ch - key);
					}
					System.out.print(ch);
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.println("Press 'Enter' to continue...");
			String cmd = sc.nextLine();
			
			// d 또는 D를 입력했을때 
			if(cmd.toLowerCase().equals("d")) {
				System.out.println("전체 파일 복호화를 진행합니다..");
				break;
			}
		}
		System.out.println("프로그램 끝!");
	}
	
}
