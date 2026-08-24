package JavaInterface;

@FunctionalInterface
public interface PaymentGateway
{
   void pay(double amount);
}


/*
    Suppose hamre pass Payments karne ke 4 tarike hai
    1. PayByUPI  2.PayByNetBanking  3.PayByCreditCard  4.PayByDebitCard

    - En sabko Ek ammont pay karna hai . To sab me void pay(double amount) methods
     banane se accha hai ham ek interface banaye jisme ek void pay(double amount);
     nam ka abstract method ho . Jisko ye sabhi classes Implements karegi
     jisde enko es pay method ko implemenst karna mist ho jaye ha
     ye apne apne tarike se esko implemets kar legi fir jaha bhi Payment ki
     jarurat hoga Jaha bhi hame PaymentGateway ki jarirat hogi ham En charo me
     se aasani se kisi bhi Payment method ka pay method pass kar skte hai.
     Jisko Loose Coupling kahte hai .
     Agar ham interface nhi banate to Agar har ek class ke liye Uska khud ka pay()
     method banate to uar esko har jagah pass karte to ye tight coupling ho jata .

*/