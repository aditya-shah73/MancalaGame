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
		
		JOptionPane
		.showMessageDialog(
				new JFrame(),
				"1. This is a 2 player game, each player has 6 pits and a store on the right called MANCALA. \n2. In the beginning of the game, player gets choose whether each pit should have 3 marbles or 4 marbles, and the skin for the board. options are wood and ceramic.\n3. Player 1 starts the game by clicking on a pit, it will redistribute marbles by picking up all the marbles from a pit and dropping one marble in each pit going counter clock wise. \n4. To make that redistribution permanent player needs to click on CONFIRM button.\n5. If redistribution is not as desired by the player, player can choose to click undo button. which will bring board to its previous state and give the player another chance to play.\n6. Each player has only three chances to click Undo button.\n7. If the last marble falls in the MANCALA, player gets to repeat its turn. if the player puts a marble in MANCALA, and it still has a marble, marbles will begin redistributing in another player’s pit.\n8. Player can’t put marble in opponent’s MANCALA. \n9. If last marble falls in player’s own empty pit, then that marble and marbles from the opponent’s opposite pit will be collected in player’s MANCALA.10. The game ends when all six pits of one player are empty. \n11. When the game ends player with the marbles left in its pits, all the marbles are collected and stored in player’s respective MANCALA.\n12. Number of Marbles are counted in each MANCALA, and player with more marbles in its respective MANCALA wins the game.\n");

		
		Object[] options = { "Wood", "Ceramic" };
		int n = JOptionPane.showOptionDialog(new JFrame(), "Pick a theme",
				"Options", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

		ge.boardValue = n + 1;

		Object[] options1 = { "3", "4" };
		int n1 = JOptionPane.showOptionDialog(new JFrame(),
				"Pick the number of marbles", "Options",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, options1, options1[1]);

		ge.setMarbles(n1 + 3);

		
		ge.boardValue = n + 1;
		// Settings s = new Settings(ge);
		JFrame frame = new GameFrame(ge);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.validate();
	}
}
