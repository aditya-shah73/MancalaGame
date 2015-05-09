import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class GameFrame extends JFrame implements ChangeListener
{
	private GameEngine e;
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
	
	public GameFrame (GameEngine ge)
	{
		e = ge;
		panel1 = new Board1(e);
		panel1.prepare();
		panel1.addListeners();
		//panel1.addMarbleToBoard(panel1.pit6);
//		for (int i = 0; i < e.current.count; i++)
//			panel1.addMarbleToBoard(panel1.pitList.get(0));
//		while(e.hasNextPit()){
//			
//		}
		
		//panel2 = new Board2();
		this.setLayout(new BorderLayout());
		this.setTitle("Mancala Game");
		
		topPanel = new JPanel();
		textPanel1 = new JPanel();
		buttonPanel1 = new JPanel();
		player1Area = new JTextArea("PLAYER 1");
		confirm1 = new JButton("CONFIRM");
		undo1 = new JButton("UNDO");

		bottomPanel = new JPanel();
		textPanel2 = new JPanel();
		buttonPanel2 = new JPanel();
		player2Area = new JTextArea("PLAYER 2");
		confirm2 = new JButton("CONFIRM");
		undo2 = new JButton("UNDO");
		
		e.attach(this);
		drawFrame();
	}
	
	public void drawFrame()
	{
		topPanel.setLayout(new BorderLayout());
		textPanel1.setBackground(Color.WHITE);
		topPanel.add(textPanel1, BorderLayout.NORTH);
		buttonPanel1.setBackground(Color.WHITE);
		topPanel.add(buttonPanel1, BorderLayout.SOUTH);
		player1Area.setEditable(false); 
		player1Area.setOpaque(false);
		player1Area.setFont(new Font("Lucida Blackletter", Font.BOLD, 30));
		textPanel1.add(player1Area, BorderLayout.CENTER);	
		buttonPanel1.add(undo1, BorderLayout.EAST);
		buttonPanel1.add(confirm1, BorderLayout.WEST);
		
		bottomPanel.setLayout(new BorderLayout());
		textPanel2.setBackground(Color.WHITE);
		bottomPanel.add(textPanel2, BorderLayout.SOUTH);
		buttonPanel2.setBackground(Color.WHITE);
		bottomPanel.add(buttonPanel2, BorderLayout.NORTH);
		player2Area.setEditable(false); 
		player2Area.setOpaque(false);
		player2Area.setFont(new Font("Lucida Blackletter", Font.BOLD, 30));
		textPanel2.add(player2Area, BorderLayout.CENTER);
		buttonPanel2.add(undo2, BorderLayout.EAST);
		buttonPanel2.add(confirm2, BorderLayout.WEST);		
		add(topPanel, BorderLayout.NORTH);
		add(bottomPanel, BorderLayout.SOUTH);
		add(panel1, BorderLayout.CENTER);
		
		distribute();
	}
	
	public void distribute(){
		int count = 0;
		for(int i = 0; i < e.BOARD_SIZE; i++){
			count = e.current.count;
			for(int j = 0; j < count; j++){
				if(panel1.pitList.get(i) != null)
				panel1.addMarbleToBoard(panel1.pitList.get(i));
			}
		}
	}
	
	@Override
	public void stateChanged(ChangeEvent e) 
	{
		
	}
}