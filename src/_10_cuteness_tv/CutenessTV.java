package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton ducks = new JButton();
	JButton frogs = new JButton();
	JButton unicorns = new JButton();
	void run() {
		ducks.setText("SHOW DUCKS");
		frogs.setText("SHOW FROGS");
		unicorns.setText("SHOW FLUFFY UNICORNS");
		panel.add(ducks);
		panel.add(frogs);
		panel.add(unicorns);
		ducks.addActionListener(this);
		frogs.addActionListener(this);
		unicorns.addActionListener(this);
		frame.add(panel);
		frame.setVisible(true);
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}
	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}
	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked == ducks) {
			showDucks();
		} else if (buttonClicked == frogs) {
			showFrog();
		} else if (buttonClicked == unicorns) {
			showFluffyUnicorns();
		} else {
			System.exit(0);
		}
	}
}
