
public class ShoppingCart{
	private PaymentSatrateg paymentSatrateg;
	
	public ShoppingCart() {
		this.paymentSatrateg = new CashPayment();
	}
	
	public void setPaymentSatrateg(PaymentSatrateg strategy) {
		this.paymentSatrateg = strategy;
	}
	
	public void checout(int amount) {
		paymentSatrateg.pay(amount);
	}
	
}
