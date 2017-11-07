
public abstract class Player {

	String name;
	Roshambo state;

	public abstract String generateRashamboValue();

	// it could take in a player then you would knwo the name of the person who won
	// and how many times they had won
	public static String matchPlay(Roshambo playone, Roshambo playtwo) {
		String message = "";
		if ((playone.ordinal() == 0 && playtwo.ordinal() == 1) || (playone.ordinal() == 1 && playtwo.ordinal() == 0)) {
			message = "Paper beats Rock";
		} else if ((playone.ordinal() == 0 && playtwo.ordinal() == 2)
				|| (playone.ordinal() == 2 && playtwo.ordinal() == 0)) {
			message = "Rock beats Scissors";
		} else if ((playone.ordinal() == 1 && playtwo.ordinal() == 2)
				|| (playone.ordinal() == 2 && playtwo.ordinal() == 1)) {
			message = "Scissors beats Paper";
		} else
			message = "Players have tied with " + playone.toString();
		return message;
	}

}
