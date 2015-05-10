import java.awt.*;
import javax.swing.*;

/**
 * Creates a template for different kind of themes for board.
 * @author DreamTeam.
 */
public interface Board 
{
	public Board prepare();
	public Image requestImage(String imageName);
	public void addMarbleToBoard(JPanel panel);
	public void addListeners();
}