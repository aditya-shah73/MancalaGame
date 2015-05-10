import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Settings 
{
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
	private final int FRAME_WIDTH = 400;
	private final int FRAME_HEIGHT = 150;
	private int numberOfMarbles;
	private String input;
	private GameEngine g;

	public Settings(GameEngine ge) 
	{
		g = ge;
		frame = new JFrame();
		box = new JPanel();
		box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
		option1 = new JPanel(new FlowLayout());
		option2 = new JPanel(new FlowLayout());
		option3 = new JPanel(new FlowLayout());
		b1 = new JComboBox(numberOfMarbles());
		b2 = new JComboBox(themeChoice());
		a1 = new JTextArea("Choose the number of marbles:");
		a2 = new JTextArea("Choose the theme:");
		button = new JButton("Confirm");
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setBackground(Color.LIGHT_GRAY);
		numberOfMarbles = 0;
		input = "";
		drawFrame();
	}

	public void drawFrame() 
	{
		b1.setPreferredSize(new Dimension(75, 25));
		b2.setPreferredSize(new Dimension(110, 25));
		a1.setFont(new Font("Lucida Blackletter", Font.BOLD, 16));
		a2.setFont(new Font("Lucida Blackletter", Font.BOLD, 16));
		b1.setFont(new Font("Lucida Blackletter", Font.BOLD, 16));
		b2.setFont(new Font("Lucida Blackletter", Font.BOLD, 16));
		button.setFont(new Font("Lucida Blackletter", Font.BOLD, 16));
		a1.setOpaque(false);
		a2.setOpaque(false);
		option1.add(a1);
		option1.add(b1);
		option2.add(a2);
		option2.add(b2);
		option3.add(button, BorderLayout.CENTER);
		box.add(option1);
		box.add(option2);
		box.add(option3);
		frame.add(box);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		b1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				numberOfMarbles = (int) b1.getSelectedItem();
				g.setMarbles(numberOfMarbles);
			}
		});

		b2.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				input = (String) b2.getSelectedItem();
				g.setBoard(input);
				System.out.println(input);
				g.update(null);
			}
		});
		
		button.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
			}
		});
	}

	public Integer[] numberOfMarbles() 
	{
		Integer[] marble = {3 , 4};
		return marble;
	}

	public String[] themeChoice() 
	{
		String[] t = {"Ceramic" ,"Wood"};
		return t;
	}
}