package study.c_;

public class C04_Static {
	/*
	 	# static�̶� (���� ����, Ŭ���� ���� <=> �ν��Ͻ� ����)
	 	
	 		- static�� Ŭ���� �ȿ��� ������ִ�?
	 		  static void ??() ��� �ν��Ͻ��ȿ����� ����ƽ�� �����Ұ��ϴ�.
	 		- static ������ ���� Ŭ������ ��� �ν��Ͻ��� �������� ����ϴ� �����̴�
	 		- �տ� static�� ���� �ڿ��� ���� Ŭ������ ������� ��� �ν��Ͻ���
	 		  �������� ����ϴ� �ڿ��� �ȴ�.
	 		- static ������ �ƹ��� �ν��Ͻ��� ���Ƶ� Ŭ������ �ϳ��ۿ� �������� �ʱ� ������
	 		  �޸𸮰� ����ȴ�.
	 		- static ������ Ŭ������ �ϳ��̱� ������ Ŭ���� �̸��� .����� �����ϴ� ���� �����ϴ� (����)
	 		- static�� ���� �ڿ��� �ν��Ͻ��� ����� ������ ȣ���� �� �ִ� (���������� ���̾�� �����ϱ⶧��)
	 		- static �޼���� static �ڿ��� ���� Ȱ���� �� �ִ� �޼����̴�
	 		- �ν��Ͻ��� �ϳ��� �������� ���� ���� static �޼��尡 ���� ���ɼ��� �����ϱ� ������
	 		  static �޼��忡���� �ν��Ͻ� �ڿ��� ����� �� ����
	*/
	public static void main(String[] args) {
		System.out.println(�ؾ.�Ϻ��ѱ���ð�+"��");
		
		�ؾ.�Ϻ��ѽð������ϱ�(35);
		
		System.out.println(�ؾ.�Ϻ��ѱ���ð�+"��");
		
//		�ؾ �ؾ�1 = new �ؾ();
//		�ؾ ��2 = new �ؾ();
//		�ؾ �ؾ3 = new �ؾ();
//		
//		System.out.println(�ؾ�1.����);
//		System.out.println(��2.����);
//		System.out.println(�ؾ3.����);
////		- static ������ Ŭ������ �ϳ��̱� ������ Ŭ���� �̸��� .����� �����ϴ� ���� �����ϴ� (����)
//		System.out.println(�ؾ.����);
//		System.out.println(�ؾ.�Ϻ��ѱ���ð�);
	}
}

class �ؾ {
	// ���� ������ �ν��Ͻ� ������ ���������� �ʿ䰡���� ������ �������ʱ⶧����.
	// Ŭ������ 100���� ���ܵ� ���ο� ������ ���� �������ʴ´�.
	// ��������� ����
	static int ���� = 100;
	static int ���� = 50;
	// ���� ��� ����ð��� �Ҷ����� �ٸ��⶧���� �����Ҽ����� �� �ν���Ʈ(����)��ü���� �ٸ��⶧��
	int ���Ǿ�;
	int ����ð�;
	// ������ִ� ���� �Ϻ��ϰ� ����ð��� �����Ѵ�
	static int �Ϻ��ѱ���ð� = 33;
	
	static void �Ϻ��ѽð������ϱ�(int time) {
		�Ϻ��ѱ���ð� = time;
//		���Ǿ� = 1; �̷��� �ȵȴ� ���Ǿ��� �������� �ʾұ⶧����
	}
	
}