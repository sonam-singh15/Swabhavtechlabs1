package subscriber;

import javax.swing.JButton;

import publisher.WelcomeFrame;

public class WelcomeFrametest {

	public static void main(String[] args) {
		WelcomeFrame frame = new WelcomeFrame();
		frame.getHello().addActionListener(new HelloMessageObserver());
		frame.getHello().addActionListener(new SayGoodByeMessageObserver());

	}
}
