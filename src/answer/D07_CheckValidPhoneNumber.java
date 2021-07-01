package answer;

public class D07_CheckValidPhoneNumber{

public static boolean checkNumeric(char[] phoneNumber) {
      for(int i = 0; i < phoneNumber.length; ++i) {
         if((i == 3 || i == 8) && phoneNumber[i] == '-') {
            continue;
         }else if((i!=3 && i!=8) &&Character.isDigit(phoneNumber[i])) {
            continue;
         }else {
            return false;
         }
      }
      return true;
   }
   
   public static void checkValidPhoneNumber(char[] phoneNumber) {
      boolean valid = true;
      
      String front = "" + phoneNumber[0] + phoneNumber[1] + phoneNumber[2];
      
      if(!front.equals("010")) {
         valid = false;
         System.out.println("[WARNING] 맨 앞의 숫자가 허용되지 않은 숫자입니다.");
      }else if(phoneNumber.length != 13) {
         valid = false;
         System.out.println("[WARNING] 핸드폰 번호의 길이가 아닙니다.");
      }else if(!checkNumeric(phoneNumber)) {
         valid = false;
         System.out.println("[WARNING] 숫자 아닌 문자가 포함되었거나 -의 위치가 이상함");
      }
      
      
      System.out.println(new String(phoneNumber) + "는 " + (valid ? "올바른 핸드폰 번호입니다." : "올바르지 않은 핸드폼 번호입니다."));
   }
}
      