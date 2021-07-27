package gui;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import gui.mypanel.ImagePanel;

public class S08_CardLayout extends StudyFrame{

	public S08_CardLayout() {
		super();
		
		// CardLayout : ������Ʈ�� ī��ó�� �ѱ�鼭 ����ϴ� ���̾ƿ�
		JPanel card_panel = new JPanel(new CardLayout(10,10));
		
		ArrayList<ImageIcon> icons = new ArrayList<>();
		ArrayList<ImageIcon> icons3 = new ArrayList<>();
		
		BufferedImage image;
		try {
			image = ImageIO.read(new File("./image/animals/penguin.jpeg"));
		} catch (IOException e) {
			e.printStackTrace();
			image = null;
		}
		
		// �̹����� ����� �����ؼ� icons���ٰ� ����
		icons.add(new ImageIcon(image.getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
		icons.add(new ImageIcon(image.getScaledInstance(350, 350, Image.SCALE_SMOOTH)));
		icons.add(new ImageIcon(image.getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		
		icons3.add(new ImageIcon("./image/fruits/kiwi.jpeg"));
		icons3.add(new ImageIcon("./image/fruits/apple.jpeg"));
		icons3.add(new ImageIcon("./image/fruits/grape.jpeg"));
		icons3.add(new ImageIcon("./image/fruits/watermelon.png"));
		//icons3.add(new ImageIcon(""));
		
		JPanel panel1 = new ImagePanel(icons);
		JPanel panel2 = new JPanel();
		JPanel panel3 = new ImagePanel(icons3);
		JButton south_btn = new JButton("next card!");
		
		// ī�� ���̾ƿ��� ����� ���� name�� �����ϰ� ���ȴ�.
		card_panel.add("card1", panel1);
		card_panel.add("card2", panel2);
		card_panel.add("card3", panel3);
		
		add(card_panel, "Center");
		add(south_btn, "South");
		
		/*
		 	CardLayout.next(parent) 	: ���� ī�� ����
		 	CardLayout.previous(parent) : ���� ī�� ����
		 	CardLayout.first(parent) 	: �� ó�� ī�� ����
		 	CardLayout.last(parent) 	: ������ ī�� ����
		 */
		
		// ������ ��ư�� ��ӹ޾Ƽ� �ٸ� Ŭ������ �и��ؼ� �ϴ°� ����
		south_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// �ش� �г� �Ǵ� �����ӿ� ���ǵ� ���̾ƿ��� ������ ����� ���� �ִ�.
				// �ٿ� ĳ����
				CardLayout card_layout = ((CardLayout)card_panel.getLayout());
				
				card_layout.next(card_panel);
			}
		});
	}
	
	public static void main(String[] args) {
		S08_CardLayout frame = new S08_CardLayout();
		frame.setDefaultOptions();
	}
}
