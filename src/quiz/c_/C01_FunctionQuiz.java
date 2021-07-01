package quiz.c_;

public class C01_FunctionQuiz {
	
	public static void main(String[] args) {
		System.out.println(alphaCheck('T'));
		
		System.out.println(multiple(14));
		
		numCheck(13);
		
		System.out.print("입력한 숫자의 약수:");
		for(int i=0; i<divisor(18).length;i++) {
			System.out.printf("%d  ",divisor(18)[i]);
		}		
		System.out.println();
		
		System.out.println(prime(19));
		
		System.out.println(factorial(5));
	}

	//1번
	public static boolean alphaCheck(char alpha) {
		boolean check = false;
		if((alpha >='a' && alpha <='z') || (alpha >='A' && alpha <='Z')) {
			check = true;
		}
		return check;
	} 
	
	//2번	
	 public static boolean multiple(int num) {
		boolean check = false;
		if(num % 3 == 0) {
			check = true;
		}		
		return check;	
	 }
	 
	 //3번	 
	 public static void numCheck(int num) {
		if(num % 2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}		
	 }
	 
	 //4번
	 public static int[] divisor(int num) {
		 int count=0;
		 int divCount=0;
		 
		 for(int i=1; i<=num; i++) {
			 if(num%i==0) {
				 count++;
			 }
		 }
		 
		 int div[] = new int[count];
		 
		 for(int i=1; i<=num; i++) {
			 if(num%i==0) {
				 div[divCount]=i;
				 divCount++;
			 }
		 }
		 
		 return div;	
	 }
	 
	 //5번	 
	 public static boolean prime(int num) {
		boolean check = true;
		
		for(int i=2; i<num; i++) {
			 if(num % i == 0) {
				 check = false;
				 break;
			 }
		 }		
		return check;	
	 }
	 
	 //6번	 
	 public static int factorial(int num) {
		 int fac=1;
		 for(int i=num; i>=1; i--) {
			 fac=fac*i;
		 }
		 return fac;	
	 }
	 	
}









