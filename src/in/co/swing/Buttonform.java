package in.co.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buttonform extends JFrame {
	public Buttonform() {
		super("my first window");
		JPanel pan = (JPanel) getContentPane();
		JButton button = new JButton("click me");
		pan.add(button);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
