package study.d_;

import java.util.ArrayList;
import java.util.Arrays;

public class D08_String2 {
	
	public static void main(String[] args) {
		String languages = "Java, Python, C, C++, C#, Kotlin, JavaScript,";
		languages += languages;
		languages += languages;
		languages += languages;

		int start=0;
		ArrayList<Integer> index = new ArrayList<>();
		if(languages.indexOf("Java")==0) {
			index.add(0);
		}
		while (true) {
			start = languages.indexOf("Java",start+1);
			if(start==-1) {
				break;
			}
			index.add(start);
		}
		System.out.println(index);
		
		for(int i=0; i<index.size();i++) {
			
		}
	}
}





