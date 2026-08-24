package Java8Features.QuestionSolved;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerDefaultMethods
{
   public static void main(String[] args)
   {
      Consumer<String> name=(n)-> System.out.println("Original "+n);
      Consumer<String> upperName=(n)-> System.out.println("Upper Case "+n.toUpperCase());

      Consumer<String> finalResult=name.andThen(upperName);
       finalResult.accept("Monu Kumar");

   }
}
/*Consumer Interface Default Methods:
      -Default Method :- andThen()
    -andThen() मेथड (एक के बाद दूसरा ऑपरेशन चलाना)
    अगर आपके पास दो या दो से ज्यादा ऐसे काम हैं जो एक ही डेटा पर बारी-बारी से परफॉर्म होने चाहिए (और
    कुछ रिटर्न नहीं करना चाहते), तो आप consumer1.andThen(consumer2) का उपयोग करते हैं।
    इसमें पहले consumer1 चलता है, और उसके तुरंत बाद consumer2 उसी डेटा पर चलता है।
    -फ्लो (Flow): Input ➔ Consumer 1 (काम 1 करो) ➔ Consumer 2 (काम 2 करो)
*/