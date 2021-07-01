package myobj.c07;

public class MachinLearning extends School{
	
	int math[];
	int programming[];
	int statistics[];
	
	MachinLearning(int studentCount){
		classNum = 1000;
		this.studentCount = studentCount;
		studentNum = new int[studentCount];
		totalScore = new int[studentCount];
		avaScore = new Double[studentCount];
		name = new String[studentCount];
		korean = new int[studentCount];
		english = new int[studentCount];
		math = new int[studentCount];
		programming = new int[studentCount];
		statistics = new int[studentCount];
	
	}
	
	@Override
	void randomMakeScore() {		
		for(int i=0; i<studentCount; i++) {
			studentNum[i] = ++classNum;
			name[i] = randomMakeName();
			korean[i] = (int)(Math.random() * 101 +1);
			english[i] = (int)(Math.random() * 101 +1);
			math[i] = (int)(Math.random() * 101 +1);
			programming[i] = (int)(Math.random() * 101 +1);
			statistics[i] = (int)(Math.random() * 101 +1);
		}
	}

	@Override
	void printGrade() {
		System.out.println("####MachineLearning반 학생들의 성적####");
		for(int i=0; i<studentCount; i++) {
			totalScore[i] = (korean[i]+english[i]+math[i]+programming[i]+statistics[i]);
			avaScore[i] = totalScore[i]/6.0;
			System.out.printf("%s학생의 총합은 %d이고 평균은 %.2f입니다. \n",name[i],totalScore[i],avaScore[i]);
		}
		System.out.println();
	}

}












