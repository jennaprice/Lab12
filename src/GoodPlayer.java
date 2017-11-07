import java.util.Random;

public class GoodPlayer extends Player {

	public GoodPlayer(String name) {
		this.name = name;
	}

	@Override
	public String generateRashamboValue() {
		Random generator = new Random();
		int testState = generator.nextInt(2);
		switch (testState) {
		case 0:
			state = Roshambo.ROCK;
			break;
		case 1:
			state = Roshambo.PAPER;
			break;
		case 2:
			state = Roshambo.SCISSORS;
			break;
		}
		return state.toString();
	}

}
