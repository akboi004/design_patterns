package ObserverDesignPattern;

public class ClientCode {

	public static void main(String[] args) {
		YoutubeChannel channel = new YoutubeChannel();
		Subscriber subscriber1 = new Ram();
		Subscriber subscriber2 = new Alwin();

		channel.subscribe(subscriber1);
		channel.subscribe(subscriber2);

		channel.uploadVideo("Observer Design pattern");

		channel.unsubscribe(subscriber2);

		channel.uploadVideo("Chikutu Vibes");
	}
}
