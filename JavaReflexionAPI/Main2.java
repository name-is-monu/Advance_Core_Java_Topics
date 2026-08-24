package JavaReflexionAPI;

import java.lang.reflect.Method;

public class Main2
{
   public static void main(String[] args)
   {
      try
      {
          Class c=Class.forName("JavaReflexionAPI.Apple");

          Apple apple =(Apple) c.newInstance();

          Method m=apple.getClass().getDeclaredMethod("repair" , null);
          m.setAccessible(true);
          m.invoke(apple , null);

      }
      catch (Exception e)
      {
          System.out.println(e.getMessage());
      }

    }
}

/*Ham jante hai ki private method ko sirf usi class ke andar call kiya ja skta hai
 class ke bahar nhi but ha reflexion api ka use karke call kar skte hai
 kisi bhi class ke private method ko kisi bhi class se .\
 vahi ham karne ja rhe hai
  Apple ke repair() methoid ko call karege using fleaxion api .*/