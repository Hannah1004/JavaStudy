package quiz.E_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E02_LoadGame {

	/*
	 	아까 저장해둔 가위바위보 세이브 파일로부터 전적 정보를 읽어들인 후
	 	게임이 진행되도록 만들어 보세요 (다시 저장도 되어야함)
	 */
	
	static Random random = new Random();
	static Scanner sc = new Scanner(System.in);
	
	static int[] score = {0, 0, 0};
	//static String savePath = "files/game.sav";
	static String savePath = "rockScissorPaperGame.txt";
	
	public static void main(String[] args) {
		
		loadGame();
		
		rock_scissors_paper_game();
		
		saveGame();
	}
	
	public static void loadGame() {
		try {
			FileInputStream in = new FileInputStream(savePath);
			
			byte[] buffer = new byte[1024];
			
			int len = in.read(buffer);
			String[] score_list = new String(buffer, 0, len).split("/");
			
			score[0] = Integer.parseInt(score_list[0]);
			score[1] = Integer.parseInt(score_list[1]);
			score[2] = Integer.parseInt(score_list[2]);
			
			System.out.println("[무승무,플레이어승,컴퓨터승]");
			System.out.println(Arrays.toString(score));
			
			in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void saveGame() {
		try {
			FileOutputStream out = new FileOutputStream(savePath);
			
			String str = score[0] + "/" + score[1] + "/" + score[2];
			
			out.write(str.getBytes());
			out.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	// 어떤거 고를지 선택
	public static void rock_scissors_paper_game() {
		
		String[] types = {"scissor", "rock", "paper"};
		
		String com = types[random.nextInt(3)];
		String player;
		
		System.out.print("scissor rock paper 중에 선택하세요 >> ");
		player = sc.nextLine();
		
		System.out.println("player : " + player);
		System.out.println("computer : " + com);
		
		rock_scissors_paper_check(player, com);
	}

	// 가위바위보 승패 check 후 전적 파일에 적어서 저장
	public static void rock_scissors_paper_check(String player, String com) {
		
		try {
			FileOutputStream out = new FileOutputStream("rockScissorPaperGame.txt", true);
			
			if(player.equals(com)) {
				score[0]++;
				System.out.println("[비겼습니다.]");
			}else if((player.equals("scissor") && com.equals("paper")) 
				  || (player.equals("paper") && com.equals("rock"))
				  || (player.equals("rock") && com.equals("scissor"))) {
				score[1]++;
				System.out.println("[플레이어가 이겼습니다.]");
			}else{
				score[2]++;
				System.out.println("[컴퓨터가 이겼습니다.]");
			}
			
			out.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
