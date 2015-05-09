import java.awt.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.ArrayList;

import javax.imageio.*;
import javax.swing.*;

public class Board2 extends JPanel implements Board {
	ArrayList<JPanel> pitList;
	JPanel pit1;
	JPanel pit2;
	JPanel pit3;
	JPanel pit4;
	JPanel pit5;
	JPanel pit6;
	JPanel pit7;
	JPanel pit8;
	JPanel pit9;
	JPanel pit10;
	JPanel pit11;
	JPanel pit12;
	GameEngine g;

	public Board2(GameEngine ge) {
		g = ge;
		pitList = new ArrayList<JPanel>();
	}

	public Board2 prepare() {

		JPanel boardPanel = new JPanel();
		boardPanel.setPreferredSize(new Dimension(1000, 224));
		boardPanel.setLayout(new BorderLayout());

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image storeImageLeft = requestImage("Images/CeramicStoreLeft.png");
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

		// ----------------------------------------------------
		storePanelLeft.setLayout(new BorderLayout());
		JPanel counterPanelLeft = new JPanel();
		counterPanelLeft.setOpaque(false);
		storePanelLeft.add(counterPanelLeft, BorderLayout.NORTH);
		counterPanelLeft.setLayout(new BorderLayout());
		JTextArea counterAreaLeft = new JTextArea("0");
		counterAreaLeft.setOpaque(false);
		counterPanelLeft.add(counterAreaLeft, BorderLayout.EAST);

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image storeImageRight = requestImage("Images/CeramicStoreRight.png");
		JPanel storePanelRight = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(storeImageRight.getScaledInstance(125, 224, 0), 0,
						0, null); // -------------------> RIGHT STORE IMAGE SIZE
									// AND LOCATION
			}
		};

		storePanelRight.setPreferredSize(new Dimension(125, 224));
		boardPanel.add(storePanelRight, BorderLayout.EAST);

		// ----------------------------------------------------
		storePanelRight.setLayout(new BorderLayout());
		JPanel counterPanelRight = new JPanel();
		counterPanelRight.setOpaque(false);
		storePanelRight.add(counterPanelRight, BorderLayout.NORTH);
		counterPanelRight.setLayout(new BorderLayout());
		JTextArea counterAreaRight = new JTextArea("0");
		counterAreaRight.setOpaque(false);
		counterPanelRight.add(counterAreaRight, BorderLayout.EAST);

		// --------------------------------------------------------------------------------------------------------------------------------

		final JPanel pitPanel = new JPanel();
		pitPanel.setBackground(Color.WHITE);
		pitPanel.setPreferredSize(new Dimension(650, 224));
		boardPanel.add(pitPanel, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit1Image = requestImage("Images/CeramicPit1-6.png");
		this.pit1 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit1Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		// ----------------------------------------------------
		pit1.setLayout(new BorderLayout());
		JPanel counterPanel1 = new JPanel();
		counterPanel1.setOpaque(false);
		pit1.add(counterPanel1, BorderLayout.NORTH);
		counterPanel1.setLayout(new BorderLayout());
		JTextArea counterArea1 = new JTextArea("4");
		counterArea1.setOpaque(false);
		counterPanel1.add(counterArea1, BorderLayout.EAST);

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit2Image = requestImage("Images/CeramicPit1-6.png");
		pit2 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit2Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		// ----------------------------------------------------
		pit2.setLayout(new BorderLayout());
		JPanel counterPanel2 = new JPanel();
		counterPanel2.setOpaque(false);
		pit2.add(counterPanel2, BorderLayout.NORTH);
		counterPanel2.setLayout(new BorderLayout());
		JTextArea counterArea2 = new JTextArea("4");
		counterArea2.setOpaque(false);
		counterPanel2.add(counterArea2, BorderLayout.EAST);

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit3Image = requestImage("Images/CeramicPit1-6.png");
		pit3 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit3Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		// ----------------------------------------------------
		pit3.setLayout(new BorderLayout());
		JPanel counterPanel3 = new JPanel();
		counterPanel3.setOpaque(false);
		pit3.add(counterPanel3, BorderLayout.NORTH);
		counterPanel3.setLayout(new BorderLayout());
		JTextArea counterArea3 = new JTextArea("4");
		counterArea3.setOpaque(false);
		counterPanel3.add(counterArea3, BorderLayout.EAST);

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit4Image = requestImage("Images/CeramicPit1-6.png");
		pit4 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit4Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		// ----------------------------------------------------
		pit4.setLayout(new BorderLayout());
		JPanel counterPanel4 = new JPanel();
		counterPanel4.setOpaque(false);
		pit4.add(counterPanel4, BorderLayout.NORTH);
		counterPanel4.setLayout(new BorderLayout());
		JTextArea counterArea4 = new JTextArea("4");
		counterArea4.setOpaque(false);
		counterPanel4.add(counterArea4, BorderLayout.EAST);

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit5Image = requestImage("Images/CeramicPit1-6.png");
		pit5 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit5Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};
		// ----------------------------------------------------
		pit5.setLayout(new BorderLayout());
		JPanel counterPanel5 = new JPanel();
		counterPanel5.setOpaque(false);
		pit5.add(counterPanel5, BorderLayout.NORTH);
		counterPanel5.setLayout(new BorderLayout());
		JTextArea counterArea5 = new JTextArea("4");
		counterArea5.setOpaque(false);
		counterPanel5.add(counterArea5, BorderLayout.EAST);

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit6Image = requestImage("Images/CeramicPit1-6.png");
		pit6 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit6Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};
		pit6.setLayout(new GridLayout());
		addMarbleToBoard(pit6);
		addMarbleToBoard(pit6);
		addMarbleToBoard(pit6);
		Marble m = new Marble();
		pit6.add(m.makeMarble());
		// ----------------------------------------------------
//		pit6.setLayout(new BorderLayout());
//		JPanel counterPanel6 = new JPanel();
//		counterPanel6.setOpaque(false);
//		pit6.add(counterPanel6, BorderLayout.NORTH);
//		counterPanel6.setLayout(new BorderLayout());
//		JTextArea counterArea6 = new JTextArea("4");
//		counterArea6.setOpaque(false);
//		counterPanel6.add(counterArea6, BorderLayout.EAST);
		
//		JPanel marblePanel = new JPanel(new GridLayout(4,4));
//		pit6.add(marblePanel, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit7Image = requestImage("Images/CeramicPit7-12.png");
		pit7 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit7Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};
		// ----------------------------------------------------
		pit7.setLayout(new BorderLayout());
		JPanel counterPanel7 = new JPanel();
		counterPanel7.setOpaque(false);
		pit7.add(counterPanel7, BorderLayout.NORTH);
		counterPanel7.setLayout(new BorderLayout());
		JTextArea counterArea7 = new JTextArea("4");
		counterArea7.setOpaque(false);
		counterPanel7.add(counterArea7, BorderLayout.EAST);

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit8Image = requestImage("Images/CeramicPit7-12.png");
		pit8 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit8Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};
		// ----------------------------------------------------
		pit8.setLayout(new BorderLayout());
		JPanel counterPanel8 = new JPanel();
		counterPanel8.setOpaque(false);
		pit8.add(counterPanel8, BorderLayout.NORTH);
		counterPanel8.setLayout(new BorderLayout());
		JTextArea counterArea8 = new JTextArea("4");
		counterArea8.setOpaque(false);
		counterPanel8.add(counterArea8, BorderLayout.EAST);

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit9Image = requestImage("Images/CeramicPit7-12.png");
		pit9 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit9Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};
		// ----------------------------------------------------
		pit9.setLayout(new BorderLayout());
		JPanel counterPanel9 = new JPanel();
		counterPanel9.setOpaque(false);
		pit9.add(counterPanel9, BorderLayout.NORTH);
		counterPanel9.setLayout(new BorderLayout());
		JTextArea counterArea9 = new JTextArea("4");
		counterArea9.setOpaque(false);
		counterPanel9.add(counterArea9, BorderLayout.EAST);

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit10Image = requestImage("Images/CeramicPit7-12.png");
		pit10 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit10Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};
		// ----------------------------------------------------
		pit10.setLayout(new BorderLayout());
		JPanel counterPanel10 = new JPanel();
		counterPanel10.setOpaque(false);
		pit10.add(counterPanel10, BorderLayout.NORTH);
		counterPanel10.setLayout(new BorderLayout());
		JTextArea counterArea10 = new JTextArea("4");
		counterArea10.setOpaque(false);
		counterPanel10.add(counterArea10, BorderLayout.EAST);

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit11Image = requestImage("Images/CeramicPit7-12.png");
		pit11 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit11Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};
		// ----------------------------------------------------
		pit11.setLayout(new BorderLayout());
		JPanel counterPanel11 = new JPanel();
		counterPanel11.setOpaque(false);
		pit11.add(counterPanel11, BorderLayout.NORTH);
		counterPanel11.setLayout(new BorderLayout());
		JTextArea counterArea11 = new JTextArea("4");
		counterArea11.setOpaque(false);
		counterPanel11.add(counterArea11, BorderLayout.EAST);

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit12Image = requestImage("Images/CeramicPit7-12.png");
		pit12 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit12Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};
		// ----------------------------------------------------
		pit12.setLayout(new BorderLayout());
		JPanel counterPanel12 = new JPanel();
		counterPanel12.setOpaque(false);
		pit12.add(counterPanel12, BorderLayout.NORTH);
		counterPanel12.setLayout(new BorderLayout());
		JTextArea counterArea12 = new JTextArea("4");
		counterArea12.setOpaque(false);
		counterPanel12.add(counterArea12, BorderLayout.EAST);

		// --------------------------------------------------------------------------------------------------------------------------------

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
		// --------------------------------------------------------------------------------------------------------------------------------
		pitList.add(pit6);
		pitList.add(pit5);
		pitList.add(pit4);
		pitList.add(pit3);
		pitList.add(pit2);
		pitList.add(pit1);
		pitList.add(null);
		pitList.add(pit7);
		pitList.add(pit8);
		pitList.add(pit9);
		pitList.add(pit10);
		pitList.add(pit11);
		pitList.add(pit12);
		pitList.add(null);
		// --------------------------------------------------------------------------------------------------------------------------------

		setSize(1000, 500);// ------------------------------------------------------------------------>
							// FRAME SIZE
		setLayout(new BorderLayout());
		// /setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		add(boardPanel, BorderLayout.CENTER);
		// add(topPanel, BorderLayout.NORTH);
		// add(bottomPanel, BorderLayout.SOUTH);
		setBackground(Color.WHITE);
		// pack();
		setVisible(true);
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
				new Board2(g).prepare();

			}
		});
	}

	public void addMarbleToBoard(JPanel panel) {
		JPanel p = new JPanel();		
		Marble mar = new Marble();
		p.add(mar.makeMarble());
		p.setOpaque(false);
		panel.add(p);
	}

	@Override
	public void addListeners() {
		// TODO Auto-generated method stub
		for (JPanel j : pitList) {

			if (j != null)
				j.addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent arg0) {
						System.out.println((pitList.indexOf(arg0.getComponent())));
						System.out.println("You have clicked a pit");
						//g.update();
					}

					@Override
					public void mouseEntered(MouseEvent arg0) {}

					@Override
					public void mouseExited(MouseEvent arg0) {}

					@Override
					public void mousePressed(MouseEvent arg0) {}

					@Override
					public void mouseReleased(MouseEvent arg0) {}

				});
		}
	}
	public void addNumberOfMarble(JPanel panel, int i)
	{
		Marble marble = new Marble();
		for(int x = 0 ; x <= i ; x ++ )
		{
			panel.add(marble.makeMarble());
		}
	}
}
