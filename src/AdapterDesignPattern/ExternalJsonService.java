package AdapterDesignPattern;

public class ExternalJsonService implements XmlDataProvider {

	@Override
	public String getXmlData() {
		return "{\"name\": \"Alu\", \"role\": \"Developer\"}";
	}
}
