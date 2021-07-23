package gui.quiz.maple;

import java.util.Random;

import javax.swing.JButton;

public class RandomButton extends JButton{

	static String[] stat_labels = {"��", "��ø", "����", "���", "���ݷ�"};
	static int[] max_stat = {7, 7, 7, 7, 3};
	
	Random ran;
	
	public RandomButton() {
		super("None");
	}
	
	void roll() {
		int value = ran.nextInt(stat_labels.length);
		
		setText(stat_labels[value] + " " + (ran.nextInt(max_stat[value]) + 1));
	}
}