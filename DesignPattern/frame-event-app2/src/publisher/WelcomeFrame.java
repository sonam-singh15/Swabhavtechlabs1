package publisher;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WelcomeFrame extends JButton {
	private JButton name;

	public WelcomeFrame() {
		Action action = new Action();
		JFrame frame = new JFrame();

		frame.setVisible(true);
		frame.setTitle("Sonam");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		frame.add(panel);
		name = new JButton("name");
		name.setBounds(220, 150, 200, 20);
		name.setActionCommand(JButtonType.abc.name());

		name.addActionListener(action);

		panel.add(name);
	}

	public JButton getHello() {
		return name;
	}

}
