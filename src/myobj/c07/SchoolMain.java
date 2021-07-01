package myobj.c07;

public class SchoolMain {

	public static void main(String[] args) {
		useSchool(new Program(30));
		useSchool(new Network(30));
		useSchool(new MachinLearning(30));

	}
	
	public static void useSchool(School sc) {
		sc.randomMakeScore();
		sc.printGrade();
	}
}
