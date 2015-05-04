import java.awt.Image;
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
}