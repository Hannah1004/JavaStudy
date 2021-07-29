package gui.quiz.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HangMan {

	/*
	 	행맨을 만들어보세요
	 	
	 		1. 어떤 단어가 답인 경우 해당 단어의 길이만큼 _를 출력해준다.
	 			ex : apple이 답인 경우 _ _ _ _ _를 출력
	 			
	 		2. 사용자가 알파벳을 하나씩 입력하면 해당 알파벳이 포함되어 있다면 _를 알파벳으로 바꾼다.
	 			ex : 사용자가 p를 입력했다면 _ p p _ _를 출력
	 			
	 		3. 사용자가 모든 _를 제거하면 몇 번만에 맞췄는지 출력해주세요.
	 		
	 		4. 단어는 단어들이 적혀있는 파일에서 하나를 랜덤으로 뽑아주세요.
	 */
	
	ArrayList<String> words;
	String ranWord;
	ArrayList<Character> AnswerWord;
	
	// 파일 불러오기
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
	
	// 단어 랜덤으로 뽑아와서 _로 바꿔주기
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
	
	
	// 사용자가 입력한 단어가 같은지 확인하고 같으면 바꿔주기
	void userAnswer(char userAns) {
		boolean okay = false;
		for(int i = 0; i < ranWord.length(); ++i) {
			if(ranWord.charAt(i) == userAns) {
				AnswerWord.set(i, userAns);
				okay = true;
			}
		}
		
		if(!okay) {
			System.out.println(userAns + " 단어는 포함되지 않습니다.");
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
				System.out.print("알파벳 하나를 적어주세요 >>");
				userAns = sc.next().charAt(0);
				userAnswer(userAns);
				count++;
				System.out.println();
			}else {
				System.out.println(count + "번만에 성공!");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		HangMan game = new HangMan();
		System.out.println("***** 행맨 게임 시작 *****");
		game.start();
		
	}
}
