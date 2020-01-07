package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	void run() {
		frame.setVisible(true);
		frame.add(button);
		frame.pack();
		button.setText("CLICK HERE RIGHT NOW YOU");
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			System.out.println("Yes");
		} else if (rand == 1) {
			System.out.println("No");
		} else if (rand == 2) {
			System.out.println("Probably");
		} else if (rand == 3) {
			System.out.println("Probably Not");
		} else if (rand == 4) {
			System.out.println("Maybe");
		} else {
			System.out.println("Perhaps");
		}
	}
}
