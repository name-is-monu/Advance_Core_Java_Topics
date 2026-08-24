package JavaNewFeatures;

import javax.swing.plaf.TableHeaderUI;

public class Demo1
{
   public static void main(String[] args)
   {
     Runnable r=new Runnable() {
         @Override
         public void run()
         {
             System.out.println("Therad is Created ..");
         }
     };

     Thread t=new Thread(r);
     t.start();
    }
}

/*Thread Create using Anonymus class Expression ...
 Note : Chahe tarika apna le Thread tabho create hota hai jab Thread class ka
 start() method class hota hai kyu ki ye internali run method ko call karta hai.
*/