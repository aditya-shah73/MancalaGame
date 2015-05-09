import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Settings {
	private JFrame frame;
	private JPanel box;
	private JPanel option1;
	private JPanel option2;
	private JPanel option3;
	private JComboBox b1;
	private JComboBox b2;
	private JTextArea a1;
	private JTextArea a2;
	private JButton button;
	private final int FRAME_WIDTH = 200;
	private final int FRAME_HEIGHT = 200;
	int numberOfMarbles;
	String input;
	GameEngine g;

	public Settings(GameEngine ge) {
		g = ge;
		frame = new JFrame();
		box = new JPanel();
		box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
		option1 = new JPanel(new FlowLayout());
		option2 = new JPanel(new FlowLayout());
		option3 = new JPanel(new FlowLayout());
		b1 = new JComboBox(numberOfMarbles());
		b2 = new JComboBox(theme());
		a1 = new JTextArea("Choose the number of marbles:");
		a2 = new JTextArea("Choose the theme:");
		button = new JButton("Confirm");
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

		numberOfMarbles = 0;
		input = "";
		drawFrame();
	}

	public void drawFrame() {
		b1.setPreferredSize(new Dimension(75, 25));
		b2.setPreferredSize(new Dimension(100, 25));
		a1.setBackground(Color.LIGHT_GRAY);
		a2.setBackground(Color.yellow);
		a1.setFont(new Font("Helvetica", Font.BOLD, 18));
		a2.setFont(new Font("Helvetica", Font.BOLD, 18));
		button.setFont(new Font("Helvetica", Font.BOLD, 18));
		option1.add(a1);
		option1.add(b1);
		option2.add(a2);
		option2.add(b2);
		option3.add(button, BorderLayout.CENTER);
		box.add(option1);
		box.add(option2);
		box.add(option3);
		frame.add(box);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// remove later
		frame.pack();
		frame.setVisible(true);

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				numberOfMarbles = (int) b1.getSelectedItem();
				System.out.println(numberOfMarbles);
				g.setMarbles(numberOfMarbles);
			}

		});

		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				input = (String) b2.getSelectedItem();
				System.out.println(input);
				g.setBoard(input);
			}

		});
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
			}

		});
	}

	public Integer[] numberOfMarbles() {
		Integer[] marble = { 3, 4 };
		return marble;
	}

	public String[] theme() {
		String[] t = { "Ceramic", "Wood" };
		return t;
	}
}