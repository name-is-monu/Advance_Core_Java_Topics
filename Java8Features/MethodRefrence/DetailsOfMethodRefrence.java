package Java8Features.MethodRefrence;

import java.util.Arrays;
import java.util.List;

public class DetailsOfMethodRefrence
{
   public static void main(String[] args)
   {
       //Lambda vs Method Reference :-
       /*Q1: Hamare Pass List of String hai jisko hame screen par print karn hai.*/

       //Using Lambda Expression :-

//       List<String> names= Arrays.asList("monu" , "radha" , "kajal" , "Punkey" , "sonal");
      // names.forEach((name)-> System.out.println(name));


       //Using Methdo Reference

       List<String> names= Arrays.asList("monu" , "radha" , "kajal" , "Punkey" , "sonal");
       names.forEach(System.out::println);

       /*Yah bhi kaam vahi kar rha hai But code readable and chhota ho gaya hai
         Method Reference ka use tab kiya jata hai Jab ham Pahale se bane method ko call
         karna ho */

    }
}
/*Method Reference :-
     1. Method Reference क्या है? (What is it?)
        -परिभाषा: Method Reference असल में Lambda Expression का ही एक छोटा और साफ रूप (Shorthand/Alternative) है।
        -जब कोई लैम्ब्डा एक्सप्रेशन सिर्फ किसी पहले से बनी हुई मेथड को कॉल करने का काम कर रहा हो,
        तो लैम्ब्डा लिखने के बजाय हम सीधे उस मेथड का रेफरेंस (Reference/पत्ता) पास कर देते हैं।
      ->इसका सिंटैक्स बहुत आसान है:
                       ClassName::methodName

           (इसमें :: ऑपरेटर का इस्तेमाल होता है, जिसे Scope Resolution या Method Reference ऑपरेटर कहते हैं)

      4. Method Reference कितने प्रकार के होते हैं? (Types)
        ->जावा में मुख्य रूप से Method Reference 4 प्रकार के होते हैं:
           -क. Static Method का Reference
            सिंटैक्स: ClassName::staticMethodName
            कब इस्तेमाल करें: जब आप किसी क्लास की स्टैटिक मेथड को रेफर करना चाहें।
            उदाहरण:
             // लैम्ब्डा: n -> Math.abs(n)
             // Method Reference:
             Function<Integer, Integer> absFunction = Math::abs;

         ख. Instance Method (किसी खास ऑब्जेक्ट की) का Reference
           -सिंटैक्स: objectReference::instanceMethodName
           ब इस्तेमाल करें: जब आपके पास पहले से कोई ऑब्जेक्ट बना हुआ हो और उसकी मेथड को कॉल करना हो।
           उदाहरण:
              -String str = "Hello";
               // लैम्ब्डा: () -> str.toLowerCase()
               // Method Reference:
                 Supplier<String> stringSupplier = str::toLowerCase;

          ग. किसी Arbitrary (अज्ञात) Object की Instance Method का Reference
          सिंटैक्स: ClassName::instanceMethodName
          कब इस्तेमाल करें: यह थोड़ा ट्रिकी है। जब लैम्ब्डा का पहला पैरामीटर खुद उस मेथड का कॉलर (Caller) बन जाता है।
          -// लैम्ब्डा: (String s) -> s.toUpperCase()
          // Method Reference (यहाँ String क्लास का नाम है, ऑब्जेक्ट नहीं):
            Function<String, String> upperFunction = String::toUpperCase;

     घ. Constructor का Reference (new का उपयोग)
      -सिंटैक्स: ClassName::new
      -कब इस्तेमाल करें: जब आपको किसी क्लास का नया ऑब्जेक्ट (New instance) बनाना हो।
      उदाहरण:
       // लैम्ब्डा: () -> new ArrayList<>()
       // Method Reference:
       Supplier<List<String>> listSupplier = ArrayList::new;

*/