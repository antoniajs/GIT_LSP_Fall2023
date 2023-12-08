/**
 * The Driver class serves as the driver program to test the PaymentStrategy class.
 * 
 * @author Antonia
 * @version 1.0
 */

package org.howard.edu.lsp.exam.problem52;

public class PaymentStrategyDriver {
 public static void main(String[] args) {
     ShoppingCart cart = new ShoppingCart();

     //pay with credit card
     cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
     cart.checkout(100.0);

     //pay with PayPal
     cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
     cart.checkout(50.0);

     //pay with Bitcoin
     cart.setPaymentStrategy(new BitcoinPayment("1AaBbCcDdEeFfGgHh"));
     cart.checkout(75.0);
 }
}