package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffectMachine implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton girlHitWithBelt = new JButton();
	JButton augh = new JButton();
	JButton softGroan = new JButton();
	JButton wheeze = new JButton();
	JButton womanAgony = new JButton();
	void run() {
		panel.add(girlHitWithBelt);
		panel.add(augh);
		panel.add(softGroan);
		panel.add(wheeze);
		panel.add(womanAgony);
		girlHitWithBelt.setText("Girl Hit With Belt");
		augh.setText("Augh");
		softGroan.setText("Soft Groan");
		wheeze.setText("Wheeze");
		womanAgony.setText("Woman In Agony");
		girlHitWithBelt.addActionListener(this);
		augh.addActionListener(this);
		softGroan.addActionListener(this);
		wheeze.addActionListener(this);
		womanAgony.addActionListener(this);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked == girlHitWithBelt) {
			playSound("GirlHitWithBelt.wav");
		} else if (buttonClicked == augh) {
			playSound("Augh.wav");
		} else if (buttonClicked == softGroan) {
			playSound("SoftGroan.wav");
		} else if (buttonClicked == wheeze) {
			playSound("Wheeze.wav");
		} else if (buttonClicked == womanAgony) {
			playSound("WomanAgony.wav");
		} else {
			System.exit(0);
		}
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
}
