package myobj.c07;

abstract public class School {
	
	int classNum;
	int studentCount;
	int totalScore[];
	Double[] avaScore;	
	int studentNum[];
	String name[];
	
	String firstName[] = {"김","강","고","나","도","신","이","조","장","최","차","박","문","한"};
	String middleName[] = {"가","은","호","상","대","정","현","지","영","재","원","주","한","미"};
	String lastName[] = {"가","은","호","상","대","정","현","지","영","재","원","주","한","미"};
	
	int korean[];
	int english[];
	
	String randomMakeName() {		
		int first = (int)(Math.random() * firstName.length + 0);
		int middle = (int)(Math.random() * middleName.length + 0);
		int last = (int)(Math.random() * lastName.length + 0);
		
		return firstName[first] + middleName[middle] + lastName[last];
	}
	
	abstract void randomMakeScore();
	
	abstract void printGrade();
}
