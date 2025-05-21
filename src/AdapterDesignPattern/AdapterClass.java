package AdapterDesignPattern;

public class AdapterClass implements XmlDataProvider {

	ExternalJsonService externalservice;

	public AdapterClass(ExternalJsonService externalservice) {
		this.externalservice = externalservice;
	}

	@Override
	public String getXmlData() {
		String json = externalservice.getXmlData();
		json = json.replaceAll("[{}\"]", "");
		String[] keyValuePairs = json.split(",");

		StringBuilder xmlBuilder = new StringBuilder();
		for (String pair : keyValuePairs) {
			String[] entry = pair.split(":");
			String key = entry[0].trim();
			String value = entry[1].trim();
			xmlBuilder.append("<").append(key).append(">").append(value).append("</").append(key).append(">");
		}

		return xmlBuilder.toString();
	}

}
