package Java8Features.LambdaExpression;

public class BeforeLambda
{
   public static void main(String[] args)
   {
       Runnable r=new Runnable() {
           @Override
           public void run()
           {
               System.out.println("Thread is Running ....");
           }
       };

       Thread t=new Thread(r);
       t.start();
    }
}
