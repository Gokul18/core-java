package in.co.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstWindow {
	public static void main(String[] args) {
		JFrame frame = new JFrame("my first window");
		JPanel pan = (JPanel) frame.getContentPane();
		JButton b = new JButton("Click me");
		pan.add(b);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		// frame.setSize(400, 200);
		frame.setVisible(true);

	}

}
