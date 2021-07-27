package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S01_JavaSwing {

	/*
	 	# JavaSwing
	 		
	 		- javax.swing ��Ű���� ����ִ� Ŭ������ Windows GUI ���α׷��� ���� �� �ִ�.
	 		
	 	# Container
	 		
	 		- ���� ������Ʈ���� ��ġ�� �� �ִ� ��
	 		- JFrame, JPanel, JDialog... ��
	 		- �����̳ʸ��� ���̾ƿ��� ������ �� �ִ�.
	 		
	 	# Component
	 		
	 		- �����̳� ���� ��ġ�� �� �ִ� ��ǰ
	 		- ��ư, ǥ, �����̴�, �޴� ... ���
	 	
	 */

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		// ��ư ����
		// �� ������Ʈ �ν��Ͻ� ���� �����ϴ� ������� �ش� ������Ʈ�� �ڼ��� ������ �� �ִ�
		JButton btn1 = new JButton("This is button");
		btn1.setLocation(100,100);
		btn1.setSize(150, 80);
		
		JButton btn2 = new JButton("Button 2");
		btn2.setLocation(-10,-10);
		btn2.setSize(150, 80);
		
		// ��ư �߰�
		frame.add(btn1);
		frame.add(btn2);
		frame.add(new JButton("button 3") {
			{
				setLocation(400, 30);
				setSize(150, 80);
			}
		});
		
		// ���̾ƿ� ����
		frame.setLayout(null);
		
		// X��ư ������ ���� ������ ����
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		// X��ư ������ �ٷ� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ������ ũ�� ����
		frame.setSize(500, 500);
		
		// ������ ��� �������� ���̰��Ѵ�. (ȭ�鿡 �׸��� ȿ���� �ִ�.) �� �� �������� ���°� ����
		frame.setVisible(true);
		
	}
	
}
