package StrategyDesignPattern;

public class CreditCardPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("Payed via CreditCard of amount: " + amount);

	}

}
