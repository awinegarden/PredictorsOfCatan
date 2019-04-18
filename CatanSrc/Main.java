package CatanSrc;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		for(int i = 0; i < 100; i++) {
			Catan game = new Catan();
			game.playGame();
			Player Winner = game.getWinner();
			if(Winner == game.getPlayers()[0]) {
				System.out.println("Winner: 0 "  + " Rounds: " + game.getRound());
			}
			if(Winner == game.getPlayers()[1]) {
				System.out.println("Winner: 1 "  + " Rounds: " + game.getRound());
			}
			if(Winner == game.getPlayers()[2]) {
				System.out.println("Winner: 2 "  + " Rounds: " + game.getRound());
			}
			if(Winner == game.getPlayers()[3]) {
				System.out.println("Winner: 3 "  + " Rounds: " + game.getRound());
			}
		}

	}

}
