import java.util.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GameEngine 
{	
	private final int BOARD_SIZE = 14;	
	ArrayList<ChangeListener> listeners;
	Pit first;
	Pit last;
	int position = 0;
	Pit current;
	//0-5 Player 1
	//7-12 Player 2

	/**
	 * This is the default constructor which initializes the back end.
	 */
	public GameEngine()
	{
		initiatePits();
		listeners = new ArrayList<ChangeListener>();	
		current = first;
	}

	//first is a pit, last is a store
	private void initiatePits()
	{
		first = new Pit();
		first.isPlayer1();
		first.position = 0;
		current = first.next;
		current = new Pit();
		current.setPlayer1();
		current.position = 1;
		current = current.next;

		for(int i = 0; i < BOARD_SIZE-2; i++)
		{
			Pit p = new Pit();
			current = p;
			current.position = i+2;	
			if(i <= 4)
			{
				current.setPlayer1();

			}
			else if(i == BOARD_SIZE-3)
			{
				last = current;
				p.setAStore();
				last.next = first;
				break;
			}
			if(i == 4)
			{	
				p.setAStore();
			}
			current = current.next;
		}
	}
	public void nextPit() 
	{
		current = current.next;
	}

	//marbles move anti-clockwise
	//if last marble is moved into a store then you move again
	//weird rule later
	public void distribute(Pit p)
	{
		int count = p.count;
		current.count = 0;	
		for(int i = count; i > 0; i--)
		{
			nextPit();
			if(current.isAStore())
			{
				//implement later
			}
			if(current.next.count == 0)
			{
				//Implement later
			}
		}
	}

	public void attach(ChangeListener l)
	{
		listeners.add(l);
	}
	
	public boolean hasNextPit(){
		if(current.next != null)
			return true;
		else
			return false;
	}

	public void update()
	{
		for(ChangeListener l  : listeners)
		{
			l.stateChanged(new ChangeEvent(this));
		}
	}
}