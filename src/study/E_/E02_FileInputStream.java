package study.E_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02_FileInputStream {

	public static void main(String[] args) {
		
		try {
			// ������ �о���̴� ���
			FileInputStream in = new FileInputStream("a.txt");
			
			/*
			 	InputStream.read() : �� ����Ʈ�� �о���δ�. (�ѱ��� ������.)
			 	InputStream.read(byte[]) : ������ �����͸� byte[]�� ũ�⸸ŭ �о���δ�.
			 	InputStrea.read(byte[], start, end) : ... ������ �Ϻκп��� �бⰡ �����ϴ�.
			 	
			 	������ �޼��� ��� �� �̻� ���� ���� ���ٸ� -1�� ��ȯ�Ѵ�.
			 */
			
//			int ch = -1;
//			while((ch = in.read()) != -1) {
//				System.out.print((char)ch);
//			}
//			System.out.println("\n������ ������ �о����ϴ�.");
			
			byte[] buffer = new byte[16];
			
			//line1:
			buffer[0] = 'l';
			buffer[1] = 'i';
			buffer[2] = 'n';
			buffer[3] = 'e';
			buffer[5] = ':';
			
			
			int len = -1, count = 0;
			while((len = in.read(buffer ,6, 10))!= -1) { // 6��° ��ġ���� 10��°���� �о��ּ���
				buffer[4] = (byte)(count++ + '0');
				System.out.println(new String(buffer));
				System.out.println("---------------------------");
				//System.out.printf("----%d����----\n", len);
			}
			
			in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
