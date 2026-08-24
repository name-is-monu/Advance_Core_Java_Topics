package JavaInterface;

public class MainApp
{
   public static void main(String[] args)
   {
           //Payment By Lambda Expression
//           PaymentGateway paymentGateway=(amount)->
//           {
//               System.out.println("Amount Pay By UPI :"+amount);
//           } ;
//           paymentGateway.pay(50000.5000);


       //Payment By Anonymous Class:

//       PaymentGateway paymentGateway=new PaymentGateway()
//       {
//           @Override
//           public void pay(double amount)
//           {
//               System.out.println("Amount Pay Bay Net Banking .."+amount);
//           }
//       };
//       paymentGateway.pay(20000.3004);


       //Payment By Implemented class..

//       PaymentGateway pay=new PayByNetBanking(); //->Loose coupling be because hamse sirf new ke bad constructor pass karna hai Implemented class ka .
//       pay.pay(39383.4994);

//       PaymentGateway pay=new PayByCreditCard();
//       pay.pay(500000.0400);

//       PaymentGateway pay=new PayByUPI();
//       pay.pay(500000.0400);


   }
}
