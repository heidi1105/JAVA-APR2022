package com.heidichen.abstractdemo;

public class PaymentTest {

	public static void main(String[] args) {
//		Payment laptop = new Payment(1000);
		CashPayment taco = new CashPayment(1.5);
		taco.paymentDetails();
		
		CreditCardPayment laptop=  new CreditCardPayment(2000, "4242424242424242", "Heidi Chen", "8/22");
		laptop.paymentDetails();

	}

}
