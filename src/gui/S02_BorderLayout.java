package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_BorderLayout extends JFrame{
	
	/*
 		# BorderLayout
 	
 			- 동서남죽과 가운데로 이루어진 레이아웃
 			- 컴포넌트를 추가할 때 위치를 함께 지정할 수 있다.
	 */
	
	public S02_BorderLayout() {
		super();
		
		// (가로공백, 세로공백)
		setLayout(new BorderLayout(50,15));
		
		add(new JButton("Button1"), BorderLayout.NORTH);
		add(new JButton("Button2"), BorderLayout.EAST);
		add(new JButton("Button3"), BorderLayout.WEST);
		add(new JButton("Button4"), BorderLayout.SOUTH);
		add(new JButton("Button5"), BorderLayout.CENTER);
		
		// frame.이 빠진 이유는 JFrame을 상속받아서 이미 class내에 있기 때문
		setSize(500, 500);
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		S02_BorderLayout frame = new S02_BorderLayout();
		
		
	}
}
