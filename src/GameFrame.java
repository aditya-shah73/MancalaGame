import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class GameFrame extends JFrame implements ChangeListener
{

	GameEngine e;
	JPanel panel1 = new Board1();
	JPanel panel2 = new Board2();
	
	public GameFrame (GameEngine ge){
		this.setLayout(new BorderLayout());
		this.setTitle("Mancala Game");
		e = ge;
		e.attach(this);
	}
	
	public void drawFrame(){
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		//------------------------------------------------------
		JPanel textPanel1 = new JPanel();
		textPanel1.setBackground(Color.WHITE);
		topPanel.add(textPanel1, BorderLayout.NORTH);
		//------------------------------------------------------
		JPanel buttonPanel1 = new JPanel();
		buttonPanel1.setBackground(Color.WHITE);
		topPanel.add(buttonPanel1, BorderLayout.SOUTH);
		//------------------------------------------------------
		JTextArea player1Area = new JTextArea("PLAYER 1");
		player1Area.setEditable(false); 
		player1Area.setOpaque(false);
		player1Area.setFont(new Font("Lucida Blackletter", Font.BOLD, 30));
		textPanel1.add(player1Area, BorderLayout.CENTER);
		//------------------------------------------------------		
		JButton undo1 = new JButton("UNDO");
		buttonPanel1.add(undo1, BorderLayout.EAST);
		//------------------------------------------------------
		JButton confirm1 = new JButton("CONFIRM");
		buttonPanel1.add(confirm1, BorderLayout.WEST);
		
		// --------------------------------------------------------------------------------------------------------------------------------

		JPanel bottomPanel = new JPanel();	
		bottomPanel.setLayout(new BorderLayout());
		//------------------------------------------------------
		JPanel textPanel2 = new JPanel();
		textPanel2.setBackground(Color.WHITE);
		bottomPanel.add(textPanel2, BorderLayout.SOUTH);
		//------------------------------------------------------
		JPanel buttonPanel2 = new JPanel();
		buttonPanel2.setBackground(Color.WHITE);
		bottomPanel.add(buttonPanel2, BorderLayout.NORTH);
		//------------------------------------------------------
		JTextArea player2Area = new JTextArea("PLAYER 2");
		player2Area.setEditable(false); 
		player2Area.setOpaque(false);
		player2Area.setFont(new Font("Lucida Blackletter", Font.BOLD, 30));
		textPanel2.add(player2Area, BorderLayout.CENTER);
		//------------------------------------------------------		
		JButton undo2 = new JButton("UNDO");
		buttonPanel2.add(undo2, BorderLayout.EAST);
		//------------------------------------------------------
		JButton confirm2 = new JButton("CONFIRM");
		buttonPanel2.add(confirm2, BorderLayout.WEST);
		
		add(topPanel, BorderLayout.NORTH);
		add(bottomPanel, BorderLayout.SOUTH);
		add(panel1, BorderLayout.CENTER);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
	}
}
