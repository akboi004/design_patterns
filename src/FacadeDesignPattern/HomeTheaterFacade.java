package FacadeDesignPattern;

public class HomeTheaterFacade {

	private Tv tv;
	private Lights lights;
	private SoundSystems soundSystems;
	private StreamingApp streamingApp;

	public HomeTheaterFacade() {
		this.lights = new Lights();
		this.tv = new Tv();
		this.soundSystems = new SoundSystems();
		this.streamingApp = new StreamingApp();
	}

	public void watchMovie(String movie) {
		System.out.println("Getting ready to watch movie..");
		tv.on();
		soundSystems.on();
		soundSystems.setVolume(10);
		streamingApp.open();
		streamingApp.play(movie);
		lights.dim();
	}

	public void endMovie() {
		System.out.println("Shutting down...");
		tv.off();
	}
}
