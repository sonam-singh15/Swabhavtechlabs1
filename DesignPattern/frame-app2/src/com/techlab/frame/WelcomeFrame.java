package com.techlab.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WelcomeFrame extends JFrame {

	public WelcomeFrame() {

		this.setVisible(true);
		this.setTitle("sonam");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);

	}

}
