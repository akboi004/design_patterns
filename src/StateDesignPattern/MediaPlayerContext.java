package StateDesignPattern;

public class MediaPlayerContext {

	private State state;

	public void setState(State state) {
		this.state = state;
	}

	public void pressButton() {
		state.pressButton(this);
	}
}
