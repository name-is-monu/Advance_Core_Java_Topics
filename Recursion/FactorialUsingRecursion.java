package Recursion;

import java.util.Scanner;

public class FactorialUsingRecursion
{
    public static int fact(int num)
    {
        if(num==1)
            return 1;
        return num * fact(num-1);
    }

   public static void main(String[] args)
   {
       try
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a number :");
           int no=sc.nextInt();

           int result=FactorialUsingRecursion.fact(no);
           System.out.println("Factorial is :"+result);
       }
       catch (Exception e)
       {
           System.out.println(e.getMessage());
       }
    }
}

/*Factorial Using Recursion me Ham kis rule ko fiollow karte hai .
 Simple me => 5!=5*4*3*2*1    hota hai

   But ye ye bhi to ho skta hai.
   => 5!
     -> 5*4!
     ->4*3!
     ->3*2!
     ->2*1!

   Yese bhi to ho skta hai Esi liye ham es function me ye logic likhe hai.
*/