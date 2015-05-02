import java.awt.Image;

public interface Board {

	public Board prepare();

	public Image requestImage(String imageName);
	
	public void makeBoard();

}