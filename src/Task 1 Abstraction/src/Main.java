//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Payment payWithCreditCard=new CreditCardPayment();
        payWithCreditCard.pay(100.12);
        Payment payWithPayPal=new PayPalPayment();
        payWithPayPal.pay(200.40);
    }
}