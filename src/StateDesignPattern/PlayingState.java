package StateDesignPattern;

public class PlayingState implements State {

	@Override
	public void pressButton(MediaPlayerContext context) {
		System.out.println("Pausing the music");
		context.setState(new PausedState());
	}

}
