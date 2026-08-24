package JavaInterface;

public class PayByDebitCard implements PaymentGateway
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Amount Pay Bay Debit Card :"+amount);
    }
}
