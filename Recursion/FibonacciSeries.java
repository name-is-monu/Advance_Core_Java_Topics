package Recursion;

public class FibonacciSeries
{
   public static void main(String[] args)
   {
       int num=0;
       int no1=0;
       int no2=1;
       System.out.print(no1+" , ");
       System.out.print(no2+" , ");
       while (num < 9 )
       {
           int fibonacci=no1+no2;
           System.out.print(fibonacci+" , ");
           no1=no2;
           no2=fibonacci;

           num++;
       }

    }
}


/*Fibonacci :-
    ->  0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 ........
 => Note : Fibonacci Series me 0 & 1 fixed number hote hai .
    aur Esme Har agala number apne two pichhale number ka addition hota hai.

*/