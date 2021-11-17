package game;



import model.Pion;
import utilitaires.Utilitaires;

public class Game {

	String [][] board=new String[10][10];
	
public void game() {
	Utilitaires.draw_Board(board);
	Utilitaires.read_Board(board);
}
}
