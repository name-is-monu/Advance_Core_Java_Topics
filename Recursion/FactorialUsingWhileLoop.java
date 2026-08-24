package Recursion;

import java.util.Scanner;

public class FactorialUsingWhileLoop
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number :");

       int num=sc.nextInt();
       int fact=1;
       while (num!=0)
       {
           fact=fact*num;
           num--;
       }

       System.out.println("Yoru Factorial is :"+fact);
    }
}

/*Factorial means :-
     5!=5*4*3*2*1 =120
*/