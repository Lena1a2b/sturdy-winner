import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

class SimpleClickListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked �t " + e.getX() + "," + e.getY());
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}
	
}

public class Main5 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(400, 300);
		jf.addMouseListener(new SimpleClickListener());
		jf.setVisible(true);
	}
}

