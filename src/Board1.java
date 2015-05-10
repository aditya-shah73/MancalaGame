import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;

/**
 * Wooden board theme for the Mancala game.
 * @author DreamTeam.
 */

public class Board1 extends JPanel implements Board 
{
	ArrayList<JPanel> pitList;

	JPanel pit1, pit2, pit3, pit4, pit5, pit6, pit7, pit8, pit9, pit10, pit11, pit12 ;

	JPanel boardPanel;

	JPanel storePanelLeftCenter, storePanelNorthLeft, storePanelSouthLeft, storePanelEastLeft, storePanelWestLeft, storePanelLeft;	
	JPanel storePanelRightCenter, storePanelNorthRight, storePanelSouthRight, storePanelEastRight, storePanelWestRight, storePanelRight;

	GameEngine g;

	private Image pit1Image, pit2Image, pit3Image, pit4Image, pit5Image, pit6Image, pit7Image, pit8Image, pit9Image, pit10Image, pit11Image, pit12Image;

	JPanel north1, north2, north3, north4, north5, north6, north7, north8, north9, north10, north11, north12;
	JPanel south1, south2, south3, south4, south5, south6, south7, south8, south9, south10, south11, south12;
	JPanel east1, east2, east3, east4, east5, east6, east7, east8, east9, east10, east11, east12;
	JPanel west1, west2, west3, west4, west5, west6, west7, west8, west9, west10, west11, west12;

	JPanel pitPanel;

	/**
	 * Constructor for Board1.
	 * @param ge Instance of GameEngine class.
	 */
	public Board1(GameEngine ge) 
	{
		g = ge;
		pitList = new ArrayList<JPanel>();

		boardPanel = new JPanel();

		storePanelLeft = new JPanel();  
		storePanelNorthLeft = new JPanel();
		storePanelSouthLeft = new JPanel();
		storePanelEastLeft = new JPanel();
		storePanelWestLeft = new JPanel();

		storePanelRight = new JPanel();  
		storePanelNorthRight = new JPanel();
		storePanelSouthRight = new JPanel();
		storePanelEastRight = new JPanel();
		storePanelWestRight = new JPanel();

		pitPanel = new JPanel();

		pit1Image = requestImage("Images/WoodPit1-6.png");
		pit2Image = requestImage("Images/WoodPit1-6.png");
		pit3Image = requestImage("Images/WoodPit1-6.png");
		pit4Image = requestImage("Images/WoodPit1-6.png");
		pit5Image = requestImage("Images/WoodPit1-6.png");
		pit6Image = requestImage("Images/WoodPit1-6.png");
		pit7Image = requestImage("Images/WoodPit7-12.png");
		pit8Image = requestImage("Images/WoodPit7-12.png");
		pit9Image = requestImage("Images/WoodPit7-12.png");
		pit10Image = requestImage("Images/WoodPit7-12.png");
		pit11Image = requestImage("Images/WoodPit7-12.png");
		pit12Image = requestImage("Images/WoodPit7-12.png");

		pit1 = new JPanel();	north1 = new JPanel();		south1 = new JPanel();		east1 = new JPanel();		west1 = new JPanel();
		pit2 = new JPanel();	north2 = new JPanel();		south2 = new JPanel();		east2 = new JPanel();		west2 = new JPanel();
		pit3 = new JPanel();	north3 = new JPanel();		south3 = new JPanel();		east3 = new JPanel();		west3 = new JPanel();
		pit4 = new JPanel();	north4 = new JPanel();		south4 = new JPanel();		east4 = new JPanel();		west4 = new JPanel();
		pit5 = new JPanel();	north5 = new JPanel();		south5 = new JPanel();		east5 = new JPanel();		west5 = new JPanel();
		pit6 = new JPanel();	north6 = new JPanel();		south6 = new JPanel();		east6 = new JPanel();		west6 = new JPanel();
		pit7 = new JPanel();	north7 = new JPanel();		south7 = new JPanel();		east7 = new JPanel();		west7 = new JPanel();
		pit8 = new JPanel();	north8 = new JPanel();		south8 = new JPanel();		east8 = new JPanel();		west8 = new JPanel();
		pit9 = new JPanel();	north9 = new JPanel();		south9 = new JPanel();		east9 = new JPanel();		west9 = new JPanel();
		pit10 = new JPanel();	north10 = new JPanel();		south10 = new JPanel();		east10 = new JPanel();		west10 = new JPanel();
		pit11 = new JPanel();	north11 = new JPanel();		south11 = new JPanel();		east11 = new JPanel();		west11 = new JPanel();
		pit12 = new JPanel();	north12 = new JPanel();		south12 = new JPanel();		east12 = new JPanel();		west12 = new JPanel();
	}

	/**
	 * Creates board with panels and images.
	 */
	public Board1 prepare() 
	{

		boardPanel.setPreferredSize(new Dimension(1000, 224));
		boardPanel.setLayout(new BorderLayout());
		
		final Image storeImageLeft = requestImage("Images/WoodStoreLeft.png");
		storePanelLeftCenter = new JPanel() 
		{
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				g.drawImage(storeImageLeft.getScaledInstance(125, 224, 0), 0,0, null); // -------------------> LEFT STORE IMAGE SIZE AND LOCATION
			}																			
		};																				

		storePanelLeftCenter.setPreferredSize(new Dimension(125, 224));
		boardPanel.add(storePanelLeftCenter, BorderLayout.WEST);
		storePanelLeftCenter.setLayout(new BorderLayout());

		storePanelNorthLeft.setOpaque(false);

		storePanelSouthLeft.setOpaque(false);

		storePanelEastLeft.setOpaque(false);

		storePanelWestLeft.setOpaque(false);

		storePanelLeft.setOpaque(false);
		storePanelLeft.setLayout(new GridLayout(0, 5));
		storePanelLeftCenter.add(storePanelNorthLeft, BorderLayout.NORTH);
		storePanelLeftCenter.add(storePanelSouthLeft, BorderLayout.SOUTH);
		storePanelLeftCenter.add(storePanelEastLeft, BorderLayout.EAST);
		storePanelLeftCenter.add(storePanelWestLeft, BorderLayout.WEST);
		storePanelLeftCenter.add(storePanelLeft, BorderLayout.CENTER);

		final Image storeImageRight = requestImage("Images/WoodStoreRight.png");
		storePanelRightCenter = new JPanel() 
		{
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				g.drawImage(storeImageRight.getScaledInstance(125, 224, 0), 0, 0, null); // -------------------> Right STORE IMAGE SIZE AND LOCATION
			}																			
		};																				

		storePanelRightCenter.setPreferredSize(new Dimension(125, 224));
		boardPanel.add(storePanelRightCenter, BorderLayout.EAST);
		storePanelRightCenter.setLayout(new BorderLayout());	

		storePanelNorthRight.setOpaque(false);

		storePanelSouthRight.setOpaque(false);

		storePanelEastRight.setOpaque(false);

		storePanelWestRight.setOpaque(false);

		storePanelRight.setOpaque(false);
		storePanelRight.setLayout(new GridLayout(0, 5));
		storePanelRightCenter.add(storePanelNorthRight, BorderLayout.NORTH);
		storePanelRightCenter.add(storePanelSouthRight, BorderLayout.SOUTH);
		storePanelRightCenter.add(storePanelEastRight, BorderLayout.EAST);
		storePanelRightCenter.add(storePanelWestRight, BorderLayout.WEST);
		storePanelRightCenter.add(storePanelRight, BorderLayout.CENTER);

		
		pitPanel.setBackground(Color.WHITE);
		pitPanel.setPreferredSize(new Dimension(650, 224));
		boardPanel.add(pitPanel, BorderLayout.CENTER);

		//Pit 1		
		JPanel center1 = new JPanel() 
		{
			@Override
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				g.drawImage(pit1Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		center1.setLayout(new BorderLayout());

		north1.setOpaque(false);

		south1.setOpaque(false);

		east1.setOpaque(false);

		west1.setOpaque(false);

		pit1.setOpaque(false);
		pit1.setLayout(new GridLayout(0, 5));
		center1.add(north1, BorderLayout.NORTH);
		center1.add(south1, BorderLayout.SOUTH);
		center1.add(east1, BorderLayout.EAST);
		center1.add(west1, BorderLayout.WEST);
		center1.add(pit1, BorderLayout.CENTER);

		//Pit 2		
		JPanel center2 = new JPanel() 
		{
			@Override
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				g.drawImage(pit2Image.getScaledInstance(pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		center2.setLayout(new BorderLayout());

		north2.setOpaque(false);

		south2.setOpaque(false);

		east2.setOpaque(false);

		west2.setOpaque(false);

		pit2.setOpaque(false);
		pit2.setLayout(new GridLayout(0, 5));
		center2.add(north2, BorderLayout.NORTH);
		center2.add(south2, BorderLayout.SOUTH);
		center2.add(east2, BorderLayout.EAST);
		center2.add(west2, BorderLayout.WEST);
		center2.add(pit2, BorderLayout.CENTER);
		
		//Pit 3		
		JPanel center3 = new JPanel() 
		{
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(pit3Image.getScaledInstance(pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		center3.setLayout(new BorderLayout());

		north3.setOpaque(false);

		south3.setOpaque(false);

		east3.setOpaque(false);

		west3.setOpaque(false);

		pit3.setOpaque(false);
		pit3.setLayout(new GridLayout(0, 5));
		center3.add(north3, BorderLayout.NORTH);
		center3.add(south3, BorderLayout.SOUTH);
		center3.add(east3, BorderLayout.EAST);
		center3.add(west3, BorderLayout.WEST);
		center3.add(pit3, BorderLayout.CENTER);

		//pit 4		
		JPanel center4 = new JPanel() 
		{
			@Override
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				g.drawImage(pit4Image.getScaledInstance(pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		center4.setLayout(new BorderLayout());

		north4.setOpaque(false);

		south4.setOpaque(false);

		east4.setOpaque(false);

		west4.setOpaque(false);

		pit4.setOpaque(false);
		pit4.setLayout(new GridLayout(0, 5));
		center4.add(north4, BorderLayout.NORTH);
		center4.add(south4, BorderLayout.SOUTH);
		center4.add(east4, BorderLayout.EAST);
		center4.add(west4, BorderLayout.WEST);
		center4.add(pit4, BorderLayout.CENTER);
		
		//Pit 5		
		JPanel center5 = new JPanel() 
		{
			@Override
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				g.drawImage(pit5Image.getScaledInstance(pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		center5.setLayout(new BorderLayout());

		north5.setOpaque(false);

		south5.setOpaque(false);

		east5.setOpaque(false);

		west5.setOpaque(false);

		pit5.setOpaque(false);
		pit5.setLayout(new GridLayout(0, 5));
		center5.add(north5, BorderLayout.NORTH);
		center5.add(south5, BorderLayout.SOUTH);
		center5.add(east5, BorderLayout.EAST);
		center5.add(west5, BorderLayout.WEST);
		center5.add(pit5, BorderLayout.CENTER);

		//Pit 6		
		JPanel center6 = new JPanel() 
		{
			@Override
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				g.drawImage(pit6Image.getScaledInstance(pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		center6.setLayout(new BorderLayout());

		north6.setOpaque(false);

		south6.setOpaque(false);

		east6.setOpaque(false);

		west6.setOpaque(false);

		pit6.setOpaque(false);
		pit6.setLayout(new GridLayout(0, 5));
		center6.add(north6, BorderLayout.NORTH);
		center6.add(south6, BorderLayout.SOUTH);
		center6.add(east6, BorderLayout.EAST);
		center6.add(west6, BorderLayout.WEST);
		center6.add(pit6, BorderLayout.CENTER);
		
		//Pit 7		
		JPanel center7 = new JPanel() 
		{
			@Override
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				g.drawImage(pit7Image.getScaledInstance(pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		center7.setLayout(new BorderLayout());

		north7.setOpaque(false);

		south7.setOpaque(false);

		east7.setOpaque(false);

		west7.setOpaque(false);

		pit7.setOpaque(false);
		pit7.setLayout(new GridLayout(0, 5));
		center7.add(north7, BorderLayout.NORTH);
		center7.add(south7, BorderLayout.SOUTH);
		center7.add(east7, BorderLayout.EAST);
		center7.add(west7, BorderLayout.WEST);
		center7.add(pit7, BorderLayout.CENTER);

		//Pit 8		
		JPanel center8 = new JPanel() 
		{
			@Override
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				g.drawImage(pit8Image.getScaledInstance(pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		center8.setLayout(new BorderLayout());

		north8.setOpaque(false);

		south8.setOpaque(false);

		east8.setOpaque(false);

		west8.setOpaque(false);

		pit8.setOpaque(false);
		pit8.setLayout(new GridLayout(0, 5));
		center8.add(north8, BorderLayout.NORTH);
		center8.add(south8, BorderLayout.SOUTH);
		center8.add(east8, BorderLayout.EAST);
		center8.add(west8, BorderLayout.WEST);
		center8.add(pit8, BorderLayout.CENTER);

		//Pit 9	
		JPanel center9 = new JPanel() 
		{
			@Override
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				g.drawImage(pit9Image.getScaledInstance(pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		center9.setLayout(new BorderLayout());

		north9.setOpaque(false);

		south9.setOpaque(false);

		east9.setOpaque(false);

		west9.setOpaque(false);

		pit9.setOpaque(false);
		pit9.setLayout(new GridLayout(0, 5));
		center9.add(north9, BorderLayout.NORTH);
		center9.add(south9, BorderLayout.SOUTH);
		center9.add(east9, BorderLayout.EAST);
		center9.add(west9, BorderLayout.WEST);
		center9.add(pit9, BorderLayout.CENTER);
		
		//Pit 10		
		JPanel center10 = new JPanel() 
		{
			@Override
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				g.drawImage(pit10Image.getScaledInstance(pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		center10.setLayout(new BorderLayout());

		north10.setOpaque(false);

		south10.setOpaque(false);

		east10.setOpaque(false);

		west10.setOpaque(false);

		pit10.setOpaque(false);
		pit10.setLayout(new GridLayout(0, 5));
		center10.add(north10, BorderLayout.NORTH);
		center10.add(south10, BorderLayout.SOUTH);
		center10.add(east10, BorderLayout.EAST);
		center10.add(west10, BorderLayout.WEST);
		center10.add(pit10, BorderLayout.CENTER);
		
		//Pit 11		
		JPanel center11 = new JPanel() 
		{
			@Override
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				g.drawImage(pit11Image.getScaledInstance(pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		center11.setLayout(new BorderLayout());

		north11.setOpaque(false);

		south11.setOpaque(false);

		east11.setOpaque(false);

		west11.setOpaque(false);

		pit11.setOpaque(false);
		pit11.setLayout(new GridLayout(0, 5));
		center11.add(north11, BorderLayout.NORTH);
		center11.add(south11, BorderLayout.SOUTH);
		center11.add(east11, BorderLayout.EAST);
		center11.add(west11, BorderLayout.WEST);
		center11.add(pit11, BorderLayout.CENTER);

		//Pit 12		
		JPanel center12= new JPanel() 
		{
			@Override
			public void paintComponent(Graphics g) 
			{
				super.paintComponent(g);
				g.drawImage(pit12Image.getScaledInstance(
						pitPanel.getWidth() / 6, 112, 0), 0, 0, null);
			}
		};

		center12.setLayout(new BorderLayout());

		north12.setOpaque(false);

		south12.setOpaque(false);

		east12.setOpaque(false);

		west12.setOpaque(false);

		pit12.setOpaque(false);
		pit12.setLayout(new GridLayout(0, 5));
		center12.add(north12, BorderLayout.NORTH);
		center12.add(south12, BorderLayout.SOUTH);
		center12.add(east12, BorderLayout.EAST);
		center12.add(west12, BorderLayout.WEST);
		center12.add(pit12, BorderLayout.CENTER);

		pitPanel.setLayout(new GridLayout(2, 6));
		pitPanel.add(center1);
		pitPanel.add(center2);
		pitPanel.add(center3);
		pitPanel.add(center4);
		pitPanel.add(center5);
		pitPanel.add(center6);
		pitPanel.add(center7);
		pitPanel.add(center8);
		pitPanel.add(center9);
		pitPanel.add(center10);
		pitPanel.add(center11);
		pitPanel.add(center12);
		
		pitList.add(pit6);
		pitList.add(pit5);
		pitList.add(pit4);
		pitList.add(pit3);
		pitList.add(pit2);
		pitList.add(pit1);
		pitList.add(storePanelLeft);
		pitList.add(pit7);
		pitList.add(pit8);
		pitList.add(pit9);
		pitList.add(pit10);
		pitList.add(pit11);
		pitList.add(pit12);
		pitList.add(storePanelRight);
		
		setSize(1000, 500);
		setLayout(new BorderLayout());
		add(boardPanel, BorderLayout.CENTER);
		setBackground(Color.WHITE);
		setVisible(true);
		return this;
	}
	/**
	 * Returns an Image to be added in a panel.
	 * @param imageName Takes path to the image file as a string.
	 */
	public Image requestImage(String imageName) 
	{
		Image image = null;

		try 
		{
			image = ImageIO.read(new File(imageName));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return image;
	}

	/**
	 * Adds marble in the panel.
	 * @param panel Panel in which marble needs to be added.
	 */
	public void addMarbleToBoard(JPanel panel) 
	{
		JPanel p = new JPanel();
		Marble mar = new Marble();
		p.add(mar.makeMarble());
		p.setOpaque(false);
		panel.add(p);
	}

	/**
	 * Adds mouse listeners to panels.
	 */
	@Override
	public void addListeners() 
	{
		for (JPanel j : pitList) 
		{

			if (!(pitList.indexOf(j) == g.BOARD_SIZE/2 -1 || pitList.indexOf(j) == g.BOARD_SIZE - 1))
			{
				j.addMouseListener(new MouseListener() 
				{
					@Override
					public void mouseClicked(MouseEvent arg0) 
					{
						if(!g.moveDone)
						{	
							g.current = g.first;
							int counter = pitList.indexOf(arg0.getComponent());
							for (int i = 0; i < counter; i++) 
							{
								g.nextPit();
							}
							if (g.current.isPlayer1() && g.player1Turn)
								{
									g.update(g.current);
								}

							if (!g.current.isPlayer1() && !g.player1Turn)
								{
									g.update(g.current);
								}
							if(!g.landsOnStore)
								{
									g.moveDone = true;
								}
						}
					}

					@Override
					public void mouseEntered(MouseEvent arg0) 
					{
						
					}

					@Override
					public void mouseExited(MouseEvent arg0) 
					{
						
					}

					@Override
					public void mousePressed(MouseEvent arg0) 
					{
						
					}

					@Override
					public void mouseReleased(MouseEvent arg0) 
					{
						
					}

				});
			}
		}
	}
}