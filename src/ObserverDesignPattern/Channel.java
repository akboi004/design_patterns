package ObserverDesignPattern;

public interface Channel {

	public void subscribe(Subscriber subscriber);

	public void unsubscribe(Subscriber unsubscriber);

	public void notifySubscribers(String videoTitle);
}
