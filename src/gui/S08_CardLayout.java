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
		
		// CardLayout : 컴포넌트를 카드처럼 넘기면서 사용하는 레이아웃
		JPanel card_panel = new JPanel(new CardLayout(10,10));
		
		ArrayList<ImageIcon> icons = new ArrayList<>();
		
		BufferedImage image;
		try {
			image = ImageIO.read(new File("./image/animals/penguin.jpeg"));
		} catch (IOException e) {
			e.printStackTrace();
			image = null;
		}
		
		// 이미지의 사이즈를 조절해서 icons에다가 넣음
		icons.add(new ImageIcon(image.getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
		icons.add(new ImageIcon(image.getScaledInstance(350, 350, Image.SCALE_SMOOTH)));
		icons.add(new ImageIcon(image.getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		
		JPanel panel1 = new ImagePanel(icons);
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		// 카드 레이아웃을 사용할 때는 name이 유용하게 사용된다.
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
