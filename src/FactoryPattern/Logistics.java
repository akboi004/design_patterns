package FactoryPattern;

//factory class
public abstract class Logistics {

	//factory method
	public abstract Transport createTransport();

	public void planDelivery() {
		Transport transport = createTransport();
		transport.deliver();
	}
}
