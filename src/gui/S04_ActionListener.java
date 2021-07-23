package gui;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S04_ActionListener extends JFrame{

	public S04_ActionListener() {
		super();
		
		ArrayList<JButton> btns = new ArrayList<>();
		
		btns.add(new JButton());
		btns.add(new gui.mycomponent.MyJButton());	//JButton을 상속받은 class (upcasting)
		
		// 버튼 수정
		btns.get(0).setText("안녕하세요");
		btns.get(0).setFont(new Font("궁서체", Font.PLAIN, 35));
		
		// 버튼 추가
		add(btns.get(0), "Center");
		add(btns.get(1), "East");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(100,100);
		setSize(500, 500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new S04_ActionListener();
	}
}
