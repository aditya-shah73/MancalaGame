import java.util.*;

//This is a sample comment.

public class GameEngine implements ListIterator<Pit> {
	private LinkedList<Pit> positions;

	public GameEngine() {
		positions = new LinkedList<Pit>();
		createPits();

	}

	private void createPits() {
		for (int i = 0; i < 14; i++) {
			if (i == 6 || i == 13)
				positions.add(new Store());
			else
				positions.add(new Pit());
		}
	}

	@Override
	public void add(Pit p) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPrevious() {
		return false;
	}

	@Override
	public Pit next() {
		return null;
	}

	@Override
	public int nextIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Pit previous() {
		return null;
	}

	@Override
	public int previousIndex() {
		return 0;
	}

	@Override
	public void remove() {
	}

	@Override
	public void set(Pit p) {
	}
}
