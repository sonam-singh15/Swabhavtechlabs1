package subscriber;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloMessageObserver implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hello");
		e.getActionCommand();

	}

}
