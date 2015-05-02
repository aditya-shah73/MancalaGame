import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;


public class Board1 implements Board
{
	public Board1()
	{
		//Board1 woodBoard = new Board1();
	}
	public Board1 prepare() 
	{
		final Image image = requestImage("WoodBoard.PNG");
    	JPanel WoodBoardPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image.getScaledInstance(1000, 250, 0), 0, 0, null);
            }
        };
        WoodBoardPanel.setPreferredSize(new Dimension(1000, 500));  
        
     // everything frame.
  	  JFrame frame = new JFrame("Let the Mancala Begin!");
        frame.isResizable();
        frame.setSize(1000, 750);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().add(WoodBoardPanel);

      return this;
	}
	 public Image requestImage(String imageName) {
	        Image image = null;

	        try {
	            image = ImageIO.read(new File(imageName));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }  
	        return image;
	    }
	 public void makeBoard()
	 {
		 SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new Board1().prepare();
	            }
	        });
	 }

}
