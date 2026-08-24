package Java8Features.MethodRefrence;

import java.util.Arrays;
import java.util.List;

public class MethodRefChallenge
{
   public static void main(String[] args)
   {
       List<String> numbers= Arrays.asList("10" , "20" ,"30" ,"40" ,"50");

       //Use of Lambda Expression
//       numbers.stream()
//               .forEach((num)-> System.out.println(num));


       //1.User of Method Reference (Because Ye jo Lambda hai o Method ko sirf call kar rha hai Esko ham Method Reference se Replace kar skte hai)
//         numbers
//                 .forEach(System.out::println);   //yese bhi likh skte hai

          //2

       numbers.stream()
                 .forEach(System.out::println); //Esko yese bhi likh skte hai.
    }
}
