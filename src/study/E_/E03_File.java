package study.E_;

import java.io.File;
import java.util.Arrays;

public class E03_File {
	
	/*
	 	# java.io.File
	 	
	 		- 파일 시스템에 저장되어 있는 파일의 정보를 담을 수 있는 클래스
	 		- File 인스턴스에 담겨있는 정보를 바탕으로 해당 파일을 수정하거나
	 		  새로운 파일 또는 디렉토리를 생성할 수 있다.
	 		
	 */
	
	public static void main(String[] args) {
		File f1 = new File("note/Git 사용 설명서.txt");
		File f2 = new File("note/Git 사용 설명서");
		File f3 = new File("files");
		File f4 = new File(f3, "game.sav"); // parent, child (files, game.sav)
		File f5 = new File("image/flower");
		
		
		System.out.println("파일이 존재하나요? " + f1.exists());
		// 확장자까지 써야 있는지 없는지 판단해줌
		System.out.println("파일이 존재하나요? " + f2.exists());
		
		// 파일에는 3개의 권한이 있다.
		System.out.println("읽기 권한이 있는 파일인가요? " + f1.canRead());
		System.out.println("쓰기 권한이 있는 파일인가요? " + f1.canWrite());		// false : 수정, 생성권한이 없다.
		System.out.println("실행 권한이 있는 파일인가요? " + f1.canExecute());
		
		System.out.println("f1에 담겨있는 경로가 절대 경로 인가요? " + f1.isAbsolute());
		System.out.println("f1의 절대 경로 : " + f1.getAbsolutePath());
		System.out.println("f1은 디렉토리 인가요? " + f1.isDirectory());
		System.out.println("f1의 경로 : " + f1);
		
		System.out.println(f3.isDirectory());
		System.out.println(f4);
		System.out.println(f4.getAbsolutePath());
		
		// list() : 해당 디렉토리 내부의 파일 이름들을 String[]로 가져온다.
		// listFiles() : 해당 디렉토리 내부의 모든 파일 정보들을 File[]로 가져온다.
		System.out.println("f3 내부의 파일 이름들 : " +  Arrays.toString(f3.list()));
		
		if(!f5.exists()) {
			// mkdir : 해당 경로로 새로운 디렉토리(폴더) 생성 (부모 디렉토리가 없는 경우)
			//f5.mkdir();
			
			//mkdirs : 부모 디렉토리가 존재하지 않는 경우에도 디렉토리를 생성
			f5.mkdirs();
			System.out.println("새로 생성함");
		}else {
			System.out.println("이미 존재해서 생성하지 않음");
		}
		
	}
	
}
