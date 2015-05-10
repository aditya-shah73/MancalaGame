import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * The view and the controller for the game.
 * It draws the game board.
 * @author DreamTeam
 *
 */
public class GameFrame extends JFrame implements ChangeListener
{
	private GameEngine g;
	private Board1 panel1;
	private Board2 panel2;
	private JPanel topPanel;
	private JPanel textPanel1;
	private JPanel buttonPanel1;
	private JTextArea player1Area;
	private JButton undo1;
	private JButton confirm1;
	private JPanel bottomPanel;
	private JPanel textPanel2;
	private JPanel buttonPanel2;
	private JTextArea player2Area;
	private JButton undo2;
	private JButton confirm2;

	/**
	 * Default constructor that initializes all the components
	 * @param ge The instance of Game Engine
	 */
	public GameFrame (GameEngine ge)
	{
		g = ge;

		panel1 = new Board1(g);
		panel1.prepare();
		panel1.addListeners();

		panel2 = new Board2(g);
		panel2.prepare();
		panel2.addListeners();

		this.setLayout(new BorderLayout());
		this.setTitle("Mancala Game");

		topPanel = new JPanel();
		textPanel1 = new JPanel();
		buttonPanel1 = new JPanel();
		player1Area = new JTextArea("PLAYER 1");
		confirm1 = new JButton("CONFIRM");
		undo1 = new JButton();

		bottomPanel = new JPanel();
		textPanel2 = new JPanel();
		buttonPanel2 = new JPanel();
		player2Area = new JTextArea("PLAYER 2");
		confirm2 = new JButton("CONFIRM");
		undo2 = new JButton("UNDO");

		g.attach(this);
		drawFrame();
	}

	/**
	 * Draws all the components on the frame
	 */
	public void drawFrame()
	{	
		undo1.setText("UNDO - " + g.undoCount);
		topPanel.setLayout(new BorderLayout());
		textPanel1.setBackground(Color.WHITE);
		topPanel.add(textPanel1, BorderLayout.NORTH);
		buttonPanel1.setBackground(Color.WHITE);
		topPanel.add(buttonPanel1, BorderLayout.SOUTH);
		player1Area.setEditable(false); 
		player1Area.setFont(new Font("Lucida Blackletter", Font.BOLD, 30));
		textPanel1.add(player1Area, BorderLayout.CENTER);	
		buttonPanel1.add(undo1, BorderLayout.EAST);
		buttonPanel1.add(confirm1, BorderLayout.WEST);
		player1Area.setBackground(Color.GRAY);
		bottomPanel.setLayout(new BorderLayout());
		textPanel2.setBackground(Color.WHITE);
		bottomPanel.add(textPanel2, BorderLayout.SOUTH);
		buttonPanel2.setBackground(Color.WHITE);
		bottomPanel.add(buttonPanel2, BorderLayout.NORTH);
		player2Area.setEditable(false); 
		player2Area.setFont(new Font("Lucida Blackletter", Font.BOLD, 30));
		textPanel2.add(player2Area, BorderLayout.CENTER);

		buttonPanel2.add(undo2, BorderLayout.EAST);
		buttonPanel2.add(confirm2, BorderLayout.WEST);
		add(topPanel, BorderLayout.NORTH);
		add(bottomPanel, BorderLayout.SOUTH);

		if(g.boardValue == 1)
		{
			add(panel1, BorderLayout.CENTER);
		}
		else if(g.boardValue == 2)
		{
			add(panel2, BorderLayout.CENTER);
		}

		confirm1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent a) 
			{	
				g.player1Turn = false;
				g.moveDone = false;
				g.undoCount = 3;
				undo2.setText("UNDO - " + g.undoCount);
				player1Area.setBackground(Color.WHITE);
				player2Area.setBackground(Color.GRAY);
				undo1.setText("UNDO");
				repaint();
			}

		});

		undo1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				g.undo();
				undo1.setText("UNDO - " + g.undoCount);
			}
		});

		confirm2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent a) 
			{
				g.player1Turn = true;
				g.undoCount = 3;
				g.moveDone = false;
				undo1.setText("UNDO - " + g.undoCount);
				player2Area.setBackground(Color.WHITE);
				player1Area.setBackground(Color.GRAY);
				undo2.setText("UNDO");
				repaint();
			}
		});

		undo2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				g.undo();
				undo2.setText("UNDO - " + g.undoCount);
			}

		});
		redistribute();
	}

	/**
	 * Redistributes the marbles on the panel and redraws the frame after a move
	 */
	public void redistribute()
	{
		int count = 0;
		g.current = g.first;
		for(int i = 0; i < g.BOARD_SIZE; i++)
		{
			count = g.current.count;
			g.nextPit();
			for(int j = 0; j < count; j++)
			{
				if(g.boardValue == 1)
				{
					if(panel1.pitList.get(i) != null)
					{
						panel1.addMarbleToBoard(panel1.pitList.get(i));
						repaint();
					}
				}
				else if(g.boardValue == 2)
				{
					if(panel2.pitList.get(i) != null)
					{
						panel2.addMarbleToBoard(panel2.pitList.get(i));
						repaint();
					}
				}
			}
		}
	}

	/**
	 * Repaints the frame to remove all marbles
	 */
	public void removeMarbles()
	{
		repaint();
	}

	@Override
	public void stateChanged(ChangeEvent e) 
	{
		if(g.boardValue == 1)
		{
			for(JPanel j : panel1.pitList)
			{
				if(j != null)
				{
					j.removeAll();
				}
			}
			redistribute();
			validate();
			remove(panel1);
			validate();
			add(panel1);
			repaint();
		}	
		else if(g.boardValue == 2)
		{
			for(JPanel j : panel2.pitList)
			{
				if(j != null)
				{
					j.removeAll();
				}
			}
			redistribute();
			validate();
			remove(panel2);
			validate();
			add(panel2);
			repaint();
		}	
	}
}