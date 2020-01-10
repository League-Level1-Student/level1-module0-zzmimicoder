package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffectMachine implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton girlHitWithBelt = new JButton();
	JButton injury = new JButton();
	JButton softGroan = new JButton();
	JButton wheeze = new JButton();
	JButton womanAgony = new JButton();
	void run() {
		panel.add(girlHitWithBelt);
		panel.add(injury);
		panel.add(softGroan);
		panel.add(wheeze);
		panel.add(womanAgony);
		girlHitWithBelt.setText("Girl Hit With Belt");
		injury.setText("Injury");
		softGroan.setText("Soft Groan");
		wheeze.setText("Wheeze");
		womanAgony.setText("Woman In Agony");
		girlHitWithBelt.addActionListener(this);
		injury.addActionListener(this);
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
			
		} else if (buttonClicked == injury) {
			
		} else if (buttonClicked == softGroan) {
			
		} else if (buttonClicked == wheeze) {
			
		} else if (buttonClicked == womanAgony) {
			
		} else {
			System.exit(0);
		}
	}
}
