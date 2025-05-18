package FactoryPattern;

public class ClientCode {

	public static void main(String[] args) {
		Logistics roadLogistics = new RoadLogistics();
		roadLogistics.planDelivery();

		Logistics shipLogistics = new ShipLogistics();
		shipLogistics.planDelivery();
	}
}
