package Java8Features.LambdaExpression;

import java.util.Scanner;

public class StringReverseImpClass
{
   public static void main(String[] args)
   {
       //Reverse String Using Lambda Expression :

       StringReverse reverse=(str)->
       {
           String rev="";
            for(int i=str.length()-1 ; i>=0 ;i--)
            {
                rev=rev+str.charAt(i);
            }
            return rev;
       };


       //Call method reverse() method.

       String yesNo;
     do{
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a String ...");
         String s =sc.nextLine();
         String rev =reverse.reverse(s);
         System.out.println("Reverse String is :-" +rev);
         System.out.println("Do you want to continue press Y or y");
          yesNo=sc.nextLine();
     }while (yesNo.equalsIgnoreCase("Y"));

    }
}
