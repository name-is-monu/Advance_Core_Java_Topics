package JavaNewFeatures;

public class SwitchWithoutBeak1
{
   public static void main(String[] args)
   {
       String day = "Sunday";

       switch (day) {
           case "Saturday", "Sunday" -> {
               System.out.println("Weekend hai!");
               System.out.println("Time hai:");
               System.out.println("11:00 am");
           }
           case "Monday", "Tuesday", "Wednesday" -> {
               System.out.println("Weekday hai!");
               System.out.println("Time hai:");
               System.out.println("8:00 am");
           }
           default -> {
               System.out.println("Normal day!");
               System.out.println("4:00 am");
           }
       }
    }
}


/*Java 14 me me -> swith aaya hai jiski vahaj se hame break likhne ki jarirat nhi
padta hai jisko ham "Inhanced switch " bhi kahte hai.
Note : Agar hame case match hone par multiple kaam karna hai to ham
case {} ka use  kar skte hai....*/