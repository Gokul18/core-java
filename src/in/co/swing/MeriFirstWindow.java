package in.co.swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MeriFirstWindow {
	public static void main(String[] args) {
		JFrame frame = new JFrame("MERI FIRST WINDOW");
		JPanel pan = (JPanel) frame.getContentPane();
		pan.setLayout(new GridLayout(3, 2));
		JButton b1 = new JButton("button1");
		pan.add(b1);
		JButton b2 = new JButton("button2");
		pan.add(b2);
		JButton b3 = new JButton("button3");
		pan.add(b3);
		JButton b4 = new JButton("button4");
		pan.add(b4);
		JButton b5 = new JButton("button5");
		pan.add(b5);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);

	}

}
