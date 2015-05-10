import javax.swing.*;

/**
 * Contains main method, initiates the program.
 * 
 * @author dreamTeam
 *
 */
public class MancalaTester {
	public static void main(String[] args) {
		GameEngine ge = new GameEngine();
		Object[] options = { "Wood", "Ceramic"};
		int n = JOptionPane.showOptionDialog(new JFrame(),
				"Pick a theme",
				"Options", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		
		ge.boardValue = n+1;
		
		Object[] options1 = { "3", "4"};
		int n1 = JOptionPane.showOptionDialog(new JFrame(),
				"Pick the number of marbles",
				"Options", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options1, options1[1]);
		
		ge.setMarbles(n1 + 3);
		
		ge.boardValue = n+1;
		// Settings s = new Settings(ge);
		JFrame frame = new GameFrame(ge);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.validate();
	}
}
