package gui.quiz.maple;

import javax.swing.JFrame;

public class MapleStroyTeacher extends JFrame{

	public MapleStroyTeacher() {
		super("´ÜÇ³ ÀÌ¾ß±â!");
		
		 setLayout(null);
		 
		 RollButton rollBtn = new RollButton();
		 add("roll", rollBtn);
		 
		 add("stat1", rollBtn.getRanBtns().get(0));
		 add("stat1", rollBtn.getRanBtns().get(1));
		 add("stat2", rollBtn.getRanBtns().get(2));
		 
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocation(100,100);
			setSize(700, 700);
			setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MapleStroyTeacher();
	}
}
