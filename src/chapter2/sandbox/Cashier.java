package chapter2.sandbox;

/**
 * Play with functional interfaces.
 * @author Elizabeth Berg
 */
public class Cashier {

    public void cashIn(Payment payment) {
        payment.perform();
    }

    public static void main(String[] args) {
        Cashier cashier = new Cashier();
        Payment lambdaPayment = () -> System.out.println("Would you like your receipt?");
        cashier.cashIn(lambdaPayment);
    }
}
