package Java8Features.BuiltInFunctionalInterface;

import java.util.function.Supplier;

public class SupplierFunctionalInterface
{
    public static void main(String[] args)
    {
//        Supplier<Double> random=()-> (Math.floor(Math.random()*10));
//      Double ran=random.get();
//        System.out.println(ran);

        //Integer me Type Casting (Narrowing or Explicit Type Casting )
//
//        Supplier<Double> random=()-> (Math.floor(Math.random()*10));
//       Double ran=random.get();
//       int finalRan=ran.intValue();
//        System.out.println(finalRan);

        //way 2;-
        Supplier<Integer> random=()->(int) (Math.floor(Math.random()*10));
        int ran=random.get();
        System.out.println(ran);

    }
}

/*
4. Supplier (सप्लाई करने के लिए - No Input, Only Output)
   -यह क्या करता है: यह कोई इनपुट नहीं लेता, लेकिन जब भी आप इसे कॉल करते हैं, यह आपको एक नया
   ऑब्जेक्ट या वैल्यू सप्लाई (Generate) करके देता है।

   =>इसकी एब्स्ट्रैक्ट मेथड: T get();

   -कहाँ इस्तेमाल होता है: रैंडम नंबर जनरेट करने के लिए, या डिफ़ॉल्ट ऑब्जेक्ट बनाने के लिए।

*/