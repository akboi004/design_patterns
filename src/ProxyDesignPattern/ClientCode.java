package ProxyDesignPattern;

public class ClientCode {

	public static void main(String[] args) {
		Document adminDoc = new DocumentProxy("adminImage.png", "admin");
		Document guestDoc = new DocumentProxy("guestImage.png", "guest");

		adminDoc.display();
		guestDoc.display();
	}
}
