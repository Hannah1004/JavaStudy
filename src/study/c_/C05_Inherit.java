package study.c_;

public class C05_Inherit {

	/*
	 	# Ŭ���� ���
	 	 - ������ �̸� ����� �״� Ŭ������ �׷��� �����޾Ƽ� ����ϴ� ��
	 	 - �������� �Ŀ��� �ش� Ŭ������ ������� ���ļ� ����� �� �ִ� (�������̵� : �θ�Ŭ������ �ִ��� ����� ���)
	 	 - ������ �����ϸ鼭 ���Ӱ� �����غ� �� �ִ� ���� �����̴�
	 	 - ��ӹ޴� Ŭ������ �ڽ� Ŭ���� �Ǵ� ���� Ŭ������� �θ���
	 	 - ������ִ� Ŭ������ �θ� Ŭ���� �Ǵ� ���� Ŭ������� �θ���
	 	 
	 	# ����� ��Ģ
	 	
	 	 - extends��� Ű���带 ����Ѵ�
	 	 - �����ڿ��� �ݵ�� ���� ���� �θ� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�
	 	 - �θ� Ŭ������ �ڽ� Ŭ������ �Ȱ��� �̸��� ���� �ڿ��� �ִ� ��쿡��
	 	   super�� this�� ��Ȯ�ϰ� ������ �� �ִ�
	 	 - super()�� �θ��� �����ڸ� ���Ѵ� �� this()�� �ڽ��� �����ڸ� ���Ѵ�
	 */

	public static void main(String[] args) {
		Personn gildong = new Personn("��浿", 42);
		gildong.sayHi();

		Programmer chulsoo = new Programmer("��ö��",28);

		// Programmer�� sayHi()�� �������� ������ �θ��� �޼��带 �����޾� ����ϰ� �ִ�
		chulsoo.sayHi();
		
		// �������� �� �ڽ� Ŭ�������� ���� �߰��� �޼���
		// �θ� Ŭ������ ������ �Ѽ����� �ʰ� �߰����� ������ ������ �� �ִ�
		chulsoo.program("����");
		
		OranngeTree t1 = new OranngeTree();
		

	}
}

class Personn {
	String name;
	int age;

	Personn(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void sayHi() {
		System.out.println("�ȳ�? �� �̸��� "+ name +"�̾�. ���̴� "+ age +"�� �̾�.");
	}
}

// Personn Ŭ������ ��ӹ��� Programmer Ŭ����
class Programmer extends Personn {

	Programmer(String name, int age){
		// �ݵ�� �θ��� �����ڸ� �޾ƾ��Ѵ�.
		super(name, age);
	}

	void program(String to_program) {
		System.out.println("���α׷��� " + name + "���� �̹����� "
				+ to_program +" �� ����� �����߽��ϴ�.");
	}
	
	// Override(�����) : �ڽ� Ŭ������ �θ�Ŭ������ �޼��带 ������� �����ؼ� ����� �� �ִ�
	void sayHi() {
		System.out.println(name + "���� �λ縦 �߽��ϴ�. print(\"Hello, world!\")");
	}
}

class Tree{
	public Tree(int abc) {
		
	}
}

class OranngeTree extends Tree{
	OranngeTree(){
		// �θ�Ŭ������ �⺻ �����ڰ� �ִ� ��쿡�� super()�� ������ �� �ִ�.
		super(123); 
	}
}
