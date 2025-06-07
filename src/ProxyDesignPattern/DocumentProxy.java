package ProxyDesignPattern;

public class DocumentProxy implements Document {

	private RealDocument realDocument;
	private String filename;
	private String userrole;

	public DocumentProxy(String filename, String userrole) {
		this.filename = filename;
		this.userrole = userrole;
	}

	@Override
	public void display() {
		if (userrole.equals("admin")) {
			if (realDocument == null) {
				realDocument = new RealDocument(filename);
			}
			realDocument.display();
		} else {
			System.out.println("Access denied: User role '" + userrole + "' cannot view this document.");
		}

	}

}
