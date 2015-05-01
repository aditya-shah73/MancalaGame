import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Settings 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		JPanel box = new JPanel();
		JPanel option1 = new JPanel(new FlowLayout());
		JPanel option2 = new JPanel(new FlowLayout());
		 final int FRAME_WIDTH = 500;
		final int FRAME_HEIGHT = 500;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
		JComboBox b1= new JComboBox(numberOfMarbles());
		JComboBox b2= new JComboBox(theme());
		JTextArea a1 = new JTextArea("Choose the number of marbles");
		JTextArea a2 = new JTextArea("Choose the theme");
		JButton button = new JButton("Confirm");
		option1.add(a1);
		option1.add(b1);
		option2.add(a2);
		option2.add(b2);
		box.add(option1);
		box.add(option2);
		box.add(button);
		frame.add(box);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//remove later
		frame.pack();
		frame.setVisible(true);
	}
	
	public static Integer[] numberOfMarbles()
	{
		Integer[] marble = {3,4};
		return marble;
	}
	
	public static String[] theme()
	{
		String[] t = {"Metal","Wood"};
		return t;
	}
}
