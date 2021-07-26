package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import gui.myhandler.GenerateColorHandler;

public class S07_GridLayout extends StudyFrame{

	public S07_GridLayout() {
		super();
		
		ArrayList<JButton> btns = new ArrayList<>();
		
		// 2개 이상의 레이아웃을 사용하고 싶다면 JPanel을 이용한다.
		setLayout(new BorderLayout());
		
		// JPanel은 레이아웃을 설정할 수 있는 새로운 판이다.
		JPanel center_panel = new JPanel();
		JButton south_button = new JButton("Generate Color!");
		
		
		add(center_panel, "Center");
		add(south_button, "South");
		
		// 3칸씩 5줄
		center_panel.setLayout(new GridLayout(5, 3));
		
		for(int i = 0; i < 15; ++i) {
			JButton btn = new JButton("Button" + i);
			
			btns.add(btn);
			
			btn.setBackground(new Color((int)(Math.random() * 0xFFFFFF)));
			
			center_panel.add(btn);
		}
		
		// 화면을 구성하는 코드와 동작을 처리하는 코드는 분리하는 것이 좋다.
		// gui.myhandler에 GenerateColorHandler에 분리해놓음\
		south_button.addActionListener(new GenerateColorHandler(btns));
		// 버튼을 프로그램적으로 클릭한다.
		// doClick()을 쓰지 않으면 아무 색이 없는 상태이다.
		south_button.doClick();
		
	}
	
	public static void main(String[] args) {
		S07_GridLayout frame = new S07_GridLayout();
		frame.setDefaultOptions();
	}
}
