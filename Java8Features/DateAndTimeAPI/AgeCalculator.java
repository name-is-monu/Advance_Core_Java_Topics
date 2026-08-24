package Java8Features.DateAndTimeAPI;

import Java8Features.LambdaExpression.Calculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class AgeCalculator
{

    public static boolean isEligible(int age )
    {
        if(age>=18)
        {
            return true;
        }
        return false;
    }

   public static void main(String[] args)
   {

       //Pase Date of Birth ..
       LocalDate birthDate=LocalDate.parse("2000-08-15");
       System.out.println("Given Birth Date :"+birthDate);

       //Current Date

       LocalDate currentDate=LocalDate.now();
       System.out.println("Current Date :"+currentDate);

       //Different Between :-

       Period age=Period.between(birthDate , currentDate);
       System.out.println("Exact Age :"+age.getYears()+" years , "+age.getMonths()+" months , "+age.getDays()+" Days .");


       //Toral Days Lived :
        long days=ChronoUnit.DAYS.between(birthDate , currentDate);
       System.out.println("Total Days Lived :"+days);


       //isEligible for vote :-

       boolean b=AgeCalculator.isEligible(age.getYears());

       if(b)
       {
           System.out.println("Is Eligible to Vote: "+b);
       }
       else
       {
           System.out.println("Is Eligible to Vote:"+b);
       }

    }
}
