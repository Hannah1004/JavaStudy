package study.a_;

import quiz.*;
import quiz.a_.A00_PrintRabbit;
import quiz.a_.A01_FeeInformation;

public class A07_Import {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//같은패키지의 클래스는 그냥 사용 가능
		A00_Hello.main(null);
		A01_Escape.main(null);
		A02_Variable.main(null);
		
		//quiz패키지의 클래스는 import가 필요
		A00_PrintRabbit.main(null);
		A01_FeeInformation.main(null);
	}

}
