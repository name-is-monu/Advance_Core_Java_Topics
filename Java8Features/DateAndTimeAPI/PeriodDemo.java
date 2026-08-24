package Java8Features.DateAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo
{
   public static void main(String[] args)
   {
       LocalDate birthDate=LocalDate.parse("2005-10-06");
       LocalDate currentDate=LocalDate.now();

       //Difference Between >

       Period age=Period.between(birthDate , currentDate);
       System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, "+age.getDays()+" Days.");

    }
}
