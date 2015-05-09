import java.util.ArrayList;

public class Pit
{
	private ArrayList<Marble> storage;
	private boolean isStore;
	private boolean isPlayer1;
	int count;
	Pit next;
	int position;
	
	public Pit()
	{
		isPlayer1 = false;
		isStore = false;
		storage = new ArrayList<Marble>();
		count = 4;
	}
	
	public void addMarble(Marble m)
	{
		storage.add(m);
		count++;
	}
	
	public void removeAll()
	{
		storage = new ArrayList<Marble>();
	}
	
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
}