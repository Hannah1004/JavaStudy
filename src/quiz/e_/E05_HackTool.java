package quiz.e_;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class E05_HackTool {

	/*
	  	�츮�� ����� ��ȣ ����� Ű ���� 25�� �ۿ� ���� ������ ��ȣȭ ����Դϴ�.
	  	
	  	��ǥ ������ �� �պκ� 10���� 1 ~ 25�� Ű�� ��� ��ȣȭ �غ�����
	 
	 */
	
	public static void main(String[] args) {
		
		bruteforce("files/frankenstein_encrypted.txt");
		
	}
	
	// ��ȣȭ (������� Ǯ���ذ�)
	public static void bruteforce(String path) {
		ArrayList<String> lines = new ArrayList<>();
		
		File file = new File(path);
		try(
				FileReader fin = new FileReader(file);
				BufferedReader in = new BufferedReader(fin);
		){
			
			String line;
			
			// 10���� �аų� �Ǵ� ������ ���������� �ݺ�
			for(int i = 0; i < 10 && (line = in.readLine()) != null; ++i) {
				
				// ���� ����ְų� ���ڰ� 5���� �ȵǴ� ���� �Ⱥ��ɷ� ġ�ڴ�. 
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
					String text = String.valueOf(ch);
					System.out.print(text);
					String[] word = text.split(" ");
					//System.out.println(Arrays.toString(word));
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.println("Press 'Enter' to continue...");
			String cmd = sc.nextLine();
			
			// d �Ǵ� D�� �Է������� 
			if(cmd.toLowerCase().equals("d")) {
				System.out.println("��ü ���� ��ȣȭ�� �����մϴ�..");
				break;
			}
		}
		System.out.println("���α׷� ��!");
	}
	
}
