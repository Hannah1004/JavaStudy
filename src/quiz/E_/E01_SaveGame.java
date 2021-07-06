package quiz.E_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class E01_SaveGame {
	
	/*
	 	간단한 컴퓨터와의 가위바위보 게임을 하나 만들고, 전적을 파일에 저장해보세요
	 */
	
	static Random random = new Random();
	static Scanner sc = new Scanner(System.in);
	
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
			out.write("\n===============================\n".getBytes());
			out.write(("player : " + player + " computer : " + com).getBytes());
			
			int playerWin = 0, comWin = 0;
			
			if(player.equals(com)) {
				out.write("\ndraw".getBytes());
				playerWin++;
				comWin++;
				System.out.println("[비겼습니다.]");
			}else if((player.equals("scissor") && com.equals("paper")) 
				  || (player.equals("paper") && com.equals("rock"))
				  || (player.equals("rock") && com.equals("scissor"))) {
				out.write("\nplayer win".getBytes());
				playerWin++;
				System.out.println("[플레이어가 이겼습니다.]");
			}else{
				out.write("\ncomputer win".getBytes());
				comWin++;
				System.out.println("[컴퓨터가 이겼습니다.]");
			}
			out.write("\nplayer : computer".getBytes()) ;
			out.write(("\n" + playerWin + "      :    " + comWin).getBytes());
			System.out.println(playerWin + "      :    " + comWin);
			out.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// 가위바위보 게임 main
	public static void main(String[] args) {
		System.out.println("가위바위보 게임 시작!!");
		rock_scissors_paper_game();
	}
}

