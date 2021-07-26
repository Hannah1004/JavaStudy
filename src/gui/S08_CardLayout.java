package gui;

import java.awt.CardLayout;
import java.awt.Image;
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
		
		JPanel panel1 = new ImagePanel(icons);
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		// ī�� ���̾ƿ��� ����� ���� name�� �����ϰ� ���ȴ�.
		card_panel.add("card1", panel1);
		card_panel.add("card2", panel2);
		card_panel.add("card3", panel3);
		
		add(card_panel, "Center");
		add(new JButton("next card!"), "South");
	}
	
	public static void main(String[] args) {
		S08_CardLayout frame = new S08_CardLayout();
		frame.setDefaultOptions();
	}
}
