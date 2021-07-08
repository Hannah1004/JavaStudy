package quiz.E_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E05_Encrypt {

   // frankenstein.txt를 암호한 파일 frankenstein_encrypted.txt를 만들어보세요
   // ※ 열쇠값은 랜덤이지만 원본과 같은 결과가 나와서는 안됨 (0이랑 26은 안됨)
   /*
        # 암호 열쇠값이 1 | 2인 경우
              +1               +2
           C   -->      D   |   C   -->      E
         A   -->      B   |   A   -->      C
         R   -->      S   |   R   -->      T
         
         CAR --> DBS      |   CAR --> ECT , ZOO --> BQQ
         
    */

	public static void main(String[] args) {
		
		encryption("files/frankenstein.txt", (int)(Math.random() * 24 +1));  // 1 ~ 25 랜덤수
		
	}
   
	// 암호화
	public static boolean encryption(String path ,int key) {
		
		File file = new File(path);
		String fileName = file.getName();
		String realFileName = fileName.substring(0, fileName.indexOf("."));
		File dst = new File("files/" + realFileName + "_encrypted.txt");
		
		try(
				FileReader fin = new FileReader(file);
				BufferedReader in = new BufferedReader(fin);
				FileWriter fout = new FileWriter(dst);
				BufferedWriter out = new BufferedWriter(fout)
		){
			
			String line;
			while((line = in.readLine()) != null) {
				for(char ch : line.toCharArray()) {
					if(Character.isUpperCase(ch)) { 		// 대문자일때
						ch = (char)((ch - 'A' + key) % 26 + 'A');
					}else if(Character.isLowerCase(ch)) {	// 소문자일때
						ch = (char)((ch - 'a' + key) % 26 + 'a');
					}
					out.append(ch);
				}
				out.append("\n");
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.printf("암호화 성공! [키 : %d]\n", key);
		return true;
	}
	
}