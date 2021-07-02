package study.c_;

public class C06_Polymorphism {

	/*
	 	# ��ü�� ������
	 	 - ��ü�� �پ��� ���¸� ���� �� �ִ�
	 	 - ����� ����̱⵵ �ϰ� �����̱⵵ �ϴ�
	 	 - ������ ���������� ����� �ƴ� ���� �ִ�
	 */
	
	public static void main(String[]args) {
		Fruit fruit01 = null;
		Pineapple pine01 = null;

		Fruit fruit = new Fruit();
		Pineapple pineapple = new Pineapple();

		fruit01 = fruit;
		fruit01 = pineapple; // �ڽ� Ÿ���� �θ� Ÿ���� �� �� �ִ� (�� ĳ����)
		// ���ξ����� ���� ���� ��ӹ޾Ƽ� �̹� �˰��ֱ⿡ �����ϴ�,
		// ������ ������ ���ξ����� �Ƿ��� ���ξ����� ����� ��� �˰����� ���ϱ⿡ ��ƴ�

		pine01 = pineapple;
		// pine01 = fruit; // �θ� Ÿ���� ���� ����� ���Ƽ� �ڽ� Ÿ���� �� �� ���� (�ٿ� ĳ����)

		// # �ٿ� ĳ������ ������ ���
		// - ���� �ڽ� Ÿ���̾��� �ν��Ͻ��� ��ĳ���õǾ� �ִ� ���, �ٽ� �ٿ�ĳ���� �� �� �ִ�
		System.out.println(fruit01);
		System.out.println((Pineapple)fruit01);
		pine01 = (Pineapple)fruit01; // �ٿ� ĳ����

		// # ��ĳ���� �� �ν��Ͻ� ����غ���
		Fruit f = new Pineapple();
		Fruit f2 = new DragonFruit();


		// ��ĳ���� �� ���¿����� �θ� Ÿ�Կ��� �����ϴ� �޼��带 ����ϸ�
		// �ش� �޼��尡 �������̵� �� ��� �������̵� �Ǿ��ִ� ����� ����Ѵ�
		f.eat(); // ��ĳ�������ص� �ڽ�Ÿ���� �������̵��� ���¶�� �������̵� �Ȱ� �����´�

		// ��ĳ���� �� ���¿����� ���� Ŭ������ �����ִ� ����� ��� �ؾ������.
		// (Pineapple���� �����ϴ� ����� ����� �� ����)
		//f.smash(); // ���ξֵ��� �������� �ȴٸ� ���ξ��ÿ� �ִ� ����� ��� �ذ� �����ֿ��ִ��͸� ����Ѵ�

		// ���� ����� ����ϱ� ���ؼ��� �ٿ�ĳ������ �ʿ��ϴ�
		// �� �����Ϸ��� �ٿ�ĳ���ý� �߻��ϴ� �������� ã������ ���Ѵ� (�����ؾ� �ϴ� �κ�)
		((Pineapple)f).smash();
		//((Pineapple)f2).smash();
		
		// instanceof �����ڸ� ���� �ش� �ν��Ͻ��� Ư�� Ŭ������ �ν��Ͻ� ������ �˻��� �� �ִ�
		System.out.println("f�� Fruit�� �� �� �ִ� �ν��Ͻ��ΰ���? " 
				+ (f instanceof Fruit));
		System.out.println("f�� Fruit�� �� �� �ִ� �ν��Ͻ��ΰ���? " 
				+ (f instanceof Pineapple));
		System.out.println("f�� Fruit�� �� �� �ִ� �ν��Ͻ��ΰ���? " 
				+ (f instanceof DragonFruit));
		
		System.out.println("f2�� Fruit�� �� �� �ִ� �ν��Ͻ��ΰ���? " 
				+ (f instanceof Fruit));
		System.out.println("f2�� Fruit�� �� �� �ִ� �ν��Ͻ��ΰ���? " 
				+ (f instanceof Pineapple));
		System.out.println("f2�� Fruit�� �� �� �ִ� �ν��Ͻ��ΰ���? " 
				+ (f instanceof DragonFruit));
	}
}

class Fruit{
	void eat() {
		System.out.println("������ �Ծ����ϴ�.");
	}
}
// Apple�� �ȵǴ� ����. ���� ��Ű�� ���ο��� ���� �̸��� Ŭ������ ������ �� ����.
class Pineapple extends Fruit{
	void eat() {
		System.out.println("[�������̵�] ���ξ����� �Ծ����ϴ�.");
	}

	void smash() {
		System.out.println("���ξ����� ���� �����ƽ��ϴ�.");
	}
}

class DragonFruit extends Fruit{

}
