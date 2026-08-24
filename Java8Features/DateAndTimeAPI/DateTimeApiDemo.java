package Java8Features.DateAndTimeAPI;

import java.time.*;

public class DateTimeApiDemo
{
   public static void main(String[] args)
   {
       // 1. आज की तारीख (Current Date) निकालना
       LocalDate today=LocalDate.now();
       System.out.println("Current Date :"+today);  // आउटपुट: 2026-08-11 (सिस्टम की तारीख के अनुसार)

       // 2. अभी का समय (Current Time) निकालना

       LocalTime time=LocalTime.now();
       System.out.println("Current Time :"+time);  //Current Time :09:02:09.642919700

       // 3. तारीख और समय दोनों एक साथ (Current Date and Time)
       LocalDateTime dateTime=LocalDateTime.now();
       System.out.println("Date and Time Both :"+dateTime);   //Date and Time Both :2026-08-11T09:04:12.532878800

       // 4. किसी दूसरे देश/क्षेत्र का टाइमज़ोन देखना (जैसे अमेरिका का न्यूयॉर्क)
       ZonedDateTime nyTime=ZonedDateTime.now(ZoneId.of("America/New_York"));
       System.out.println("New York Time :"+nyTime); //New York Time :2026-08-10T23:36:54.250588300-04:00[America/New_York]


       // 5. भविष्य या अतीत की तारीख निकालना (Date Manipulation)
       LocalDate futuredDate=today.plusDays(15); // आज से 15 Age ki Tarikh
       System.out.println("After 15 days :"+futuredDate);   //2026-08-26

       LocalDate pastDate=today.minusMonths(2);
       System.out.println("2 Month Ago :"+pastDate); //2026-06-11


    }
}
