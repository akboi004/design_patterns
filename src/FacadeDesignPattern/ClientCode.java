package FacadeDesignPattern;

public class ClientCode {

	public static void main(String[] args) {
		HomeTheaterFacade facade = new HomeTheaterFacade();
		facade.watchMovie("Theri");
	}
}
