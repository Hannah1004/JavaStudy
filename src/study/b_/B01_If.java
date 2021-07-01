package study.b_;

public class B01_If {

	public static void main(String[] args) {
		/*
			if¹®
				- ()¾ÈÀÇ °ªÀÌ trueÀÏ ¶§ {}¾ÈÀÇ ³»¿ëÀ» ½ÇÇà
				- ()¾ÈÀÇ °ªÀÌ falseÀÏ ¶§ {}¾ÈÀÇ ³»¿ëÀ» ¹«½Ã
				- {}¾È¿¡¼­ ½ÇÇàÇÒ ³»¿ëÀÌ ´Ü ÇÑ ÁÙÀÌ¶ó¸é {]À» »ý·«ÇÒ ¼ö ÀÖÀ½
		 	
		 	else if¹®
		 		- À§¿¡ ÀÖ´Â if¹®ÀÌ ½ÇÇàµÇÁö ¾Ê¾Ò´Ù¸é ¹Ø¿¡¼­ if¹®Ã³·³ µ¿ÀÛ
		 		- else if´Â ´Üµ¶À¸·Î »ç¿ë ºÒ°¡
		 		- else if´Â ¿©·¯¹ø »ç¿ë °¡´É
		 	
		 	else¹®
		 		- À§¿¡ ÀÕ´Â ¸ðµç if¹®°ú else if¹®ÀÌ ¸ðµÎ ½ÇÇà µÇÁö ¾Ê¾Ò´Ù¸é {}¾ÈÀÇ ³»¿ëÀ» ¹«Á¶°Ç ½ÇÇà
		 		- if¹® ¹Ù·Î ´ÙÀ½¿¡ »ç¿ëÇÒ ¼öµµ ÀÖ´Ù
		 	
		 */
		
		char ch='*';
		
		if(ch >='°¡' && ch <= 'ÆR') {
			System.out.println("ch¿¡ µé¾îÀÖ´Â °ªÀº ÇÑ±ÛÀÔ´Ï´Ù");
		} else if(ch >= 'a' && ch <='z') {
			System.out.println("ch¿¡ µé¾î ÀÖ´Â °ªÀº ¼Ò¹®ÀÚ ÀÔ´Ï´Ù");
		} else if(ch >= 'A' && ch <='Z') {
			System.out.println("ch¿¡ µé¾î ÀÖ´Â °ªÀº ´ë¹®ÀÚ ÀÔ´Ï´Ù");
		} else {
			System.out.println("ch¿¡ µé¾îÀÖ´Â ¹®ÀÚ´Â ¾ËÆÄºªµµ ¾Æ´Ï°í ÇÑ±Ûµµ ¾Æ´Õ´Ï´Ù!");
		}
		
		System.out.println("ÇÁ·Î±×·¥ ³¡");
	}
}
