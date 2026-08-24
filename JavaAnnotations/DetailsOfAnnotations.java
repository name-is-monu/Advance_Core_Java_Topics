package JavaAnnotations;

public class DetailsOfAnnotations
{
}
/*Annotations :-
   -> Annotation represent the extra information hota hai jisko ham apne code me
   add karte hai jiske karan hamare code me extra featurs aa jata hai .
   Annotations 2 Types ke hote hai:-
         1.Builin Annotations
         2.Custome (User Created Annotations )

   => Annotaions Create karne ke liye instarfece ke machinism ko use karte hai
    but intefcae nhi hote hai Annotaions :
    Example :-

   @interface CreatePlayer
   {
     int age();
     String country();
   }

   => Note ham dekh skte hai ki interface ki tarh ki bilkul hai jiske andar
      public abstract int age(); and public abstract String country();
      do method hai ek interface keyword laga hai CreatePlayer class par
      jisse ye interface ban gaya hai .


      But "@" lagakar ham bata rhe hai compiler ko ki ye Annoations nhi hai
       ye Hamane jo banaya hai o Annotation hai .

       => Note :
          Hamne dekha haui ki java me bahut sare Annotations hote hai
            jine use bhi alag alag hota hai kuchh class par use hote hai
            kuchh method par use hote hai to kuchh Enums par use hote hai
            thik vaise hi hame annotation banate time ye batana hota hai ki ye annotaions kaha use hota
            esko scopre kya hoga ..

         -Example :

          @Target(ElementType.Type)
          @Retention
          @interface CreatePlayer
           {
               int age();
               String country();
           }


         =>Note : @Target(ElementType.Type)
            -> ye jo "Type" hai ye batata hai ki ye Annotations hai o Class , interface , and enums
            par lagaya ja skta hai. Agar ham Type use karte hai to hamare dyvara banaya gaya
            Annotations Class par , interface par , ya enum par use kar skte hai .
            nahi to ElementType. karte hi bahut se public sratic final variable dikhte hai
            jisko apne hisab se lagake Anniotaion ko . method , package etc par lagane ke
            liye bana skte hai.

         =>  @Retention(RetentionPolicy.)
         -SOURCE :- Ye Act like comment karega matalba ye Compiler tak pahuchega hi nahi.
         -RUNTIME : - Ye Compiler , Runtime , and JVM tak jayega .
         -
*/