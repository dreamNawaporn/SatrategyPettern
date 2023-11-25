
public class CashPayment implements PaymentSatrateg {

	@Override
	public void pay(int amount) {
		System.out.println("Paid by cash: "+ amount);

	}

}
