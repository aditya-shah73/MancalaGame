import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import java.awt.Font;

public class Board2 implements Board{

	public Board2() {

	}

	public Board2 prepare() {
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		//------------------------------------------------------
		JPanel textPanel1 = new JPanel();
		textPanel1.setBackground(Color.WHITE);
		topPanel.add(textPanel1, BorderLayout.NORTH);
		//------------------------------------------------------
		JPanel buttonPanel1 = new JPanel();
		buttonPanel1.setBackground(Color.WHITE);
		topPanel.add(buttonPanel1, BorderLayout.SOUTH);
		//------------------------------------------------------
		JTextArea player1Area = new JTextArea("PLAYER 1");
		player1Area.setEditable(false); 
		player1Area.setOpaque(false);
		player1Area.setFont(new Font("Lucida Blackletter", Font.BOLD, 30));
		textPanel1.add(player1Area, BorderLayout.CENTER);
		//------------------------------------------------------		
		JButton undo1 = new JButton("UNDO");
		buttonPanel1.add(undo1, BorderLayout.EAST);
		//------------------------------------------------------
		JButton confirm1 = new JButton("CONFIRM");
		buttonPanel1.add(confirm1, BorderLayout.WEST);
				
		// --------------------------------------------------------------------------------------------------------------------------------
		
		JPanel bottomPanel = new JPanel();	
		bottomPanel.setLayout(new BorderLayout());
		//------------------------------------------------------
		JPanel textPanel2 = new JPanel();
		textPanel2.setBackground(Color.WHITE);
		bottomPanel.add(textPanel2, BorderLayout.SOUTH);
		//------------------------------------------------------
		JPanel buttonPanel2 = new JPanel();
		buttonPanel2.setBackground(Color.WHITE);
		bottomPanel.add(buttonPanel2, BorderLayout.NORTH);
		//------------------------------------------------------
		JTextArea player2Area = new JTextArea("PLAYER 2");
		player2Area.setEditable(false); 
		player2Area.setOpaque(false);
		player2Area.setFont(new Font("Lucida Blackletter", Font.BOLD, 30));
		textPanel2.add(player2Area, BorderLayout.CENTER);
		//------------------------------------------------------		
		JButton undo2 = new JButton("UNDO");
		buttonPanel2.add(undo2, BorderLayout.EAST);
		//------------------------------------------------------
		JButton confirm2 = new JButton("CONFIRM");
		buttonPanel2.add(confirm2, BorderLayout.WEST);
				
		// --------------------------------------------------------------------------------------------------------------------------------	
	
				JPanel boardPanel = new JPanel();
				boardPanel.setPreferredSize(new Dimension(1000, 224));
				boardPanel.setLayout(new BorderLayout());

		// --------------------------------------------------------------------------------------------------------------------------------


		final Image storeImageLeft = requestImage("MarbleStoreLeft.png");
		JPanel storePanelLeft = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(storeImageLeft.getScaledInstance(125, 224, 0), 0,
						0, null); // -------------------> LEFT STORE IMAGE SIZE
									// AND LOCATION

			}
		};
		storePanelLeft.setPreferredSize(new Dimension(125, 224));
		boardPanel.add(storePanelLeft, BorderLayout.WEST);
		
		//--------------------------------------------------------------------------------------------------------------------------------
		
		final Image storeImageRight = requestImage("MarbleStoreRight.png");
		JPanel storePanelRight = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(storeImageRight.getScaledInstance(125, 224, 0), 0,
						0, null); // -------------------> RIGHT STORE IMAGE SIZE AND LOCATION

			}
		};
		
		storePanelRight.setPreferredSize(new Dimension(125, 224));
		boardPanel.add(storePanelRight, BorderLayout.EAST);

		// --------------------------------------------------------------------------------------------------------------------------------

		final JPanel pitPanel = new JPanel();
		pitPanel.setBackground(Color.WHITE);
		pitPanel.setPreferredSize(new Dimension(650, 224));
		boardPanel.add(pitPanel, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------
		
		final Image pit1Image = requestImage("MarblePit1.png");
		JPanel pit1 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit1Image.getScaledInstance(
						pitPanel
						.getWidth() / 6, 112, 0),
						0, 0, null); 
			}
		};
		//----------------------------------------------------
		pit1.setLayout(new BorderLayout());
		JPanel counterPanel1 = new JPanel();
		counterPanel1.setOpaque(false);
		pit1.add(counterPanel1, BorderLayout.NORTH);
		counterPanel1.setLayout(new BorderLayout());
		JTextArea counterArea1 = new JTextArea("4");
		counterArea1.setOpaque(false);
		counterPanel1.add(counterArea1, BorderLayout.EAST);
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit2Image = requestImage("MarblePit2.png");
		JPanel pit2 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit2Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0),
						0, 0, null); 
			}
		};
		//----------------------------------------------------
				pit2.setLayout(new BorderLayout());
				JPanel counterPanel2 = new JPanel();
				counterPanel2.setOpaque(false);
				pit2.add(counterPanel2, BorderLayout.NORTH);
				counterPanel2.setLayout(new BorderLayout());
				JTextArea counterArea2 = new JTextArea("4");
				counterArea2.setOpaque(false);
				counterPanel2.add(counterArea2, BorderLayout.EAST);
	
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit3Image = requestImage("MarblePit3.png");
		JPanel pit3 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit3Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0),
						0, 0, null); 
			}
		};
		//----------------------------------------------------
		pit3.setLayout(new BorderLayout());
		JPanel counterPanel3 = new JPanel();
		counterPanel3.setOpaque(false);
		pit3.add(counterPanel3, BorderLayout.NORTH);
		counterPanel3.setLayout(new BorderLayout());
		JTextArea counterArea3 = new JTextArea("4");
		counterArea3.setOpaque(false);
		counterPanel3.add(counterArea3, BorderLayout.EAST);


		//--------------------------------------------------------------------------------------------------------------------------------
		
		final Image pit4Image = requestImage("MarblePit4.png");
		JPanel pit4 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit4Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0),
						0, 0, null); 
			}
		};
		//----------------------------------------------------
				pit4.setLayout(new BorderLayout());
				JPanel counterPanel4 = new JPanel();
				counterPanel4.setOpaque(false);
				pit4.add(counterPanel4, BorderLayout.NORTH);
				counterPanel4.setLayout(new BorderLayout());
				JTextArea counterArea4 = new JTextArea("4");
				counterArea4.setOpaque(false);
				counterPanel4.add(counterArea4, BorderLayout.EAST);
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit5Image = requestImage("MarblePit5.png");
		JPanel pit5 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit5Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0),
						0, 0, null); 
			}
		};
		//----------------------------------------------------
				pit5.setLayout(new BorderLayout());
				JPanel counterPanel5 = new JPanel();
				counterPanel5.setOpaque(false);
				pit5.add(counterPanel5, BorderLayout.NORTH);
				counterPanel5.setLayout(new BorderLayout());
				JTextArea counterArea5 = new JTextArea("4");
				counterArea5.setOpaque(false);
				counterPanel5.add(counterArea5, BorderLayout.EAST);
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit6Image = requestImage("MarblePit6.png");
		JPanel pit6 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit6Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0),
						0, 0, null); 
			}
		};
		//----------------------------------------------------
				pit6.setLayout(new BorderLayout());
				JPanel counterPanel6 = new JPanel();
				counterPanel6.setOpaque(false);
				pit6.add(counterPanel6, BorderLayout.NORTH);
				counterPanel6.setLayout(new BorderLayout());
				JTextArea counterArea6 = new JTextArea("4");
				counterArea6.setOpaque(false);
				counterPanel6.add(counterArea6, BorderLayout.EAST);
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit7Image = requestImage("MarblePit7.png");
		JPanel pit7 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit7Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0),
						0, 0, null); 
			}
		};
		//----------------------------------------------------
				pit7.setLayout(new BorderLayout());
				JPanel counterPanel7 = new JPanel();
				counterPanel7.setOpaque(false);
				pit7.add(counterPanel7, BorderLayout.NORTH);
				counterPanel7.setLayout(new BorderLayout());
				JTextArea counterArea7 = new JTextArea("4");
				counterArea7.setOpaque(false);
				counterPanel7.add(counterArea7, BorderLayout.EAST);
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit8Image = requestImage("MarblePit8.png");
		JPanel pit8 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit8Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0),
						0, 0, null); 
			}
		};
		//----------------------------------------------------
				pit8.setLayout(new BorderLayout());
				JPanel counterPanel8 = new JPanel();
				counterPanel8.setOpaque(false);
				pit8.add(counterPanel8, BorderLayout.NORTH);
				counterPanel8.setLayout(new BorderLayout());
				JTextArea counterArea8 = new JTextArea("4");
				counterArea8.setOpaque(false);
				counterPanel8.add(counterArea8, BorderLayout.EAST);
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit9Image = requestImage("MarblePit9.png");
		JPanel pit9 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit9Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0),
						0, 0, null); 
			}
		};
		//----------------------------------------------------
				pit9.setLayout(new BorderLayout());
				JPanel counterPanel9 = new JPanel();
				counterPanel9.setOpaque(false);
				pit9.add(counterPanel9, BorderLayout.NORTH);
				counterPanel9.setLayout(new BorderLayout());
				JTextArea counterArea9 = new JTextArea("4");
				counterArea9.setOpaque(false);
				counterPanel9.add(counterArea9, BorderLayout.EAST);
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit10Image = requestImage("MarblePit10.png");
		JPanel pit10 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit10Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0),
						0, 0, null); 
			}
		};
		//----------------------------------------------------
				pit10.setLayout(new BorderLayout());
				JPanel counterPanel10 = new JPanel();
				counterPanel10.setOpaque(false);
				pit10.add(counterPanel10, BorderLayout.NORTH);
				counterPanel10.setLayout(new BorderLayout());
				JTextArea counterArea10 = new JTextArea("4");
				counterArea10.setOpaque(false);
				counterPanel10.add(counterArea10, BorderLayout.EAST);
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit11Image = requestImage("MarblePit11.png");
		JPanel pit11 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit11Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0),
						0, 0, null); 
			}
		};
		//----------------------------------------------------
				pit11.setLayout(new BorderLayout());
				JPanel counterPanel11 = new JPanel();
				counterPanel11.setOpaque(false);
				pit11.add(counterPanel11, BorderLayout.NORTH);
				counterPanel11.setLayout(new BorderLayout());
				JTextArea counterArea11 = new JTextArea("4");
				counterArea11.setOpaque(false);
				counterPanel11.add(counterArea11, BorderLayout.EAST);
		
		//--------------------------------------------------------------------------------------------------------------------------------

		final Image pit12Image = requestImage("MarblePit12.png");
		JPanel pit12 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit12Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0),
						0, 0, null); 
			}
		};
		//----------------------------------------------------
		pit12.setLayout(new BorderLayout());
		JPanel counterPanel12 = new JPanel();
		counterPanel12.setOpaque(false);
		pit12.add(counterPanel12, BorderLayout.NORTH);
		counterPanel12.setLayout(new BorderLayout());
		JTextArea counterArea12 = new JTextArea("4");
		counterArea12.setOpaque(false);
		counterPanel12.add(counterArea12, BorderLayout.EAST);
		
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

		JFrame frame = new JFrame("Let the Mancala Begin!");
		frame.setSize(1000, 500);// ------------------------------------------------------------------------> FRAME SIZE
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(boardPanel, BorderLayout.CENTER);
		frame.add(topPanel, BorderLayout.NORTH);
		frame.add(bottomPanel, BorderLayout.SOUTH);
		frame.setBackground(Color.WHITE);
        frame.pack();
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
