package JavaNewFeatures;

public class SwitchWithoutBeak2
{
   public static void main(String[] args)
   {
       String day = "Sunday";

       String time = switch (day) {
           case "Saturday", "Sunday" -> {
               System.out.println("Weekend schedule active");
               yield "11:00 am";
           }
           case "Monday", "Tuesday", "Wednesday" -> {
               System.out.println("Weekday schedule active");
               yield "8:00 am";
           }
           default -> {
               System.out.println("Default schedule active");
               yield "4:00 am";
           }
       };

       System.out.println("Final Time: " + time);
    }
}


/*Java 14 me me -> swith aaya hai jiski vahaj se hame break likhne ki jarirat nhi
padta hai jisko ham "Inhanced switch " bhi kahte hai.
Note : Agar hame case match hone par multiple kaam karna hai to ham
case {} ka use  kar skte hai.... Agar ham multiple line print karke ke baad agar kuchh
return karna chahate hai to "yield" keyword ka use kar skte hai...*/