package JavaInterface;

public class InterfaceDetails
{
}
/*Interface in Java :-
   => There are Three Types Of Interface:-
       -> Normal Interface:
             -Jiske andar ek ya ek se jyada abstract methods ho skte hai.
       ->Marker Interface :
           -Jise interface ke andar ek bhi abstract method nhi hote hai.
       ->Functional Interface :
           -Jise interafce ke andar sird and sirf ek only one
           abstract method hota hai. java 8 ke liyet heart hai
           eska use Lambda Expression and Stream API me kiya jata hai.


    -It is a Blue print for the class it tell the class what to do not hwo to do.
    -It is used for achieved 100% abstraction and Loose coupling.
    -Eske andar Abstract Method banaye jate hai (yese method jinki koe Body)nhi hoti hai.
    -Es Interface ko jo bhi class implements karti hai usko must ho jata hai
     en methods ko ovveride karke Implements karna Agar yesa nahi karti hai o class
     to use bhi astract class ya interface hona padega .
     ->Note: By Default interface me methods ("public abstract hote hai").
        & Fields By Default (public static final hote hai).
    -Yah Sirf Batata hai ki "What to do" kya kaam hona chahiye esko implements
       karne vaki class "How to do " kaise hona chahiye tay karti hai.
    -Jaise ki Ham jante hai ki Java me Multiple Inheritance (ek class kisi two
    class ko extends nhi kar sakti kyu ki Dimaond problem )nhi kar skti .
    -Esi ko ham Interface ke jariye 100 % solve kar skte hai Interface
     Multiple inheritance ko allow karta hai.

     => Interafce ke Jariye 3 Chije 100 % Achieved kiya jata hai :-
      1-> 100% Abstraction :-
          Esme Complex logic ho Hide kar diya jata hai Bahar vale sirf
           Easy intraction interface provide kiya jata hai.
      2-> Loose Coupling:-
         Esme ek class dusare class par puri tarah depend nhi hoat hai
         jise code me changes karne par koe effect nhi dalta hai other code
         ko.

      3-> Achieved Multiple Inheritance :-
            Esme ek class kisi dusari class ko extnds and ek ya multiple
             interface ko implements kar skti haia ek saath , Yahi ek class
             do ya do se ached Parent se properties and methods ko inherit
             kar skti hai.
       ------------------------------------------------------------
 => Java 7 और उससे पहले: इंटरफेस में
 केवल एब्स्ट्रैक्ट मेथड्स (बिना बॉडी वाली)
 और public static final वेरिएबल्स ही हो सकते थे।

 =>Java 8 का बदलाव (Default & Static Methods):
   जावा 8 में यह सुविधा दी गई कि आप इंटरफेस के अंदर default कीवर्ड लगाकर बॉडी के साथ मेथड
   लिख सकते हैं (ताकि अगर पुराना इंटरफेस बदले, तो पुरानी इम्प्लीमेंटेड क्लासेज टूटे नहीं)। साथ ही
   static मेथड्स भी डाली जा सकती हैं।

   =>Java 9 का बदलाव (Private Methods):
   जावा 9 से इंटरफेस के अंदर private मेथड्स की भी अनुमति मिल गई, ताकि डिफ़ॉल्ट मेथड्स आपस में
   कोड शेयर कर सकें।


*/