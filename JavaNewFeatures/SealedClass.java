package JavaNewFeatures;
sealed class Vehicle permits Car , Bike
{
    public void start()
    {
        System.out.println("Car started....");
    }
}
final class Car extends Vehicle  //ya to final ya to no-sealed hona padega ...
{

}
non-sealed class Bike extends Vehicle
{

}

class Marshal extends Bike  //Bike no-sealed hai matalab esko koe class extends kar skti hai
{

}

public class SealedClass
{
   public static void main(String[] args)
   {

    }
}


/*Kisi class ko agar hamm "final" kar dete hai to usko koe bhi class extends nhi kar pati hai

* but Agar ham chahate hai ki  ki hamare dvara banaye gaye class ko sirf kuchh
specific class hi extends kare to ham "sealed" keyword ka use kar sket hai
Note : jo bhi specific class hamare dyvara banaye gaye "sealed" class ko
extends karegi un classes ko "final" ya to "no-sealed" hona padta hai hai
"sealed" matal esko bhi koe specific class extends kar skti hai
aur "no-sealed" matal koe bhi class esko extends karskati hai.
  Ye es liye kiya jata hai kyu ki suppose:-
   Hamare pass ek "Vehicle" class hai aur usko ham chahate hai ki sirf
   Car and Bike class hi extends kare na koe Vehicle class ko koe persion
   class extends kare esi liye ham sealed keyword ka use karte hai.
*/