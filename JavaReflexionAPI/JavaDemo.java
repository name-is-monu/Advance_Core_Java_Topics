package JavaReflexionAPI;

class Demo
{
    static
    {
        System.out.println("I am in static Block");
    }

    public Demo()
    {
        System.out.println("I am in Constructor");
    }

    {
        System.out.println("I am in instance block");
    }

    public static void show()
    {
        System.out.println(" I am in static show method ");
    }

}


//2 nd class

public class JavaDemo
{
   public static void main(String[] args)
   {
//       Demo obj=new Demo();
//
//       Demo obj2=new Demo();

//       Demo.show();


       /*Class Load using Reflexion API :- Class load hote hi static block call ho jata hai .
         Esko eski sirf class load honer se matalb hota hai chahe kaise bhi object create karke ya
         static method class karke , ya Reflexion ka use karke*/


         try
         {
             Class.forName("JavaReflexionAPI.Demo"); //Ham pura class ka path dena padega with package name
         }
         catch (ClassNotFoundException e)
         {
             System.out.println(e.getMessage() +"  class Not found..");
         }

    }
}

/*Staic block class Load hote hi call hota hai :-
   -> Class Load kaise hota hai :
      1. Class ka Object create karte hai tab class load hota hai.
      2.ya koe static method ko class name se call karte hai tab class load hota hai.
      3.Ham Reflexion Api ka use karte hai tab jaise -> Class.forName("className");
   => En tariko se Class load hota hai aur class Load hote hi static{} block ke andar ki
     class automatically execute ho jata hai first .


 => Instance Block :-
    -{} instance block tab call hota hai jab koe object create hota hai .
     ye har object ke liye har bar execute hota hai.
     ye constructor ka pahala statement hota hai pahale ye execute hoga then
      constructor ka code execute hota hai.


   =>static method ko to ham jante hai ki ye Class name se call hota hai
      esko call karne ke liye instance method ko tarah object ki jarurat nhi padta hai.

  => Constrictor automatically execute ho jata  hai jab ham class ka object create karte hai.


  =>Note : static block ek hi baar call hota hai kyu ki ek hi bar class load hota hai.
     but instance block jittni bar object banega utni bar class hoga kyu ki ye constructor ki
     pahali statement hoti hai aur constructor object create karne par har bar chalta hai.

*/