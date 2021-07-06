package study.E_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_JavaIO {

	/*
	 	# java I/O (Input/Output)
	 	
	 		- �ڹٴ� ��Ʈ���̶�� ������ �̿��� ���α׷� ��/����� �ٷ��.
	 		- ���α׷����� ������ ��� �����͵��� �Է��̶�� �θ��� (Input)
	 		- ���α׷����� ���Ǿ� ������ �����͵��� ����̶�� �θ���. (Output)
	 		
	 	# Stream
	 		
	 		- �����͵��� ������ ���
	 		- �����͵��� ���������� ���α׷����� ������ ��θ� InputStream�̶�� �θ���.
	 		- �����͵��� ��µǴ� ������ �������� ��θ� OutputStream�̶�� �θ���.
	 		- �����Ͱ� Stream�� ���� �̵��ϱ� ���ؼ��� �����͸� byteŸ������ ��ȯ���Ѿ��Ѵ�.
	 */
	
	public static void main(String[] args) {
		
		try {
			// FileOutputStream : ���Ϸ� ������ �� �ִ� ���
			// true ���� �����Ҷ����� ������ ��� �߰��ȴ�.
			// false ���� ���µȴ�.
			FileOutputStream out = new FileOutputStream("a.txt", false);
			
			// .write() : ���Ͽ� ���� �߰��ϱ�
			out.write(65);
			out.write(66);
			out.write(67);
			out.write(68);
			out.write("\nHello World!".getBytes());
			
			// �� �� ��δ� �ݵ�� �ݾ�����Ѵ�.
			out.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
}
