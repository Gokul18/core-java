package in.co.swing;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyBoxLayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame("my box layout window");
		JPanel pan = (JPanel) frame.getContentPane();
		BoxLayout layout = new BoxLayout(pan, BoxLayout.X_AXIS);
		// BoxLayout layout=new BoxLayout(pan,BoxLayout.Y_AXIS);
		pan.setLayout(layout);
		JButton b1 = new JButton("button1");
		pan.add(b1);
		JTextField text = new JTextField("enter text");
		pan.add(text);
		JButton b2 = new JButton("button2");
		pan.add(b2);
		JButton b3 = new JButton("button3");
		pan.add(b3);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
