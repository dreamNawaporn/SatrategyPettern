
public class ScanPayment implements PaymentSatrateg{

	@Override
	public void pay(int amount) {
		System.out.println("Paid by Scan QR code: "+ amount);
		
	}
	

}
