package quiz.d_;

public class D02_JiphapQuizMain {
	public static void main(String[] args) {
		D02_JiphapQuiz quiz = new D02_JiphapQuiz();
		quiz.printHash(quiz.union(quiz.jip1, quiz.jip2));
		quiz.reset();

		quiz.printHash(quiz.minus(quiz.jip1, quiz.jip2));
		quiz.reset();

		quiz.printHash(quiz.minus(quiz.jip2, quiz.jip1));
		quiz.reset();

		quiz.printHash(quiz.intersection(quiz.jip1, quiz.jip2));
		quiz.reset();

	}
}
