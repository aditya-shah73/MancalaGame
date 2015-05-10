import javax.swing.*;

/**
 * Creates a marble Icon for the game.
 * @author DreamTeam
 */
public class Marble
{
	public ImageIcon marbleIcon;
	
	/**
	 * Creates an image icon of marble image, adds it in JLabel.
	 * @return JLabel with marble image icon in it.
	 */
	public JLabel makeMarble()
	{
		marbleIcon = new ImageIcon("Images/Marble.png");	
		JLabel marbleLabel = new JLabel(marbleIcon);
		return marbleLabel;
	}
}
