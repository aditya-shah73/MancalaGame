import java.util.*;

import javax.swing.event.ChangeListener;


public class GameEngine implements Iterator<Pit> {
	
	private final int BOARD_SIZE = 14;
	
	ArrayList<ChangeListener> listeners;
	ArrayList<Pit> list;
	Pit first;
	int position = 0;
	
	/**
	 * This is the default constructor which initializes the back end.
	 */
	public GameEngine(){
		list = new ArrayList<Pit>(BOARD_SIZE);
		first = list.get(0);
		initiatePits();
	}
	
	private void initiatePits(){
		
		for(int i = 0; i < BOARD_SIZE; i++){
			list.set(i, new Pit());
		}
		list.get(BOARD_SIZE/2).isPit = true;
		list.get(BOARD_SIZE-1).isPit = true;
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Pit next() {
		// TODO Auto-generated method stub
		if(position == list.size()){
			position = 0;
			return list.get(0);
		}else
			return list.get(++position);
	}

	@Override
	public void remove()
	{
		//No need to remove any pits
	}
	
	public void attach(ChangeListener l){
		listeners.add(l);
	}
}
