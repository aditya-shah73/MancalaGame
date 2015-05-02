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


public class Board2 implements Board
{
	public Board2()
	{
		//Board2 marbleBoard = new Board2();
	}
	
	public Board2 prepare() 
	{
		final Image image = requestImage("MarbleBoard.PNG");
    	JPanel marbleBoardPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image.getScaledInstance(1000, 250, 0), 0, 0, null);
            }
        };
        marbleBoardPanel.setPreferredSize(new Dimension(1000, 500));  
        
     // everything frame.
  	  JFrame frame = new JFrame("Let the Mancala Begin!");
        frame.isResizable();
        frame.setSize(1000, 750);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().add(marbleBoardPanel);

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
	                new Board2().prepare();
	            }
	        });
	 }

}