import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.ArrayList;

import javax.imageio.*;
import javax.swing.*;

public class Board1 extends JPanel implements Board {
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

	public Board1(GameEngine ge) {
		g = ge;
		pitList = new ArrayList<JPanel>();
	}

	public Board1 prepare() {

		JPanel boardPanel = new JPanel();
		boardPanel.setPreferredSize(new Dimension(1000, 224));
		boardPanel.setLayout(new BorderLayout());

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image storeImageLeft = requestImage("Images/WoodStoreLeft.png");
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

		final Image storeImageRight = requestImage("Images/WoodStoreRight.png");
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

		final Image pit1Image = requestImage("Images/WoodPit1-6.png");
		this.pit1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit1Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		pit1.setLayout(new GridLayout(0, 4));

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit2Image = requestImage("Images/WoodPit1-6.png");
		pit2 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit2Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};
		
		pit2.setLayout(new GridLayout(0, 4));

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit3Image = requestImage("Images/WoodPit1-6.png");
		pit3 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit3Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};
		pit3.setLayout(new GridLayout(0, 4));

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit4Image = requestImage("Images/WoodPit1-6.png");
		pit4 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit4Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};
		
		pit4.setLayout(new GridLayout(0, 4));

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit5Image = requestImage("Images/WoodPit1-6.png");
		pit5 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit5Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		pit5.setLayout(new GridLayout(0, 4));

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit6Image = requestImage("Images/WoodPit1-6.png");
		pit6 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit6Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};
		pit6.setLayout(new GridLayout(0, 4));

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit7Image = requestImage("Images/WoodPit7-12.png");
		pit7 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit7Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		pit7.setLayout(new GridLayout(0, 4));

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit8Image = requestImage("Images/WoodPit7-12.png");
		pit8 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit8Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		pit8.setLayout(new GridLayout(0, 4));

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit9Image = requestImage("Images/WoodPit7-12.png");
		pit9 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit9Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		pit9.setLayout(new GridLayout(0, 4));

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit10Image = requestImage("Images/WoodPit7-12.png");
		pit10 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit10Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		pit10.setLayout(new GridLayout(0, 4));

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit11Image = requestImage("Images/WoodPit7-12.png");
		pit11 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit11Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		pit11.setLayout(new GridLayout(0, 4));

		// --------------------------------------------------------------------------------------------------------------------------------

		final Image pit12Image = requestImage("Images/WoodPit7-12.png");
		pit12 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit12Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		pit12.setLayout(new GridLayout(0, 4));

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
						
						for(int i = 0; i < counter; i++){
							g.nextPit();
						}
						g.update(g.current);
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
}
