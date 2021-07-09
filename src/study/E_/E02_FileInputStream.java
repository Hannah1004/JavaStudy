package study.E_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02_FileInputStream {

	public static void main(String[] args) {
		
		try {
			// 파일을 읽어들이는 통로
			FileInputStream in = new FileInputStream("a.txt");
			
			/*
			 	InputStream.read() : 한 바이트씩 읽어들인다. (한글이 깨진다.)
			 	InputStream.read(byte[]) : 파일의 데이터를 byte[]의 크기만큼 읽어들인다.
			 	InputStrea.read(byte[], start, end) : ... 버퍼의 일부분에만 읽기가 가능하다.
			 	
			 	세개의 메서드 모두 더 이상 읽을 것이 없다면 -1을 반환한다.
			 */
			
//			int ch = -1;
//			while((ch = in.read()) != -1) {
//				System.out.print((char)ch);
//			}
//			System.out.println("\n파일을 끝까지 읽었습니다.");
			
			byte[] buffer = new byte[16];
			
			//line1:
			buffer[0] = 'l';
			buffer[1] = 'i';
			buffer[2] = 'n';
			buffer[3] = 'e';
			buffer[5] = ':';
			
			
			int len = -1, count = 0;
			while((len = in.read(buffer ,6, 10))!= -1) { // 6번째 위치부터 10번째까지 읽어주세요
				buffer[4] = (byte)(count++ + '0');
				System.out.println(new String(buffer));
				System.out.println("---------------------------");
				//System.out.printf("----%d글자----\n", len);
			}
			
			in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
