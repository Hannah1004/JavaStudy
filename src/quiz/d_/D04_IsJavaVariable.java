package quiz.d_;

import java.util.Scanner;

public class D04_IsJavaVariable {
	static boolean check = true;
	
	static void checkVariable() {
		Scanner scan = new Scanner(System.in);
		System.out.println("»ç¿ëÇÒ º¯¼ö¸íÀ» ÀÔ·ÂÇØ ÁÖ¼¼¿ä");
		String var = scan.nextLine();
		
		if(var.charAt(0)>='0' && var.charAt(0)<='9');{
			check = false;
			System.out.println("Ã³À½¿¡ ¼ýÀÚ´Â ¿Ã ¼ö ¾ø½À´Ï´Ù.");
		}
		for(int i=0;i<var.length();i++) {
			char varCheck = var.charAt(i);
			if(varCheck==' ') {
				check = false;
				System.out.println("°ø¹éÀº »ç¿ëÇÒ ¼ö ¾ø½À´Ï´Ù.");
				break;
			}else if(varCheck>='°¡' && varCheck <='ÆR') {
				check = false;
				System.out.println("ÇÑ±ÛÀº »ç¿ëÇÒ ¼ö ¾ø½À´Ï´Ù.");
				break;
			}
			if((varCheck >= 'a' && varCheck <= 'z') || varCheck == '_' || varCheck == '$' || (varCheck >= '0' && varCheck <= '9')){
				
			}else {
				check = false;
				System.out.println("Çã¿ëµÈ Æ¯¼ö¹®ÀÚ°¡ ¾Æ´Õ´Ï´Ù");
			}
		}
	}
	public static void main(String[] args) {
		checkVariable();
	}
}












