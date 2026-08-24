package JavaInterface;

public class PayByNetBanking implements PaymentGateway
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Amount Pay by Net Banking :"+amount);
    }
}
