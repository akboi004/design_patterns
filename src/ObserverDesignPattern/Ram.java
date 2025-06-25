package ObserverDesignPattern;

public class Ram implements Subscriber {

	@Override
	public void update(String title) {
		System.out.println("Ram got notified: New Video - " + title);
	}

}
