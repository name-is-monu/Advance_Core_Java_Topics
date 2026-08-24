package Java8Features.LambdaExpression;

public class LambdaDemo
{
   public static void main(String[] args)
   {
       //addition using lambda

       Calculator add=(x , y)-> x+y;

       //Multiplication using Lambda

       Calculator mul=(x , y )->x*y;

       System.out.println("Addition :"+add.operate(10 , 30));
       System.out.println("Multiplication :"+mul.operate(10 , 30));

    }
}
