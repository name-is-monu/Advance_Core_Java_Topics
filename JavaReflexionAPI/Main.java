package JavaReflexionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main
{
   public static void main(String[] args)throws ClassNotFoundException
   {
       Class c =Class.forName("JavaReflexionAPI.Product");
//       System.out.println(c.getName());

       Constructor[] constructors =c.getConstructors();

       for(Constructor constructor : constructors)
       {
           System.out.println(constructor);
       }

       System.out.println("==============================");

       Method[] methods=c.getMethods();

       for(Method method : methods)
       {
           System.out.println(method);
       }

       System.out.println("==============================");

      Field[] fields=c.getDeclaredFields();

      for(Field field : fields)
      {
          System.out.println(field);
      }
   }
}
