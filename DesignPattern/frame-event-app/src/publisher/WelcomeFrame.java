package publisher;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import subscriber.HelloMessageObserver;

public class WelcomeFrame extends JFrame {
	private JButton hello;
	private JButton exit;

	public WelcomeFrame() {

		this.setVisible(true);
		this.setTitle("Sonam");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);
		hello = new JButton("Hello");
		hello.setBounds(10, 150, 200, 20);

		exit = new JButton("Bye");
		exit.setBounds(220, 150, 200, 20);

		panel.add(hello);
		panel.add(exit);
	}

	public JButton getHello() {
		return hello;
	}

	public JButton getExit() {
		return exit;
	}

}
