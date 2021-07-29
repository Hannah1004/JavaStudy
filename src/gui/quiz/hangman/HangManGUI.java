package gui.quiz.hangman;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import gui.StudyFrame;

public class HangManGUI extends StudyFrame implements ActionListener{

	/*
	 	 �Ȱ��� ��������� _�� ������ �ܼ� ��� �����ӿ� �������� ����غ�����.
	 	 
	 	 KeyEvent�� ���� � Ű�� ���ȴ��� Ȯ���Ͽ� ������ üũ���ּ���
	 	 
	 	 ������ Ʋ�ȴٸ� ���� �׸����� �Ѿ�� ������ �׸����� Ʋ����
	 	 �� �̻� �Է��� ���� �ʰ�, �׸��� �Ѿ�� �ʰ� ���ּ���
	*/
	HangMan hm = new HangMan();
	
	ArrayList<ImageIcon> icons;
	JPanel main_panel, left_panel, bottom_panel;
	JLabel status;
	
	int count;
	char user_word;
	
	public HangManGUI() {
		super();
	
		status = new JLabel("stable");
		
		hm.loadFile("dictionary/EngWord.txt");
		hm.wordPrint();
		
		while(true) {
			if(hm.AnswerWord.contains('_')) {
				hm.userAnswer(user_word);
				count++;
			}else {
				status.setText(count + "�� �����߽��ϴ�.");
				break;
			}
		}
		
		main_panel = new JPanel();
		main_panel.setLayout(new GridLayout(2,0));
		
		left_panel = new JPanel();
		
		bottom_panel = new JPanel();
		bottom_panel.setLayout(new GridLayout(1,2));
		
		//imgPanel();
		main_panel.add(left_panel, "East");
		main_panel.add(bottom_panel, "South");
		
		add(main_panel);
		add(status, "North");
		
		createBtn(bottom_panel);
	}
	
	void imgPanel() {
		BufferedImage img;
		icons = new ArrayList<>();
		
		try {
			for(int i = 1; i <= 8; ++i) {
				img = ImageIO.read(new File("./image/hangMan/hangMan" + i + ".PNG"));
				icons.add(new ImageIcon(img.getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			img = null;
		}
		
		//System.out.println(icons);
	}

	void createBtn(JPanel bottom_panel) {
		
		JTextArea ta = new JTextArea();
		ta.setBounds(30, 30, 30, 30);
		
		ta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				user_word = e.getKeyChar();
			}
		});
		bottom_panel.add(ta, "South");
	}
	
	
	public static void main(String[] args) {
		HangManGUI frame = new HangManGUI();
		frame.setDefaultOptions();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}
}
