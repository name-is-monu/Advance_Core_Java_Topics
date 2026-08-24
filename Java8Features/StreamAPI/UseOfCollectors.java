package Java8Features.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UseOfCollectors
{
   public static void main(String[] args)
   {
       List<String> names= Arrays.asList("Monu" , "Sonu" , "Ajay" , "Rohan" , "Monu" ,"Ajay" );
              Set<String> name = names.stream()
                       .collect(Collectors.toSet());

       System.out.println(name);
       //[Sonu, Monu, Ajay, Rohan]
    }
}


/*
 => Collectors ek Utility class hai for the Collection jo Stream me use hota hai.
 Collectors Java Streams API ka ek helper/utility class hai,
 jo functional programming ke concepts standard Java collections me badalne me madad karta hai.
Stream se milne wale data ko kisi doosre data structure (jaise List, Set, ya Map) me
 convert karne ke liye Collectors ke built-in methods ka use kiya jata hai.

 => Jaise Upar Ek List<String> names ka hai useko ham set me convert karna chahate hai jo sirf Unique name
  hi hold kare....
 */