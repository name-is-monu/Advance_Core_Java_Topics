package JavaNewFeatures;

public class SwitchWithoutBeak
{
   public static void main(String[] args)
   {
       String day="Monday";
       String time="";
       switch (day)
       {
           case "Saturday" , "Sunday"->
               time="11:00 am ";

           case "Monday" , "Tuesday" , "Wednesday" ->
               time="8:00 am ";

           case "Thursaday"->
               time="6:00 am ";

           default ->
               time="4:00 am ";
       }

       System.out.println(time);
    }
}


/*Java 14 me me -> swith aaya hai jiski vahaj se hame break likhne ki jarirat nhi
padta hai jisko ham "Inhanced switch " bhi kahte hai.*/