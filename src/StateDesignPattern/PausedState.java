package StateDesignPattern;

public class PausedState implements State {

	@Override
	public void pressButton(MediaPlayerContext context) {
		System.out.println("Resuming the music");
		context.setState(new PlayingState());
	}

}
