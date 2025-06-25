package StrategyDesignPattern;

public class ClientCode {

	public static void main(String[] args) {
		PaymentContext context = new PaymentContext();
		context.setPayment(new CreditCardPayment());
		context.payAmount(2000.00);

		context.setPayment(new GPayPayment());
		context.payAmount(5000.00);
	}
}
