import javax.swing.*;

/**
 * Contains main method, initiates the program.
 * @author dreamTeam
 *
 */
public class MancalaTester 
{
	public static void main(String[] args) 
	{
		GameEngine ge = new GameEngine();
		Settings s = new Settings(ge);
		JFrame frame = new GameFrame(ge);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.validate();
	}
}
