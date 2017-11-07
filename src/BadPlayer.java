
public class BadPlayer extends Player {

	public BadPlayer(String name) {
		this.name = name;
	}

	@Override
	public String generateRashamboValue() {
		state = Roshambo.ROCK;// Bad Player always
		return state.toString();
	}

}
