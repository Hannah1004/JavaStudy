package quiz.E_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class E01_SaveGame {
	
	/*
	 	������ ��ǻ�Ϳ��� ���������� ������ �ϳ� �����, ������ ���Ͽ� �����غ�����
	 */
	
	static Random random = new Random();
	static Scanner sc = new Scanner(System.in);
	
	// ��� ���� ����
	public static void rock_scissors_paper_game() {
		
		String[] types = {"scissor", "rock", "paper"};
		
		String com = types[random.nextInt(3)];
		String player;
		
		System.out.print("scissor rock paper �߿� �����ϼ��� >> ");
		player = sc.nextLine();
		
		System.out.println("player : " + player);
		System.out.println("computer : " + com);
		
		rock_scissors_paper_check(player, com);
	}

	// ���������� ���� check �� ���� ���Ͽ� ��� ����
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
				System.out.println("[�����ϴ�.]");
			}else if((player.equals("scissor") && com.equals("paper")) 
				  || (player.equals("paper") && com.equals("rock"))
				  || (player.equals("rock") && com.equals("scissor"))) {
				out.write("\nplayer win".getBytes());
				playerWin++;
				System.out.println("[�÷��̾ �̰���ϴ�.]");
			}else{
				out.write("\ncomputer win".getBytes());
				comWin++;
				System.out.println("[��ǻ�Ͱ� �̰���ϴ�.]");
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
	
	// ���������� ���� main
	public static void main(String[] args) {
		System.out.println("���������� ���� ����!!");
		rock_scissors_paper_game();
	}
}

