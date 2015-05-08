import javax.swing.JFrame;


public class MancalaTester {
	public static void main(String[] args) {

		GameEngine ge = new GameEngine();
		
		JFrame frame = new GameFrame(ge);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//		
//		Board1 wood = new Board1();	
//		wood.makeBoard();
//		//wood.addMarbleToBoard(wood.pit1, 0, 0, 1);
//		
//		//Settings s = new Settings();
//		//s.drawFrame();
	    }

}
