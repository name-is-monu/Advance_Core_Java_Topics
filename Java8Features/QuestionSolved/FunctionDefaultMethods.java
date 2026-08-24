package Java8Features.QuestionSolved;

import java.util.function.Function;

public class FunctionDefaultMethods
{
   public static void main(String[] args)
   {
//      //andThen() Method ka Use :
//       Function<Integer , Integer> add=(x)->x+2;
//       Function<Integer , Integer> mul=(x)->x*5;
//
//       //Pahale Add karo andThen multiply karo
//       Function<Integer , Integer> result=add.andThen(mul);
//       System.out.println(result.apply(100));


       //compose() methdo ka use :
       Function<Integer , Integer> add=(x)->x+2;
       Function<Integer , Integer> mul=(x)->x*5;

       //Pahale Mul then add
       Function<Integer , Integer> result=add.compose(mul);
       System.out.println(result.apply(100));



    }
}

/*Function interface Default Methods & static Methods :-
   ->Default Methods:- compose() , andThen()
   ->Static Method:-  identity()

   ->Function Chaining:
      -जब हमें एक से ज्यादा फंक्शन्स को आपस में इस तरह जोड़ना हो कि पहला फंक्शन जो आउटपुट दे,
      वह दूसरे फंक्शन का इनपुट बन जाए (इसे Function Chaining कहते हैं),
      तब इन डिफ़ॉल्ट और स्टैटिक मेथड्स का जादू शुरू होता है।

  1. andThen() मेथड (पहले यह करो, फिर वो करो)
     -यह कैसे काम करती है: इसमें function1.andThen(function2) लिखा जाता है। इसका मतलब है
     कि पहले function1 चलेगा, और उसका जो भी रिजल्ट (Output) आएगा, वह तुरंत function2
     को इनपुट के रूप में मिल जाएगा।

    -फ्लो (Flow): Input ➔ Function1 ➔ Result1 ➔ Function2 ➔ Final Output

2.compose() मेथड (उल्टा चलना - पहले दूसरा, फिर पहला)
   -यह कैसे काम करती है: यह andThen() से बिल्कुल उल्टी चलती है! इसमें
    function1.compose(function2) लिखा जाता है, जिसका मतलब है कि पहले function2
    चलेगा, और उसका रिजल्ट function1 को इनपुट के रूप में मिलेगा।

   - फ्लो (Flow): Input ➔ Function2 ➔ Result2 ➔ Function1 ➔ Final Output

3. identity() मेथड (Static Method - जैसा इनपुट, वैसा ही आउटपुट)
    -यह क्या करती है: यह Function इंटरफेस की एक Static मेथड है। इसका काम बहुत ही सीधा है—यह
    जो भी इनपुट (Input) लेती है, बिना उसमें कोई बदलाव किए हूबहू वही आउटपुट (Output) वापस लौटा देती है।
   -कहाँ इस्तेमाल होती है: यह अक्सर वहाँ काम आती है जहाँ प्रोग्रामिंग के नियमों के हिसाब से हमें एक
   Function पास करना ही होता है, लेकिन हम चाहते हैं कि डेटा में कोई फेरबदल न हो (यानी
   Function.identity() का मतलब होता है t -> t)।

 */