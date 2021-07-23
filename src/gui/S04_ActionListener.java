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
		btns.add(new gui.mycomponent.MyJButton());	//JButton�� ��ӹ��� class (upcasting)
		
		// ��ư ����
		btns.get(0).setText("�ȳ��ϼ���");
		btns.get(0).setFont(new Font("�ü�ü", Font.PLAIN, 35));
		
		// ��ư �߰�
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