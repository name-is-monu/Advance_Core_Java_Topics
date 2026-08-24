package Java8Features.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo
{
   public static void main(String[] args)
   {
       List<String> names= Arrays.asList("Monu", "Rahul", "Amit", "Manish", "Rohit");

       List<String> filteredNames=names.stream()
               .filter((name)-> name.startsWith("M"))
               .map((name)->name.toUpperCase())
               .sorted()
               .collect(Collectors.toList());

       for(String name : filteredNames)
       {
           System.out.print(name+" , ");
       }

    }
}
