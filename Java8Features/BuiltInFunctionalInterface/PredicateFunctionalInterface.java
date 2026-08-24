package Java8Features.BuiltInFunctionalInterface;

import java.util.function.Predicate;

public class PredicateFunctionalInterface
{
   public static void main(String[] args)
   {
       //Use Of Predicate Functional Interface:

       Predicate<Integer> isGreaterThan10=(n)->n>10;
       boolean b=isGreaterThan10.test(100);
       System.out.println(b);
    }
}


/*Predicate Functional Interface:-
    ->1. Predicate (चेक करने के लिए - True/False)
    -यह क्या करता है: यह एक इनपुट लेता है और एक शर्त (Condition) चेक करके हमेशा boolean (true
    या false) रिटर्न करता है।
    -> इसकी एब्स्ट्रैक्ट मेथड:
           boolean test(T t);

    -कहाँ इस्तेमाल होता है: फिल्टरिंग करने के लिए (जैसे—क्या यह नंबर सम है? क्या यूजर की उम्र 18 से ज्यादा है?)।

*/