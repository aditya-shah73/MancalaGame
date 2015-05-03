import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class Board2 {

	public Board2() {

	}

	public Board2 prepare() {
		// --------------------------------------------------------------------------------------------------------------------------------

		JPanel boardPanel = new JPanel();
		boardPanel.setPreferredSize(new Dimension(1000, 225));

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image storeImageLeft = requestImage("MarbleStoreLeft.png");
		JPanel storePanelLeft = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(storeImageLeft
						.getScaledInstance(125, 225, 0), 0,
						0, null); // -------------------> LEFT STORE IMAGE SIZE
									// AND LOCATION

			}
		};
		storePanelLeft.setPreferredSize(new Dimension(125, 225));
		boardPanel.add(storePanelLeft);

		// --------------------------------------------------------------------------------------------------------------------------------

		final JPanel pitPanel = new JPanel();
		pitPanel.setBackground(Color.WHITE);
		pitPanel.setPreferredSize(new Dimension(650, 225));
		boardPanel.add(pitPanel, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit1Image = requestImage("MarblePit1.png");
		JPanel pit1 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit1Image.getScaledInstance(
						pitPanel.getWidth() / 6, pitPanel.getHeight() / 2, 0),
						0, 0, null); 
			}
		};
		pit1.setPreferredSize(new Dimension(pitPanel.getWidth() / 6, pitPanel
				.getHeight() / 2));
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit2Image = requestImage("MarblePit2.png");
		JPanel pit2 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit2Image.getScaledInstance(
						pitPanel.getWidth() / 6, pitPanel.getHeight() / 2, 0),
						0, 0, null); 
			}
		};
		pit2.setPreferredSize(new Dimension(pitPanel.getWidth() / 6, pitPanel
				.getHeight() / 2));
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit3Image = requestImage("MarblePit3.png");
		JPanel pit3 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit3Image.getScaledInstance(
						pitPanel.getWidth() / 6, pitPanel.getHeight() / 2, 0),
						0, 0, null); 
			}
		};
		pit3.setPreferredSize(new Dimension(pitPanel.getWidth() / 6, pitPanel
				.getHeight() / 2));

		//--------------------------------------------------------------------------------------------------------------------------------
		
		final Image pit4Image = requestImage("MarblePit4.png");
		JPanel pit4 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit4Image.getScaledInstance(
						pitPanel.getWidth() / 6, pitPanel.getHeight() / 2, 0),
						0, 0, null); 
			}
		};
		pit4.setPreferredSize(new Dimension(pitPanel.getWidth() / 6, pitPanel
				.getHeight() / 2));
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit5Image = requestImage("MarblePit5.png");
		JPanel pit5 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit5Image.getScaledInstance(
						pitPanel.getWidth() / 6, pitPanel.getHeight() / 2, 0),
						0, 0, null); 
			}
		};
		pit5.setPreferredSize(new Dimension(pitPanel.getWidth() / 6, pitPanel
				.getHeight() / 2));
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit6Image = requestImage("MarblePit6.png");
		JPanel pit6 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit6Image.getScaledInstance(
						pitPanel.getWidth() / 6, pitPanel.getHeight() / 2, 0),
						0, 0, null); 
			}
		};
		pit6.setPreferredSize(new Dimension(pitPanel.getWidth() / 6, pitPanel
				.getHeight() / 2));
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit7Image = requestImage("MarblePit7.png");
		JPanel pit7 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit7Image.getScaledInstance(
						pitPanel.getWidth() / 6, pitPanel.getHeight() / 2, 0),
						0, 0, null); 
			}
		};
		pit7.setPreferredSize(new Dimension(pitPanel.getWidth() / 6, pitPanel
				.getHeight() / 2));
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit8Image = requestImage("MarblePit8.png");
		JPanel pit8 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit8Image.getScaledInstance(
						pitPanel.getWidth() / 6, pitPanel.getHeight() / 2, 0),
						0, 0, null); 
			}
		};
		pit8.setPreferredSize(new Dimension(pitPanel.getWidth() / 6, pitPanel
				.getHeight() / 2));
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit9Image = requestImage("MarblePit9.png");
		JPanel pit9 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit9Image.getScaledInstance(
						pitPanel.getWidth() / 6, pitPanel.getHeight() / 2, 0),
						0, 0, null); 
			}
		};
		pit9.setPreferredSize(new Dimension(pitPanel.getWidth() / 6, pitPanel
				.getHeight() / 2));
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit10Image = requestImage("MarblePit10.png");
		JPanel pit10 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit10Image.getScaledInstance(
						pitPanel.getWidth() / 6, pitPanel.getHeight() / 2, 0),
						0, 0, null); 
			}
		};
		pit10.setPreferredSize(new Dimension(pitPanel.getWidth() / 6, pitPanel
				.getHeight() / 2));
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit11Image = requestImage("MarblePit11.png");
		JPanel pit11 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit11Image.getScaledInstance(
						pitPanel.getWidth() / 6, pitPanel.getHeight() / 2, 0),
						0, 0, null); 
			}
		};
		pit11.setPreferredSize(new Dimension(pitPanel.getWidth() / 6, pitPanel
				.getHeight() / 2));
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit12Image = requestImage("MarblePit12.png");
		JPanel pit12 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit12Image.getScaledInstance(
						pitPanel.getWidth() / 6, pitPanel.getHeight() / 2, 0),
						0, 0, null); 
			}
		};
		pit12.setPreferredSize(new Dimension(pitPanel.getWidth() / 6, pitPanel
				.getHeight() / 2));
		
		//--------------------------------------------------------------------------------------------------------------------------------

		pitPanel.setLayout(new GridLayout(2, 6));
		pitPanel.add(pit1);
		pitPanel.add(pit2);
		pitPanel.add(pit3);
		pitPanel.add(pit4);
		pitPanel.add(pit5);
		pitPanel.add(pit6);
		pitPanel.add(pit7);
		pitPanel.add(pit8);
		pitPanel.add(pit9);
		pitPanel.add(pit10);
		pitPanel.add(pit11);
		pitPanel.add(pit12);
		
		//--------------------------------------------------------------------------------------------------------------------------------
		
		Image storeImageRight = requestImage("MarbleStoreRight.png");
		JPanel storePanelRight = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(storeImageLeft.getScaledInstance(125, 225, 0), 0,
						0, null); // -------------------> RIGHT STORE IMAGE SIZE AND LOCATION

			}
		};
		
		storePanelRight.setPreferredSize(new Dimension(125, 225));
		boardPanel.add(storePanelRight, BorderLayout.WEST);
		
		//--------------------------------------------------------------------------------------------------------------------------------

		JFrame frame = new JFrame("Let the Mancala Begin!");
		frame.setSize(1000, 500);// ------------------------------------------------------------------------> FRAME SIZE
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(boardPanel, BorderLayout.NORTH);
		storePanelLeft
				.setBounds(boardPanel.getX(), boardPanel.getY(), 125, 225);

		frame.setVisible(true);
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

	public void makeBoard() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Board2().prepare();

			}
		});
	}
}
