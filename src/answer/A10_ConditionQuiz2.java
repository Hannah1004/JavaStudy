package answer;

import java.util.Scanner;

public class A10_ConditionQuiz2 {

	public static void main(String[] args) {
		/*
		char a = 'q', b = 't', c = 56, d = 108,
				e = '¤µ', f='«î';
		Scanner scan = new Scanner(System.in);
		System.out.println("1:"+(a=='q'||a=='Q'));
		System.out.println("2:"+(b!=' '||b!='\t'));
		System.out.println("3:"+(c >= 48 && c <= 57));
		System.out.println("4:"+((d <= 65 && d >= 90)||(d >= 97 && d <= 122)));
		System.out.println("5:"+(f >= 12448 && f <= 12543));
		System.out.println("6:"+(f >= 12448 && f <= 12543));
		
		System.out.print("¹®ÀÚ¿­À» ÀÔ·ÂÇÏ¼¼¿ä>> ");
		String str = scan.nextLine();
		System.out.println("7:"+(str.equals("exit")));
		*/
		char a = 'Q';
		char b = '\t';
		char c = '7';
		char d = 'z';
		char e = 'ÇÏ';
		char f = '«î';
		
		System.out.println(a == 'q' || a == 'Q');
		System.out.println(b != ' ' && b!= '\t');
		System.out.println(c >= '0' && c <= '9');
		System.out.println((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z'));
		System.out.println(e >= '°¡' && e <= 'ÆR');
		System.out.println((f >= 0x3041 && f <= 0x3096)||
							(f >= 0x30A1 && f <= 0x30FF));
	}

}













