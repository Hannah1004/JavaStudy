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
		btns.add(new gui.mycomponent.MyJButton());	//JButton을 상속받은 class (upcasting)
		
		// 버튼 수정
		btns.get(0).setText("안녕하세요");
		btns.get(0).setFont(new Font("궁서체", Font.PLAIN, 35));
		
		// 버튼 추가
		add(btns.get(0), "Center");
		add(btns.get(1), "East");
		
		// ()에는 actionListener를 가진 class or 메소드가 들어오기만 하면된다.
		// 액션 리스너를 추가한 컴포넌트는 무언가 이벤트가 발생할 때마다 actionPerformed메서드를 호출한다.
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
