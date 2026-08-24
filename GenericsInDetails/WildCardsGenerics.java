package GenericsInDetails;

//Upper Bounded Wildcards (? extends Type)

import java.util.ArrayList;
import java.util.List;

public class WildCardsGenerics
{
    /*
   => Unbounded Wildcard (?): किसी भी टाइप के लिए (जैसे List<?>).
    "print(List<?> list)" no-bounded wildcard Generics Jo kisi bhi Type ke list ko accept karega aur work perform
     karge Agar ham "print(List<Object> list)" karte to Ye Compile time Error deta Esi lye yaha par ha <?> ka use karte
     hai .
       */
    public void print(List<?> list)
    {
        for(Object element :list)
        {
            System.out.print(element+" , ");
        }
        System.out.println();
    }

    /*
    => UpperBound wildCard Generics (? extend T)
     -> Yah Ye batata hai ki ham T ya uske sub class ko hi sirf Esme pass kar skte hai aur
     Uspar work perform kar skte hai jaise ( ? extend Number) yah sirf (Integer , Double , float ) ko hi
     accept karega String ko nahi ...
    */

    public void printUsingUpperBound(List< ? extends  Number> list)
    {
       for(Object element :list)
       {
           System.out.print(element+" , ");
       }
        System.out.println();
    }
   public static void main(String[] args)
   {
       //List of Integer ...
       List<Integer> marks = new ArrayList<>();
       marks.add(98);
       marks.add(80);
       marks.add(70);
       marks.add(69);
       marks.add(80);

       //List of Double
       List<Double> salary = new ArrayList<>();
       salary.add(9803.383);
       salary.add(83084.8484);
       salary.add(70838.030);
       salary.add(69838.9393);
       salary.add(8063535.9337);

       //List Of String ...

       List<String> names=new ArrayList<>();
       names.add("Monu");
       names.add("Kajal");
       names.add("Pinkey");
       names.add("Radaha");

       //method Call

       WildCardsGenerics wcg=new WildCardsGenerics();
       //<?> Unbounded WildCard Generics method call
       wcg.print(salary);

       //<? extends Type> UpperBound Wild Card Generics

//       wcg.printUsingUpperBound(names); it will provide an Exception because String is not sub Type of Number
       wcg.printUsingUpperBound(marks); //it will work because Integer Sun Type of Number
       wcg.printUsingUpperBound(salary); //it will also work same resion ..
    }
}


/*
3. Upper Bound और Lower Bound क्या हैं?
A. Upper Bounded Wildcards (? extends Type)
परिभाषा: यह तय करता है कि अननोन टाइप या तो वह स्पेसिफिक क्लास होगी या उसकी कोई सब-क्लास (Child Class) होगी।
उपयोग (Covariance): इसका उपयोग मुख्य रूप से डाटा पढ़ने (Read-only) के लिए किया جاتا है (PECS प्रिंसिपल का 'GET' हिस्सा)।
उदाहरण: List<? extends Number> का मतलब है कि लिस्ट में Number या उसकी सब-क्लासेस (Integer, Double, Float) हो सकती हैं।

B. Lower Bounded Wildcards (? super Type)
परिभाषा: यह तय करता है कि अननोन टाइप या तो वह स्पेसिफिक क्लास होगी या उसकी कोई सुपर-क्लास (Parent Class) होगी।
उपयोग (Contravariance): इसका उपयोग मुख्य रूप से डेटा लिखने (Write-only) के लिए किया जाता है (PECS प्रिंसिपल का 'PUT' हिस्सा)।
उदाहरण: List<? super Integer> का मतलब है कि लिस्ट में Integer या उसका कोई सुपर-टाइप (Number, Object) हो सकता है।
*/

 /*
      List<Object> list=new ArrayList<>();
      list.add("Monu ");
      list.add(100);
      String val=(String) list.get(1);
       System.out.println(val);

       -> Esi liye hame List<Object> nahu banana Chahiye Kyu ki ye sabhi class ka Parrent hota hai
          to Har Trype ki value ko accept karega List me baad me get karne me ClassCastException Exception
          deta hai.

          Esko ham Yese Solve kar skte hai...


          public void print(List<?> list)
          }
          //print using for each loop
          }


हाँ, आप वाइल्डकार्ड (?(Unbounded), ? extends T(Upper Bound ), ? super T(Lower Bound))
का उपयोग करके अपनी खुद की कस्टम क्लासेज (Custom Classes)
या मेथड्स के पैरामीटर टाइप्स (Field/Variable types) नहीं बना सकते।
वाइल्डकार्ड्स का उपयोग केवल मेथड के पैरामीटर्स (Method Parameters),
रिटर्न टाइप्स या लोकल वेरिएबल्स के लिए किया जाता है।
  */