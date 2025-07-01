package StateDesignPattern;

public class ClientCode {

	public static void main(String[] args) {
		MediaPlayerContext context = new MediaPlayerContext();
		State playingState = new PlayingState();
		State pausedState = new PausedState();
		context.setState(pausedState);

		// based on the state I can form different behaviors by calling the same method.
		context.pressButton();
		context.pressButton();
		context.pressButton();
	}
}
