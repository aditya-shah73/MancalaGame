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

	Image pit1Image;

	Image pit2Image;

	Image pit3Image;

	Image pit4Image;

	Image pit5Image;

	Image pit6Image;

	Image pit7Image;

	Image pit8Image;

	Image pit9Image;

	Image pit10Image;

	Image pit11Image;

	Image pit12Image;

	JPanel pitPanel;

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

			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.drawImage(storeImageLeft.getScaledInstance(125, 224, 0), 0,

				0, null); // -------------------> LEFT STORE IMAGE SIZE

				// AND LOCATION

			}

		};

		storePanelLeft.setPreferredSize(new Dimension(125, 224));

		boardPanel.add(storePanelLeft, BorderLayout.WEST);

		storePanelLeft.setLayout(new BorderLayout());

		JPanel storePanelNorthLeft = new JPanel();

		JPanel storePanelSouthLeft = new JPanel();

		JPanel storePanelEastLeft = new JPanel();

		JPanel storePanelWestLeft = new JPanel();

		JPanel storePanelCenterLeft = new JPanel();

		storePanelCenterLeft.setLayout(new GridLayout(0, 5));

		storePanelLeft.add(storePanelNorthLeft, BorderLayout.NORTH);

		storePanelLeft.add(storePanelSouthLeft, BorderLayout.SOUTH);

		storePanelLeft.add(storePanelEastLeft, BorderLayout.EAST);

		storePanelLeft.add(storePanelWestLeft, BorderLayout.WEST);

		storePanelLeft.add(storePanelCenterLeft, BorderLayout.CENTER);

		// ----------------------------------------------------

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image storeImageRight = requestImage("Images/CeramicStoreRight.png");

		JPanel storePanelRight = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.drawImage(storeImageRight.getScaledInstance(125, 224, 0), 0,

				0, null); // -------------------> RIGHT STORE IMAGE SIZE

				// AND LOCATION

			}

		};

		storePanelRight.setPreferredSize(new Dimension(125, 224));

		boardPanel.add(storePanelRight, BorderLayout.EAST);

		storePanelRight.setLayout(new BorderLayout());

		JPanel storePanelNorthRight = new JPanel();

		JPanel storePanelSouthRight = new JPanel();

		JPanel storePanelEastRight = new JPanel();

		JPanel storePanelWestRight = new JPanel();

		JPanel storePanelCenterRight = new JPanel();

		storePanelCenterRight.setLayout(new GridLayout(0, 5));

		storePanelRight.add(storePanelNorthRight, BorderLayout.NORTH);

		storePanelRight.add(storePanelSouthRight, BorderLayout.SOUTH);

		storePanelRight.add(storePanelEastRight, BorderLayout.EAST);

		storePanelRight.add(storePanelWestRight, BorderLayout.WEST);

		storePanelRight.add(storePanelCenterRight, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------

		pitPanel = new JPanel();

		pitPanel.setBackground(Color.WHITE);

		pitPanel.setPreferredSize(new Dimension(650, 224));

		boardPanel.add(pitPanel, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------

		pit1Image = requestImage("Images/CeramicPit1-6.png");

		this.pit1 = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.drawImage(pit1Image.getScaledInstance(

				pitPanel.getWidth() / 6, 112, 0), 0, 0, null);

			}

		};

		pit1.setLayout(new BorderLayout());

		JPanel north1 = new JPanel();

		JPanel south1 = new JPanel();

		JPanel east1 = new JPanel();

		JPanel west1 = new JPanel();

		JPanel center1 = new JPanel();

		center1.setLayout(new GridLayout(0, 5));

		pit1.add(north1, BorderLayout.NORTH);

		pit1.add(south1, BorderLayout.SOUTH);

		pit1.add(east1, BorderLayout.EAST);

		pit1.add(west1, BorderLayout.WEST);

		pit1.add(center1, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------

		pit2Image = requestImage("Images/CeramicPit1-6.png");

		pit2 = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.drawImage(pit2Image.getScaledInstance(

				pitPanel.getWidth() / 6, 112, 0), 0, 0, null);

			}

		};

		pit2.setLayout(new BorderLayout());

		JPanel north2 = new JPanel();

		JPanel south2 = new JPanel();

		JPanel east2 = new JPanel();

		JPanel west2 = new JPanel();

		JPanel center2 = new JPanel();

		center2.setLayout(new GridLayout(0, 5));

		pit2.add(north2, BorderLayout.NORTH);

		pit2.add(south2, BorderLayout.SOUTH);

		pit2.add(east2, BorderLayout.EAST);

		pit2.add(west2, BorderLayout.WEST);

		pit2.add(center2, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------

		pit3Image = requestImage("Images/CeramicPit1-6.png");

		pit3 = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.drawImage(pit3Image.getScaledInstance(

				pitPanel.getWidth() / 6, 112, 0), 0, 0, null);

			}

		};

		pit3.setLayout(new BorderLayout());

		JPanel north3 = new JPanel();

		JPanel south3 = new JPanel();

		JPanel east3 = new JPanel();

		JPanel west3 = new JPanel();

		JPanel center3 = new JPanel();

		center3.setLayout(new GridLayout(0, 5));

		pit3.add(north3, BorderLayout.NORTH);

		pit3.add(south3, BorderLayout.SOUTH);

		pit3.add(east3, BorderLayout.EAST);

		pit3.add(west3, BorderLayout.WEST);

		pit3.add(center3, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------

		pit4Image = requestImage("Images/CeramicPit1-6.png");

		pit4 = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.drawImage(pit4Image.getScaledInstance(

				pitPanel.getWidth() / 6, 112, 0), 0, 0, null);

			}

		};

		pit4.setLayout(new BorderLayout());

		JPanel north4 = new JPanel();

		JPanel south4 = new JPanel();

		JPanel east4 = new JPanel();

		JPanel west4 = new JPanel();

		JPanel center4 = new JPanel();

		center4.setLayout(new GridLayout(0, 5));

		pit4.add(north4, BorderLayout.NORTH);

		pit4.add(south4, BorderLayout.SOUTH);

		pit4.add(east4, BorderLayout.EAST);

		pit4.add(west4, BorderLayout.WEST);

		pit4.add(center4, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------

		pit5Image = requestImage("Images/CeramicPit1-6.png");

		pit5 = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.drawImage(pit5Image.getScaledInstance(

				pitPanel.getWidth() / 6, 112, 0), 0, 0, null);

			}

		};

		pit5.setLayout(new BorderLayout());

		JPanel north5 = new JPanel();

		JPanel south5 = new JPanel();

		JPanel east5 = new JPanel();

		JPanel west5 = new JPanel();

		JPanel center5 = new JPanel();

		center5.setLayout(new GridLayout(0, 5));

		pit5.add(north5, BorderLayout.NORTH);

		pit5.add(south5, BorderLayout.SOUTH);

		pit5.add(east5, BorderLayout.EAST);

		pit5.add(west5, BorderLayout.WEST);

		pit5.add(center5, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------

		pit6Image = requestImage("Images/CeramicPit1-6.png");

		pit6 = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.drawImage(pit6Image.getScaledInstance(

				pitPanel.getWidth() / 6, 112, 0), 0, 0, null);

			}

		};

		pit6.setLayout(new BorderLayout());

		JPanel north6 = new JPanel();

		JPanel south6 = new JPanel();

		JPanel east6 = new JPanel();

		JPanel west6 = new JPanel();

		JPanel center6 = new JPanel();

		center6.setLayout(new GridLayout(0, 5));

		pit6.add(north6, BorderLayout.NORTH);

		pit6.add(south6, BorderLayout.SOUTH);

		pit6.add(east6, BorderLayout.EAST);

		pit6.add(west6, BorderLayout.WEST);

		pit6.add(center6, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------

		pit7Image = requestImage("Images/CeramicPit7-12.png");

		pit7 = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.drawImage(pit7Image.getScaledInstance(

				pitPanel.getWidth() / 6, 112, 0), 0, 0, null);

			}

		};

		pit7.setLayout(new BorderLayout());

		JPanel north7 = new JPanel();

		JPanel south7 = new JPanel();

		JPanel east7 = new JPanel();

		JPanel west7 = new JPanel();

		JPanel center7 = new JPanel();

		center7.setLayout(new GridLayout(0, 5));

		pit7.add(north7, BorderLayout.NORTH);

		pit7.add(south7, BorderLayout.SOUTH);

		pit7.add(east7, BorderLayout.EAST);

		pit7.add(west7, BorderLayout.WEST);

		pit7.add(center7, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------

		pit8Image = requestImage("Images/CeramicPit7-12.png");

		pit8 = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.drawImage(pit8Image.getScaledInstance(

				pitPanel.getWidth() / 6, 112, 0), 0, 0, null);

			}

		};

		pit8.setLayout(new BorderLayout());

		JPanel north8 = new JPanel();

		JPanel south8 = new JPanel();

		JPanel east8 = new JPanel();

		JPanel west8 = new JPanel();

		JPanel center8 = new JPanel();

		center8.setLayout(new GridLayout(0, 5));

		pit8.add(north8, BorderLayout.NORTH);

		pit8.add(south8, BorderLayout.SOUTH);

		pit8.add(east8, BorderLayout.EAST);

		pit8.add(west8, BorderLayout.WEST);

		pit8.add(center8, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------

		pit9Image = requestImage("Images/CeramicPit7-12.png");

		pit9 = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.drawImage(pit9Image.getScaledInstance(

				pitPanel.getWidth() / 6, 112, 0), 0, 0, null);

			}

		};

		pit9.setLayout(new BorderLayout());

		JPanel north9 = new JPanel();

		JPanel south9 = new JPanel();

		JPanel east9 = new JPanel();

		JPanel west9 = new JPanel();

		JPanel center9 = new JPanel();

		center9.setLayout(new GridLayout(0, 5));

		pit9.add(north9, BorderLayout.NORTH);

		pit9.add(south9, BorderLayout.SOUTH);

		pit9.add(east9, BorderLayout.EAST);

		pit9.add(west9, BorderLayout.WEST);

		pit9.add(center9, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------

		pit10Image = requestImage("Images/CeramicPit7-12.png");

		pit10 = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.drawImage(pit10Image.getScaledInstance(

				pitPanel.getWidth() / 6, 112, 0), 0, 0, null);

			}

		};

		pit10.setLayout(new BorderLayout());

		JPanel north10 = new JPanel();

		JPanel south10 = new JPanel();

		JPanel east10 = new JPanel();

		JPanel west10 = new JPanel();

		JPanel center10 = new JPanel();

		center10.setLayout(new GridLayout(0, 5));

		pit10.add(north10, BorderLayout.NORTH);

		pit10.add(south10, BorderLayout.SOUTH);

		pit10.add(east10, BorderLayout.EAST);

		pit10.add(west10, BorderLayout.WEST);

		pit10.add(center10, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------

		pit11Image = requestImage("Images/CeramicPit7-12.png");

		pit11 = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.drawImage(pit11Image.getScaledInstance(

				pitPanel.getWidth() / 6, 112, 0), 0, 0, null);

			}

		};

		pit11.setLayout(new BorderLayout());

		JPanel north11 = new JPanel();

		JPanel south11 = new JPanel();

		JPanel east11 = new JPanel();

		JPanel west11 = new JPanel();

		JPanel center11 = new JPanel();

		center11.setLayout(new GridLayout(0, 5));

		pit11.add(north11, BorderLayout.NORTH);

		pit11.add(south11, BorderLayout.SOUTH);

		pit11.add(east11, BorderLayout.EAST);

		pit11.add(west11, BorderLayout.WEST);

		pit11.add(center11, BorderLayout.CENTER);

		// --------------------------------------------------------------------------------------------------------------------------------

		pit12Image = requestImage("Images/CeramicPit7-12.png");

		pit12 = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.drawImage(pit12Image.getScaledInstance(

				pitPanel.getWidth() / 6, 112, 0), 0, 0, null);

			}

		};

		pit12.setLayout(new BorderLayout());

		JPanel north12 = new JPanel();

		JPanel south12 = new JPanel();

		JPanel east12 = new JPanel();

		JPanel west12 = new JPanel();

		JPanel center12 = new JPanel();

		center12.setLayout(new GridLayout(0, 5));

		pit12.add(north12, BorderLayout.NORTH);

		pit12.add(south12, BorderLayout.SOUTH);

		pit12.add(east12, BorderLayout.EAST);

		pit12.add(west12, BorderLayout.WEST);

		pit12.add(center12, BorderLayout.CENTER);

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

						int counter = pitList.indexOf(arg0.getComponent());

						g.current = g.first;

						for (int i = 0; i < counter; i++) {

							g.nextPit();

						}

						g.update(g.current);

					}

					@Override
					public void mouseEntered(MouseEvent arg0) {
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
					}

					@Override
					public void mousePressed(MouseEvent arg0) {
					}

					@Override
					public void mouseReleased(MouseEvent arg0) {
					}

				});

		}

	}

	public void addNumberOfMarble(JPanel panel, int i)

	{

		for (int x = 0; x < i; x++)

		{

			Marble marble = new Marble();

			panel.add(marble.makeMarble());

		}

	}

}
