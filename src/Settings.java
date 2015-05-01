import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Settings {
	JFrame frame = new JFrame();
	JPanel box = new JPanel();
	JPanel option1 = new JPanel(new FlowLayout());
	JPanel option2 = new JPanel(new FlowLayout());
	private final int FRAME_WIDTH = 500;
	private final int FRAME_HEIGHT = 500;

	public void drawFrame() {
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
	}
}
