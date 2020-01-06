package subscriber;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SayGoodByeMessageObserver implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Bye");
		e.getActionCommand();
	}

}
