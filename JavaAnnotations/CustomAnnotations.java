package JavaAnnotations;
/*User Created Annotation*/

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CreatePlayer
{
//    int age();
//    String country();

    int age() default 34;
    String country() default "India";
}


/*Make a class */

//@CreatePlayer(age=34 , country = "India")
@CreatePlayer()
class  Virat
{
    int run;
    int innings;

    public int getRun()
    {
        return run;
    }

    public void setRun(int run)
    {
        this.run = run;
    }

    public int getInnings()
    {
        return innings;
    }

    public void setInnings(int innings)
    {
        this.innings = innings;
    }
}


/*main method's class*/
public class CustomAnnotations
{
   public static void main(String[] args)
   {
       Virat virat =new Virat();
       virat.setRun(150000);
       virat.setInnings(250);

       System.out.println(virat.getRun());
       System.out.println(virat.getInnings());
    }
}


/*Hamne jo Virat class banaya hai ko thik hai .
ut ham es class ko bina Affect kiye kuchh esme Extra information add karna chahte hai
jise ham Annotaions kahte hai.*/