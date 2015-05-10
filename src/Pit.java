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
	
	/**
	 * Returns true if the pit is a store.
	 * @return isStore.
	 */
	public boolean isAStore()
	{
		return isStore;
	}
	/**
	 * Sets isStore to true if the pit is one of the two stores.
	 */
	public void setAStore()
	{
		isStore = true;
	}
	/**
	 * Returns true if it is player1's pits.
	 * @return isPlayer1.
	 */
	public boolean isPlayer1()
	{
		return isPlayer1;
	}
	
	/**
	 * Sets pit's value to true if it is on player1's side.
	 */
	public void setPlayer1()
	{
		isPlayer1 = true;
	}
	/**
	 * toString method for pit.
	 */
	public String toString(){
		return this.position + " " + count;
	}
}