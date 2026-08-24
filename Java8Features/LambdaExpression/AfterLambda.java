package Java8Features.LambdaExpression;

public class AfterLambda
{
   public static void main(String[] args)
   {
//       Thread t1=new Thread(()->{
//           System.out.println("Thread is Running ...");
//       });
//      t1.start();

       Runnable r=()-> System.out.println("Thread is Running ..");
       Thread t1=new Thread(r);
       t1.start();
    }
}
