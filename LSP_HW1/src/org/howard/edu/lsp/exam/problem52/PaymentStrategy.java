package org.howard.edu.lsp.exam.problem52;

//define the PaymentStrategy interface
interface PaymentStrategy {
	void pay(double amount);
}

//create CreditPardPayment class
class CreditCardPayment implements PaymentStrategy {
	private String creditCardnum;
	
	public CreditCardPayment(String creditCardnum) {
	   this.creditCardnum = creditCardnum;
}

	@Override
	public void pay(double amount) {
	   //pay with credit card
	   System.out.println("Paid " + amount + " using credit card " + creditCardnum);
	}
}

//create PayPalPayment class
class PayPalPayment implements PaymentStrategy {
	private String email;
	
	public PayPalPayment(String email) {
	   this.email = email;
	}
	
	@Override
	public void pay(double amount) {
	   //pay with PayPal
	   System.out.println("Paid " + amount + " using PayPal account " + email);
	}
}

//create BitcoinPayment class
class BitcoinPayment implements PaymentStrategy {
	private String bitcoinAddress;
	
	public BitcoinPayment(String bitcoinAddress) {
	   this.bitcoinAddress = bitcoinAddress;
	}
	
	@Override
	public void pay(double amount) {
	   //pay with Bitcoin
	   System.out.println("Paid " + amount + " using Bitcoin address " + bitcoinAddress);
	}
}

//ShoppingCart class that uses a PaymentStrategy
class ShoppingCart {
	//PaymentStrategy instance
	private PaymentStrategy paymentStrategy;
	
	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
	   this.paymentStrategy = paymentStrategy;
	}
	
	//pays the amount using the specific strategy
	public void checkout(double amount) {
	   paymentStrategy.pay(amount);
	}
}
