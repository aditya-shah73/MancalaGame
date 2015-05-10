import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * The model class which controls the game
 * @author DreamTeam
 *
 */
public class GameEngine 
{
	final int BOARD_SIZE = 14;
	ArrayList<ChangeListener> listeners;
	Pit first;
	Pit last;
	int position = 0;
	int undoCount;
	Pit current;
	Pit previous;
	int previousValue;
	boolean undoDone;
	boolean moveDone;
	boolean landsOnStore;
	public int boardValue;
	int storeAdd;
	boolean player1Turn;
	boolean specialCase;

	/**
	 * This is the default constructor which initializes the back end.
	 */
	public GameEngine() 
	{
		boardValue = 2;
		undoDone = false;
		undoCount = 3;
		initiatePits();
		listeners = new ArrayList<ChangeListener>();
		current = first;
		player1Turn = true;
		moveDone = false;
		landsOnStore = false;
		storeAdd = 0;
		specialCase = false;
	}

	/**
	 * This initiates the pits in the list
	 */
	private void initiatePits() 
	{
		first = new Pit(); // Pit 1
		first.isPlayer1();
		first.position = 0;
		first.setPlayer1();
		first.count = 3;
		first.next = new Pit(); // Pit2
		current = first.next;
		current.setPlayer1();
		current.position = 1;
		current.count = 3;
		current.next = new Pit(); // Pit 3
		current = current.next;
		current.position = 2;
		current.setPlayer1();
		current.count = 3;

		for (int i = 0; i < BOARD_SIZE - 3; i++) 
		{
			Pit p = new Pit();
			current.next = p;
			current = current.next;
			current.position = i + 3;
			current.count = 3;
			if (i <= 3) 
			{
				current.setPlayer1();

			} 
			else if (i == BOARD_SIZE - 4) 
			{
				last = current;
				last.setAStore();
				last.next = first;
				last.count = 0;
				break;
			}
			if (i == 3) 
			{
				current.setAStore();
				current.count = 0;
			}
		}
	}

	/**
	 * Helps move to the next pit
	 */
	public void nextPit() 
	{
		current = current.next;
	}

	/**
	 * Distributes the marbles on the board
	 * @param p The pit which is clicked
	 */
	public void distribute(Pit p) 
	{
		previous = p;
		previousValue = p.count;
		current = p;
		int count = p.count;
		current.count = 0;

		for (int i = 0; i < count; i++) 
		{
			nextPit();
			if (current.isAStore()) 
			{
				if (player1Turn && current == last) 
				{
					nextPit();
				} 
				else if (!player1Turn && current != last) 
				{
					nextPit();
				}
			}

			if (current.count == 0 && !current.isAStore()) 
			{
				current.count++;
				int oppPosition = (BOARD_SIZE - 2) - current.position - current.position;
				for(int j = 0; j < oppPosition; j++)
				{
					nextPit();
				}
				int temp = current.count;
				current.count = 0;

				while(!current.next.isAStore())
				{
					nextPit();
				}
				nextPit();
				while(!current.next.isAStore())
				{
					nextPit();
				}
				nextPit();
				storeAdd = temp;
				current.count += temp;
				current.count--;
				specialCase = true;
			}
			current.count++;

			if (current.isAStore()) 
			{
				landsOnStore = true;
			}
			else
			{
				landsOnStore = false;
			}
		}
	}

	/**
	 * Attaches listeners for the model to update views
	 * @param l add the listener
	 */
	public void attach(ChangeListener l) 
	{
		listeners.add(l);
	}

	/**
	 * The undo functionality for the mancala game with each player having 3 undo chances 
	 */
	public void undo() 
	{
		landsOnStore = false;
		if (undoCount != 0 && !undoDone) 
		{
			current = previous;
			int count = previousValue;
			current.count = count;
			for (int i = 0; i < count; i++) 
			{
				nextPit();
				if (current.isAStore()) 
				{
					if (player1Turn && current == last) 
					{
						nextPit();
					} 
					else if (!player1Turn && current != last) 
					{
						nextPit();
					}
				}
				current.count--;
			}
			if (specialCase) 
			{
				current.count--;
				int oppPosition = (BOARD_SIZE - 2) - current.position - current.position;
				for(int j = 0; j < oppPosition; j++)
				{
					nextPit();
				}
				current.count += storeAdd;
				System.out.println("Position = " + current.position);
				System.out.println("Current = " + current.count);

				while(!current.next.isAStore())
				{
					nextPit();
				}
				nextPit();
				while(!current.next.isAStore())
				{
					nextPit();
				}

				nextPit();
				current.count -= storeAdd;
				System.out.println("Position = " + current.position);
				System.out.println("Current = " + current.count);
			}
			specialCase = false;
			update(null);
			undoCount--;
			undoDone = true;
		}
	}

	/**
	 * Checks if there is a next pit
	 * @return boolean True if there is a next pit else false
	 */
	public boolean hasNextPit() 
	{
		if (current.next != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * It updates the model the change listeners
	 * @param p The pit to be updated
	 */
	public void update(Pit p) 
	{
		undoDone = false;
		if (p != null)
			distribute(p);
		checkWin();
		for (ChangeListener l : listeners) 
		{
			l.stateChanged(new ChangeEvent(this));
		}
	}

	/**
	 * Checks for the winning condition and decides which player wins the game
	 */
	public void checkWin() 
	{
		current = first;

		int p1 = 0;
		int p2 = 0;
		int storeCount1 = 0;
		int storeCount2 = 0;

		for (int i = 0; i < BOARD_SIZE - 1; i++) 
		{
			if (!current.isAStore() && current.isPlayer1())
				p1 += current.count;
			if (!current.isAStore() && !current.isPlayer1())
				p2 += current.count;

			if (current.isAStore() && current.isPlayer1())
				storeCount1 = current.count;

			if (current.isAStore() && current.isPlayer1())
				storeCount2 = current.count;
			nextPit();
		}

		if (p1 == 0 || p2 == 0) 
		{
			storeCount1 += p1;
			storeCount2 += p2;

			if (storeCount1 > storeCount2) 
			{
				JOptionPane.showMessageDialog(new JFrame(), "Player 1 Wins");
			} 
			else if (storeCount1 < storeCount2) 
			{
				JOptionPane.showMessageDialog(new JFrame(), "Player 2 Wins");
			} 
			else
			{
				JOptionPane.showMessageDialog(new JFrame(), "Tie");
			}
		}
	}

	/**
	 * Sets the number of marbles chosen by the user in each pit when the game is started
	 * @param n The number of marbles in each pit
	 */
	public void setMarbles(int n) 
	{
		current = first;
		for (int i = 0; i < BOARD_SIZE; i++) 
		{
			if (!current.isAStore())
				current.count = n;
			current = current.next;
		}
		update(null);
	}

	/**
	 * Sets the theme selected by user
	 * @param s The name of the theme
	 */
	public void setBoard(String s) 
	{
		if (s.equalsIgnoreCase("Wood")) 
		{
			boardValue = 1;
		} 
		else if (s.equalsIgnoreCase("Ceramic")) 
		{
			boardValue = 2;
		}
		update(null);
	}
}