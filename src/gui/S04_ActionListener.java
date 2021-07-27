package gui;

import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.myhandler.MyButtonHandler2;

public class S04_ActionListener extends JFrame{

	int count = 0;
	
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
		
		// ()���� actionListener�� ���� class or �޼ҵ尡 �����⸸ �ϸ�ȴ�.
		// �׼� �����ʸ� �߰��� ������Ʈ�� ���� �̺�Ʈ�� �߻��� ������ actionPerformed�޼��带 ȣ���Ѵ�.
		btns.get(0).addActionListener(new MyButtonHandler2());
		
		btns.get(1).addMouseWheelListener(new MouseWheelListener() {
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				btns.get(1).setText("" + count++);
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(100,100);
		setSize(500, 500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new S04_ActionListener();
	}
}
