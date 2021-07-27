package gui.quiz.numberPuzzle;

import java.util.ArrayList;

import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberPuzzleHandler implements ActionListener{

	ArrayList<JButton> btns;

	public NumberPuzzleHandler(ArrayList<? extends JButton> btns) {
		this.btns = (ArrayList<JButton>) btns;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
	}
	
}
