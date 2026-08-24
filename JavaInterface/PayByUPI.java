package JavaInterface;

public class PayByUPI implements PaymentGateway
{

    @Override
    public void pay(double amount)
    {
        System.out.println("Amount Pat By UPI :"+amount);
    }
}
