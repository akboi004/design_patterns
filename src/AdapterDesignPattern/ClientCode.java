package AdapterDesignPattern;

public class ClientCode {

	public static void main(String[] args) {
		ExternalJsonService service = new ExternalJsonService();
		XmlDataProvider adapter = new AdapterClass(service);

		System.out.println("XML OUTPUT: ");
		System.out.println(adapter.getXmlData());

	}
}
