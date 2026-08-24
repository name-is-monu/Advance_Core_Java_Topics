package Recursion;

public class FibonacciUsingRecursion
{
    public static int fibo(int pos)
    {
        if(pos==0)
            return 0;
        if(pos==1 || pos==2)
            return 1;

        return fibo(pos-1)+fibo(pos-2);
    }
   public static void main(String[] args)
   {
       int post=8;
       int result=fibo(post);
       System.out.println("Fibonacci of "+post+" number is :"+result);

    }
}
