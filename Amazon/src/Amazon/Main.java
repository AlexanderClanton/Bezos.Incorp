package Amazon;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {
	public static void main(String[]args) {
		JFrame Frame = new JFrame();
		Frame.getContentPane().setPreferredSize(new Dimension(1000,1000));
		Frame.setVisible(true);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.add(new Home());
		Frame.pack();
	}
}
