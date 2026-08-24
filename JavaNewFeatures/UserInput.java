package JavaNewFeatures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UserInput
{
   public static void main(String[] args)throws Exception
   {
       InputStreamReader reader =new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(reader);
       ArrayList<String> names=new ArrayList<>();
       System.out.println("Enter your name :");

         names.add(br.readLine());
         names.add(br.readLine());
         names.add(br.readLine());
         names.add(br.readLine());

       System.out.println(names);
    }
}


/*Ham jyadatar user se inputr Scanner class ka use karke lete hai
   but ham BufferReader ka use karke bhi user se input le skte hai .
 */