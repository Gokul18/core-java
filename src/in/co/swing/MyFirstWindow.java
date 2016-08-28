package in.co.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFirstWindow {
	public static void main(String[] args) {
		JFrame frame = new JFrame("myfirstwindow");
		frame.setLayout(new BorderLayout());
		JPanel pan = (JPanel) frame.getContentPane();
		JButton b1 = new JButton("NORTH");
		pan.add(b1, BorderLayout.NORTH);
		JButton b2 = new JButton("SOUTH");
		pan.add(b2, BorderLayout.SOUTH);
		JButton b3 = new JButton("right");
		pan.add(b3, BorderLayout.EAST);
		JButton b4 = new JButton("west");
		pan.add(b4, BorderLayout.WEST);
		JButton b5 = new JButton("center");
		pan.add(b5);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
