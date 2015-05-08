import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Marble
{
	public Marble()
	{
		
	}
	
	public JLabel makeMarble()
	{
		
		
		ImageIcon marbleIcon = new ImageIcon("Images/Marble.png");
		
		JLabel marbleLabel = new JLabel(marbleIcon);
		
		return marbleLabel;
		
	}
}
