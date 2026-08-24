package JavaNewFeatures;

public class SwitchWithBreak
{
   public static void main(String[] args)
   {
       String day="Sunday";
       String time="";
       switch (day)
       {
           case "Saturday" , "Sunday":
               time="11:00 am ";
               break;

           case "Monday" , "Tuesday" , "Wednesday":
               time="8:00 am ";
               break;

           case "Thursaday":
               time="6:00 am ";
                break;
           default:
               time="4:00 am ";
       }

       System.out.println(time);
    }
}

/*Ysah hai Switch with break keyword ...*/