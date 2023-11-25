
public class CredicardPayment implements PaymentSatrateg {

	@Override
	public void pay(int amount) {
		System.out.println("Paid by credit card: "+ amount);
	}

}
