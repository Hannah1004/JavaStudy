package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class S05_JLabel extends StudyFrame{
	/*
	 	# JLabel
	 	
	 		- 텍스트를 적는 용도로 사용되는 컴포넌트
	 		
	 	# Icon으로 이미지 넣기
	 */
	int count;
	public S05_JLabel() {
		super();
		
		Icon[] icons = {
				new ImageIcon("./image/penguin.jpeg"),
				new ImageIcon("./image/cat.jpeg"),
				new ImageIcon("./image/puppy.jpeg")
		};
		
		JButton btn = new JButton();
		JLabel label = new JLabel(icons[count]);
		
		btn.setText("Button");
		//label.setText("Label");
		
		add(btn, "South");
		add(label, "Center");
		
		// 연습문제 : 버튼을 누르면 다른 그림으로 바뀌도록 만들어 보세요 (그림은 계속 순환되어야 함)
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				label.setIcon(icons[++count % icons.length]);
			}
		});
	}
	
	public static void main(String[] args) {
		S05_JLabel frame = new S05_JLabel();
		frame.setDefaultOptions();
	}
}
