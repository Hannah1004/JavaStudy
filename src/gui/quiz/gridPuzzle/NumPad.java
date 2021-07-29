package gui.quiz.gridPuzzle;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.List;

public class NumPad extends JButton{

	List<JButton> numPads;
	BufferedImage image;
	int index;
	int gameSize;
	
	int left;
	int right;
	int top;
	int bottom;
	
	public NumPad(int index, int gameSize, List<JButton> numPads, BufferedImage image) {
		this.gameSize = gameSize;
		this.image = image;
		this.numPads = numPads;
		this.index = index;
		
		// -1�� null�� �ǹ�, ���ٸ� �ǹ�
		this.top	= index - gameSize >= 0 ? index - gameSize : -1;
		this.bottom = index + gameSize < (gameSize * gameSize) ? index + gameSize : -1;
		this.left 	= index % gameSize != 0 ? index - 1 : -1;
		this.right	= index % gameSize != gameSize - 1 ? index + 1 : -1; 
		
		// ������ ĭ�� ��ĭ���� ó������
		// textAction�� ��
//		if(index == gameSize * gameSize -1) {
//			setText("");
//		}else {
//			setText("" + (index + 1));
//		}
		
		if(index == gameSize * gameSize -1) {
			setText("E");
		}else {
			setIcon(new ImageIcon(getNumPadImage()));
		}
		
		// Font�� ����, ���� �Ѵ� ó������
		setFont(new Font("����" , Font.ITALIC|Font.BOLD, 35));
		
		// actionListener�κп� ���� Ŭ������ �־��ش�.
		addActionListener(new ImageNumPadAction(this));
		//addActionListener(new TextNumPadAction());
		
	}

	private BufferedImage getNumPadImage() {
		int x = index % gameSize;
		int y = index / gameSize;
		int width = 700 / gameSize;
		int height = width;
		
		
		return image.getSubimage(x * 700 / gameSize, y * 700 / gameSize, width, height);
	}
	
}
