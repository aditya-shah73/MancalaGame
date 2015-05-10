import java.util.ArrayList;
/**
 * Node class of the linked list data structure.
 * @author dreamTeam.
 *
 */
public class Pit
{
	private ArrayList<Marble> storage;
	private boolean isStore;
	private boolean isPlayer1;
	int count;
	Pit next;
	int position;
	
	/**
	 * Default constructor for the pit.
	 */
	public Pit()
	{
		isPlayer1 = false;
		isStore = false;
		storage = new ArrayList<Marble>();
		count = 0;
	}
	
	/**
	 * Adds marble in pit.
	 * @param m Marble.
	 */
	public void addMarble(Marble m)
	{
		storage.add(m);
		count++;	
		
	}
	/**
	 * Removes all the marbles from pit.
	 */
	public void removeAll()
	{
		storage = new ArrayList<Marble>();
	}
	
	/**
	 * Removes marbles individually.
	 */
	public void removeMarble()
	{
		if(storage.size() > 0)
		{
			storage.remove(storage.size()-1);
		}
	}
	
	public boolean isAStore()
	{
		return isStore;
	}
	
	public void setAStore()
	{
		isStore = true;
	}
	
	public boolean isPlayer1()
	{
		return isPlayer1;
	}
	
	public void setPlayer1()
	{
		isPlayer1 = true;
	}
	
	public String toString(){
		return this.position + " " + count;
	}
}