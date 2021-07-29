package gui.quiz.gridPuzzle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

public class ImageNumPadAction implements ActionListener{

	int left;
	int right;
	int top;
	int bottom;
	
	NumPad numPad;
	List<JButton> numPads;
	
	public ImageNumPadAction(NumPad numPad) {
		this.numPad = numPad;
		this.numPads = numPad.numPads;
		
		int index = numPad.index;
		int gameSize = numPad.gameSize;
		
		// -1은 null을 의미, 없다를 의미
		this.top	= index - gameSize >= 0 ? index - gameSize : -1;
		this.bottom = index + gameSize < (gameSize * gameSize) ? index + gameSize : -1;
		this.left 	= index % gameSize != 0 ? index - 1 : -1;
		this.right	= index % gameSize != gameSize - 1 ? index + 1 : -1; 
	}
	
	private boolean isBlank(int index) {
	
		return numPads.get(index).getIcon() == null;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println(((JButton)e.getSource()).getIcon());
		
		if(top != -1 && isBlank(top)) {
			numPads.get(top).setIcon(numPad.getIcon());
			numPad.setIcon(null);
			
			numPads.get(top).setText("");
			numPad.setText("E");
		}else if(bottom != -1 && isBlank(bottom)) {
			numPads.get(bottom).setIcon(numPad.getIcon());
			numPad.setIcon(null);
			
			numPads.get(bottom).setText("");
			numPad.setText("E");
		}else if(left != -1 && isBlank(left)) {
			numPads.get(left).setIcon(numPad.getIcon());
			numPad.setIcon(null);
			
			numPads.get(left).setText("");
			numPad.setText("E");
		}else if(right != -1 && isBlank(right)) {
			numPads.get(right).setIcon(numPad.getIcon());
			numPad.setIcon(null);

			numPads.get(right).setText("");
			numPad.setText("E");
		}
		
	}

}
