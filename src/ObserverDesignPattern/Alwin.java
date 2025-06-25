package ObserverDesignPattern;

public class Alwin implements Subscriber {

	@Override
	public void update(String title) {
		System.out.println("Alwin got notified: New Video - " + title);
	}

}
