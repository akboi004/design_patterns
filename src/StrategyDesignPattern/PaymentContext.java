package StrategyDesignPattern;

public class PaymentContext {

	private PaymentStrategy paymentStrategy;

	public void setPayment(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void payAmount(double amount) {
		if (paymentStrategy == null) {
			System.out.println("Payment Strategy Object not set !");
			return;
		}
		paymentStrategy.pay(amount);
	}
}
