package gui.quiz.maple;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MapleStory extends JFrame{

	/*
		# ������! ��ư�� ������ �ɼ��� �������� 5���߿� 3�� �����Ǵ� ���α׷��� ��������.
			- 5���߿� 3�� �������� �̴µ� �� �ɼ��� ���ڵ� ����
			- 3���� ���ڰ� ������ ��÷!
		
		�� �ɼ� 4����
		
			1. �� ���� +1 ~ +7
			2. ���� ���� +1 ~ +7
			3. ��ø ���� +1 ~ +7
			4. ��� ���� +1 ~ +7
			5. ���ݷ� ���� +1 ~ +3
	*/
	int money = 7000;
	
	public MapleStory() {
		super("��ǳ �̾߱�!");
		
		setLayout(new BorderLayout(50, 15));
		
		JButton drawBtn = new JButton(" rolling! ");
		add(drawBtn, "South");
		
		JButton[] btns = new JButton[3];
		btns[0] = new JButton("option1");
		btns[1] = new JButton("option2");
		btns[2] = new JButton("option3");
		
		add(btns[0], "West");
		add(btns[1], "Center");
		add(btns[2], "East");
		
		drawBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				btns[0].setText(drawResult().get(0));
				btns[1].setText(drawResult().get(1));
				btns[2].setText(drawResult().get(2));
				
				money += 7000;
				drawBtn.setText("rolling! money : " + money);
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(100,100);
		setSize(700, 700);
		setVisible(true);
	}

	public static ArrayList<String> drawResult(){
		
		ArrayList<String> result = new ArrayList<>();
		String resultText;
		
		while(true) {
			if(result.size() == 3) {
				break;
			} else {
				String[] options = {"�� ����", "���� ����", "��ø ����", "��� ����", "���ݷ� ����"};
				
				int ran1 = (int)(Math.random() * 6 + 1);
				int ran2 = (int)(Math.random() * 2 + 1);
				int ran3 = (int)(Math.random() * 4 + 1);
			
				if(options[ran3].equals("���ݷ� ����")) {
					resultText = (options[ran3] + ran2);
				}else {
					resultText = (options[ran3] + ran1);
				}
				
				result.add(resultText);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		new MapleStory();
		
	}
	
}
