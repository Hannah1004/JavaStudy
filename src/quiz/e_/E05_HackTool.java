package quiz.e_;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class E05_HackTool {

	/*
	  	�츮�� ����� ��ȣ ����� Ű ���� 25�� �ۿ� ���� ������ ��ȣȭ ����Դϴ�.
	  	
	  	��ǥ ������ �� �պκ� 10���� 1 ~ 25�� Ű�� ��� ��ȣȭ �غ�����
	 
	 */
	
	public static void main(String[] args) {
		
		bruteforce("files/frankenstein_encrypted.txt");
		
	}
	
	// ��ȣȭ
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
		String[] words = null;  // split�ؼ� ���� ��
		String text = "";
		int count = 0;
		HashMap<Integer, Integer> counts = new HashMap<>(); // key : key, value : count
		for(int key = 1; key < 26; ++key) {
			
		System.out.printf("---- Key : %d -------------------------\n", key);
		for(String line : lines) {
			
			for(char ch : line.toCharArray()) {
				if(Character.isUpperCase(ch)) {
					ch = (char) (ch - key < 'A' ? ch - key + 26 : ch - key);
				}else if(Character.isLowerCase(ch)) {
					ch = (char) (ch - key < 'a' ? ch - key + 26 : ch - key);
				}
				text += ch;
			}
			
			words = text.split(" ");
			
			System.out.println(Arrays.toString(words));
			
			for(int i = 0; i < words.length; ++i) {
				for(int j = 0; j < dictionaryCheck().size(); ++j) {
					if(words[i].equals(dictionaryCheck().get(j))) {
						count++;
					}
				}
			}
			text = "";
			}
			counts.put(key, count);
			System.out.println();
			count = 0;
			System.out.println(counts);
		}
		int maxCount = Collections.max(counts.values());
		Set<Entry<Integer, Integer>> entrySet = counts.entrySet();

		for(Entry<Integer, Integer> entry : entrySet) {
			if(entry.getValue() == maxCount) {
				System.out.println("key���� " + entry.getKey());
			}
		}
		
			System.out.println();
//			System.out.println("Press 'Enter' to continue...");
//			String cmd = sc.nextLine();
//			
//			// d �Ǵ� D�� �Է������� 
//			if(cmd.toLowerCase().equals("d")) {
//				System.out.println("��ü ���� ��ȣȭ�� �����մϴ�..");
//				break;
//			}
		}
//		System.out.println("���α׷� ��!");
//	}
	
	
	public static ArrayList<String> dictionaryCheck() {
		ArrayList<String> word = new ArrayList<>();
		
		File f = new File("dictionary/dictionary2.txt");
		
		try(
				FileReader fin = new FileReader(f);
				BufferedReader in = new BufferedReader(fin);
		){
			String line;
			
			while((line = in.readLine()) != null) {
				word.add(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return word;
	}
}
