package com.techlab.frame.redblue;

import javax.swing.JButton;

import java.awt.*;
import javax.swing.*;

public class ColorFrame extends JFrame {
	private JButton redButton;
	private JButton blueButton;

	public ColorFrame() {
		super();
		setTitle("color frame test");
		setSize(480, 240);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setView();
		setVisible(true);
	}

	private void setView() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		redButton = new JButton("red");
		blueButton = new JButton("blue");
		this.add(redButton);
		this.add(blueButton);
		this.getContentPane().setBackground(Color.RED);
		ColorListener colorListener = new ColorListener(this);
		redButton.addActionListener(colorListener);
		blueButton.addActionListener(colorListener);
	}
}
