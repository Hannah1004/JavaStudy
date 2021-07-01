package quiz.b_;

import java.util.Scanner;

public class B05_Palindrome {

	public static void main(String[] args) {
		String user,userReverse="";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어를 입력하세요>> ");
		user = scan.nextLine();
		
		for(int i=user.length()-1;i>=0;i--) {
			userReverse += user.charAt(i);
		}
		
		if(user.equals(userReverse)) {
			System.out.println("PALINDROME");
		}else{
			System.out.println("NOT PALINDROME");
		}
		

	}

}
