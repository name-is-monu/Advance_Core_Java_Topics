package JavaInterface;

public class PayByCreditCard implements PaymentGateway
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Amount pay by Credit Card :"+amount);
    }
}
