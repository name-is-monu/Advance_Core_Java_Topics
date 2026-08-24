package Java8Features.BuiltInFunctionalInterface;

import java.util.function.Function;

public class FunctionFunctionalInterface
{
   public static void main(String[] args)
    {
        //Functional Interface Use :
//        Function<String , Integer> strLen=(str)->str.length();
//         Integer len =strLen.apply("Monu Kumar");
//        System.out.println("Length of String ."+len);

        //String Reverse Usnig Functional Interface and Lambda Expression.
        Function<String , String> revString=(str)->
        {
            String rev="";
            for(int i=str.length()-1 ; i>=0 ;i--)
            {
                rev=rev+str.charAt(i);
            }
            return rev;
        };

       String name=revString.apply("Monu Kumar");
        System.out.println("Reverse Name :"+name);
    }
}

/*
=> Function<T, R> (बदलाव करने के लिए - Transformation)
  -यह क्या करता है: यह एक प्रकार का डेटा (T) इनपुट लेता है, उस पर कुछ ऑपरेशन करता है,
   और किसी दूसरे प्रकार का डेटा (R) आउटपुट (Return) करता है। Note : ye same Type ka bhi
     Data return karta hai Jaise Hamne Function<String , String > kiya hai.
   (यानी इनपुट कुछ और, आउटपुट कुछ और!)
  -इसकी एब्स्ट्रैक्ट मेथड:
         R apply(T t);

   -कहाँ इस्तेमाल होता है: मैपिंग करने के लिए (जैसे—एक स्ट्रिंग लेना और उसकी लंबाई (Integer) रिटर्न
   करना, या सारे नामों को अपरकेस में बदलना)।
*/