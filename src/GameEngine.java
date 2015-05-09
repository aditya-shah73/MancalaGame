import java.util.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GameEngine {
	final int BOARD_SIZE = 14;
	ArrayList<ChangeListener> listeners;
	Pit first;
	Pit last;
	int position = 0;
	Pit current;
	
	//true - Player1
	//false - Player2
	boolean player1Turn;

	// 0-5 Player 1
	// 7-12 Player 2

	/**
	 * This is the default constructor which initializes the back end.
	 */
	public GameEngine() {
		initiatePits();
		listeners = new ArrayList<ChangeListener>();
		current = first;
		player1Turn = true;
	}

	// first is a pit, last is a store
	private void initiatePits() {
		first = new Pit(); // Pit 1
		first.isPlayer1();
		first.position = 0;
		first.setPlayer1();
		first.count = 3;
		first.next = new Pit(); //Pit2
		current = first.next;
		current.setPlayer1();
		current.position = 1;
		current.count = 3;
		current.next = new Pit(); // Pit 3
		current = current.next;
		current.position = 2;
		current.setPlayer1();
		current.count = 3;

		for (int i = 0; i < BOARD_SIZE - 3; i++) {
			Pit p = new Pit();
			current.next = p;
			current = current.next;
			current.position = i + 3;
			current.count = 3;
			if (i <= 3) {
				current.setPlayer1();

			} else if (i == BOARD_SIZE - 4) {
				last = current;
				last.setAStore();
				last.next = first;
				last.count = 0;
				break;
			}
			if (i == 3) {
				current.setAStore();
				current.count = 0;
			}
			//current = current.next;
		}
		//printList();
	}

	public void nextPit() {
		current = current.next;
	}

	// marbles move anti-clockwise
	// if last marble is moved into a store then you move again
	// weird rule later
	public void distribute(Pit p) {
		current = p;
		int count = p.count;
		current.count = 0;
		
		for (int i = 0; i < count; i++) {
			nextPit();
			if (current.isAStore()) {
				if(player1Turn && current == last){
					nextPit();
				}else if(!player1Turn && current != last){
					nextPit();
				}
			}
			
			if (current.next.count == 0) {
				// Implement later
			}
			current.count++;
		}
		printList();
	}

	public void attach(ChangeListener l) {
		listeners.add(l);
	}

	public boolean hasNextPit() {
		if (current.next != null)
			return true;
		else
			return false;
	}

	public void update(Pit p) {
		distribute(p);
		for (ChangeListener l : listeners) {
			l.stateChanged(new ChangeEvent(this));
		}
	}

	public void printList() {
		current = first;
		for (int i = 0; i < 14; i++) {
			System.out.println(current);
			nextPit();
		}
	}

}