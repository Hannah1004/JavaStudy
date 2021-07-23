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
				
				// 이벤트 발생시 ActionEvent 인스턴스에 해당 이벤트 정보가 넘어온다.
				System.out.println("정보1 : " + e.getID());
				System.out.println("정보2 : " + e.getModifiers());
				
				// 버튼을 누른 시간을 보여줌
				System.out.println("정보3 : " + e.getWhen());
				
				// 버튼에 붙어있는 이름이 넘어옴
				System.out.println("정보4 : " + e.getActionCommand());
				
				// 어떤 버튼이 눌렀는지 알려줌
				System.out.println("정보5 : " + e.getSource());
				
				//누를 때마다 value값이 1씩 증가함
				((MyJButton)e.getSource()).setText("" + ++value);
				
			}
		});
	}
}
