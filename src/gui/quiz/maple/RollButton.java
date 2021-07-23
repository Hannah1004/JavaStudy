package gui.quiz.maple;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class RollButton extends JButton{

	ArrayList<RandomButton> ranBtns;

	public RollButton() {
		ranBtns = new ArrayList<>();
		ranBtns.add(new RandomButton());
		ranBtns.add(new RandomButton());
		ranBtns.add(new RandomButton());
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for(RandomButton btn : ranBtns) {
					btn.roll();
				}
			}
		});
		
	}
	
	public ArrayList<RandomButton> getRanBtns(){
		return ranBtns;
	}
}
