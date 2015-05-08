import javax.swing.*;

public class Marble
{
	private ImageIcon marbleIcon;
	
	public JLabel makeMarble()
	{
		marbleIcon = new ImageIcon("Images/Marble.png");	
		JLabel marbleLabel = new JLabel(marbleIcon);
		return marbleLabel;
	}
}
