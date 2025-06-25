package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel {

	List<Subscriber> subscribers = new ArrayList<>();

	@Override
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void unsubscribe(Subscriber unsubscriber) {
		subscribers.remove(unsubscriber);

	}

	@Override
	public void notifySubscribers(String videoTitle) {
		for (Subscriber sub : subscribers) {
			sub.update(videoTitle);
		}
	}

	public void uploadVideo(String videoTitle) {
		System.out.println("Uploaded new video: " + videoTitle);
		notifySubscribers(videoTitle);
	}

}
