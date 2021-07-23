package gui.mycomponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyJButton extends JButton{

	int value;
	
	public MyJButton() {
		super();
		
		setText("" + value);
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// �̺�Ʈ �߻��� ActionEvent �ν��Ͻ��� �ش� �̺�Ʈ ������ �Ѿ�´�.
				System.out.println("����1 : " + e.getID());
				System.out.println("����2 : " + e.getModifiers());
				
				// ��ư�� ���� �ð��� ������
				System.out.println("����3 : " + e.getWhen());
				
				// ��ư�� �پ��ִ� �̸��� �Ѿ��
				System.out.println("����4 : " + e.getActionCommand());
				
				// � ��ư�� �������� �˷���
				System.out.println("����5 : " + e.getSource());
				
				//���� ������ value���� 1�� ������
				((MyJButton)e.getSource()).setText("" + ++value);
				
			}
		});
	}
}