package SingaletonDesingClass;

public class MianApp
{
    //Get One Obejct Using Enum Silgleton
   public static void main(String[] args)
   {
       EnumSingleton instance1 =EnumSingleton.INSTANCE;
       System.out.println(instance1.hashCode()); //149928006

       EnumSingleton instance2=EnumSingleton.INSTANCE;
       System.out.println(instance2.hashCode()); //149928006

       EnumSingleton instance3=EnumSingleton.INSTANCE;
       System.out.println(instance3.hashCode()); //149928006

       System.out.println("----Object Compare-------");

       System.out.println(instance1==instance2); //true
       System.out.println(instance2==instance3); //true
       System.out.println(instance1==instance3); //true
   }
}

/*Note: Sabhi Instance ka Hascode same aa rha hai
(149928006
149928006
149928006)
Eska matalb abhi object same hai
aur "==" Operator bhi true return kar rha hai.
*/