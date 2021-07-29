package gui.quiz.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HangMan {

	/*
	 	����� ��������
	 	
	 		1. � �ܾ ���� ��� �ش� �ܾ��� ���̸�ŭ _�� ������ش�.
	 			ex : apple�� ���� ��� _ _ _ _ _�� ���
	 			
	 		2. ����ڰ� ���ĺ��� �ϳ��� �Է��ϸ� �ش� ���ĺ��� ���ԵǾ� �ִٸ� _�� ���ĺ����� �ٲ۴�.
	 			ex : ����ڰ� p�� �Է��ߴٸ� _ p p _ _�� ���
	 			
	 		3. ����ڰ� ��� _�� �����ϸ� �� ������ ������� ������ּ���.
	 		
	 		4. �ܾ�� �ܾ���� �����ִ� ���Ͽ��� �ϳ��� �������� �̾��ּ���.
	 */
	
	ArrayList<String> words;
	String ranWord;
	ArrayList<Character> AnswerWord;
	
	// ���� �ҷ�����
	void loadFile(String path) {
		words = new ArrayList<>();
		
		File file = new File(path);
		
		try(
				FileReader fin = new FileReader(file);
				BufferedReader in = new BufferedReader(fin);
		){
			String line = in.readLine();
			
			while((line = in.readLine()) != null) {
				words.add(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// �ܾ� �������� �̾ƿͼ� _�� �ٲ��ֱ�
	void wordPrint() {
		AnswerWord = new ArrayList<>();
		int ranNum = (int)(Math.random() * words.size());
		ranWord = words.get(ranNum);
		
		for(int i = 0; i < ranWord.length(); ++i) {
			//System.out.print("_ ");
			AnswerWord.add('_');
		}
		//System.out.println();
	}
	
	
	// ����ڰ� �Է��� �ܾ ������ Ȯ���ϰ� ������ �ٲ��ֱ�
	void userAnswer(char userAns) {
		boolean okay = false;
		for(int i = 0; i < ranWord.length(); ++i) {
			if(ranWord.charAt(i) == userAns) {
				AnswerWord.set(i, userAns);
				okay = true;
			}
		}
		
		if(!okay) {
			System.out.println(userAns + " �ܾ�� ���Ե��� �ʽ��ϴ�.");
		}
		
		for(char word : AnswerWord) {
			System.out.print(word + " ");
		}
	}
	
	void start() {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		char userAns;
		
		loadFile("dictionary/EngWord.txt");
		wordPrint();
		
		while(true) {
			if(AnswerWord.contains('_')) {
				System.out.print("���ĺ� �ϳ��� �����ּ��� >>");
				userAns = sc.next().charAt(0);
				userAnswer(userAns);
				count++;
				System.out.println();
			}else {
				System.out.println(count + "������ ����!");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		HangMan game = new HangMan();
		System.out.println("***** ��� ���� ���� *****");
		game.start();
		
	}
}
