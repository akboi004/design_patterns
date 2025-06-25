package StrategyDesignPattern;

public class GPayPayment implements PaymentStrategy {

	@Override
	public void pay(double ammount) {
		System.out.println("Payment done with GPay service of amount: " + ammount);

	}

}
