import java.awt.Image;

import javax.swing.JPanel;
/**
 * 
 * @author user
 *
 */
public interface Board 
{
	public Board prepare();
	public Image requestImage(String imageName);
	public void makeBoard();
	public void addMarbleToBoard(JPanel panel, int x, int y);
}