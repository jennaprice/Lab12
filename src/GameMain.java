/**
 * Rochambo
 * 
 * @see java.lang.Object
 * @author Jenna Price @ Beta Date:Nov 6th, 2017
 */
public class GameMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Rock, Paper, Scissors!");
		String player1Name = Validator.getString("Please enter and name for player 1: ");
		System.out.println(player1Name);
		System.out.println("Who would you like to play against? ");

		Validator.closeScanner();

	}

}
