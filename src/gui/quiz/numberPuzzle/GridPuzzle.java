package gui.quiz.numberPuzzle;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import gui.StudyFrame;

public class GridPuzzle extends StudyFrame implements ActionListener{

	/*
		숫자 1~15까지 grid만들고 랜덤으로 주어줘서 맞추기
		menu : size(3x3,5x5,7x7), 테마, save
	*/
	
	static ArrayList<JButton> btns = new ArrayList<>();
	
	
	public GridPuzzle() {
		super();
		
		// 메뉴바 만들기 메서드
		setJMenuBar(menu());
		
		// gameSetting
		add(gameSetting(), "Center");
		
		for(int i = 0; i < 16; i++) {
			btns.get(0).addActionListener(this);
		}
		
		
	}
	
	public static JMenuBar menu() {
		JMenuBar bar = new JMenuBar();
		
		JMenu main = new JMenu("Menu");
		
		JMenuItem size = new JMenuItem("Size");
		JMenuItem theme = new JMenuItem("Theme");
		JMenuItem save = new JMenuItem("Save");
		
		main.add(size);
		main.add(theme);
		main.add(save);
		
		bar.add(main);
		
		return bar;
	}
	
	public static JPanel gameSetting() {
		JPanel center_panel = new JPanel();
		
		center_panel.setLayout(new GridLayout(4,4));
		
		for(int i = 1; i < 16; i++) {
			JButton btn = new JButton("" + i);
			btns.add(btn);
		}
		
		Collections.shuffle(btns);
		for(JButton btn : btns) {
			center_panel.add(btn);
		}
		center_panel.add(new JButton(""));
		
		return center_panel;
	}
	
	public static void main(String[] args) {
		GridPuzzle frame = new GridPuzzle();
		frame.setDefaultOptions();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	} 
}

