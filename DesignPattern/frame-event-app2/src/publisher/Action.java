package publisher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Action implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == JButtonType.abc.name()) {
			JFrame jf = new JFrame();
			jf.setTitle("Hello");
			JLabel label = new JLabel("Sonam");
			label.setBounds(50, 25, 100, 100);
			JPanel jp = new JPanel();
			jf.add(jp);
			jp.add(label);
			jf.setSize(200, 200);
			jf.setVisible(true);
		}
	}

}
