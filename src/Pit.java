import java.util.ArrayList;

public class Pit
{
	private ArrayList<Marble> storage;
	public boolean isPit;
	int count;
	
	public Pit()
	{
		storage = new ArrayList<Marble>();
		count = 0;
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
	
	public boolean isAPit()
	{
		return isPit;
	}
}
