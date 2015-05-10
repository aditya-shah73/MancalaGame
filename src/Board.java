import java.awt.Image;

import javax.swing.JPanel;

/**
 * Creates a template for different kind of themes for board.
 * @author dreamTeam.
 *
 */
public interface Board 
{
	public Board prepare();
	public Image requestImage(String imageName);
	public void addMarbleToBoard(JPanel panel);
	public void addListeners();
}