package Java8Features.BuiltInFunctionalInterface;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface
{
   public static void main(String[] args)
   {
       //Use Of Consumer Functional Interface >>>
       Consumer<String> printMessage=(message)-> System.out.println(message);
       printMessage.accept("Hello Monu -> How are you !");
    }
}

/*
=>3. Consumer (खपत करने के लिए - No Return)
  -यह क्या करता है: यह डेटा इनपुट लेता है, उस पर ऑपरेशन करता है (जैसे प्रिंट करना या डेटाबेस में सेव
  करना), लेकिन कुछ भी रिटर्न नहीं करता (इसका रिटर्न टाइप void होता है)।
  =>इसकी एब्स्ट्रैक्ट मेथड:
        void accept(T t);

  -कहाँ इस्तेमाल होता है: लिस्ट के हर एक आइटम को प्रिंट कराने या प्रोसेस करने के लिए (forEach के
  अंदर यही इस्तेमाल होता है)।

*/