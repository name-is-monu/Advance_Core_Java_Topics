package EnumInjava;

public enum WeekDay
{
    SUNDAY(1, "Today is Holyday do fun .."),
    MONDAY(2 , "Today is working day do work "),
    TUESDAY(3, "Not Eat non - veg "),
    WEDNESDAY(4,"Today is working day do work"),
    THURSDAY(5,"Today is working day do work"),
    FRIDAY(6 , "Today is working day do work"),
    SATURDAY(7 ,"Today is holiday do fun " );

    //Fieelds
    private final int dayCount;
    private final String dayQuote;

    private WeekDay(int dayCount , String dayQuote)
        {
          this.dayCount=dayCount;
          this.dayQuote=dayQuote;
        }

     //main method
    public static void main(String[] args)
    {
//       WeekDay status=WeekDay.SATURDAY;
        WeekDay status=WeekDay.MONDAY;

       //Enhanced Switch Expression या Arrow Switch कहा जाता है।
        String message=switch (status)
       {
           case SUNDAY ->
           {
               System.out.println(status.dayQuote);
               yield "Relax"; //value treturn karne ke liye use hota hai
           }
           case MONDAY ->
           {
               System.out.println(status.dayQuote);
               yield "work";
           }
           case TUESDAY ->
           {
               System.out.println(status.dayCount);
               yield "work";
           }
           case WEDNESDAY ->
           {
               System.out.println(status.dayCount);
               yield "work";
           }
           case THURSDAY-> {
               System.out.println(status.dayCount);
               yield "work";
           }
           case FRIDAY ->
           {
               System.out.println(status.dayQuote);
               yield "work";
           }
           case SATURDAY ->
           {
               System.out.println(status.dayQuote);
               yield "Relax";
           }
           default ->
           {
               System.out.println("fail to load day ...");
               yield "Not Valid ";
           }
       };
        System.out.println(message);

     }

}

/*Es Inhance Switch or Arrow switch me ek statement ho to {} lagane ki jarurat nhi hai.
 Aye Agar kuchh return karna hai to ham "yield" keyword ka use karte hai.
 Note : Esme hame purane swith ke liye break lagane ki jarurat nhi hai.*/