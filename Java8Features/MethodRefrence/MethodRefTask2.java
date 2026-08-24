package Java8Features.MethodRefrence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRefTask2
{
   public static void main(String[] args)
   {
       List<String> names= Arrays.asList("monu", "rahul", "amit", "sonal");
       List<String> UpperCaseName =names.stream()
               .map(String::toUpperCase)
               .collect(Collectors.toList());

       //print names:

       UpperCaseName.forEach(System.out::println);

    }
}
