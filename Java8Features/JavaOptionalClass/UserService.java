package Java8Features.JavaOptionalClass;

import java.util.Optional;

public class UserService
{
    public Optional<String> getUserEmailById(int id)
    {
        if(id>=1)
        {
            return Optional.of("marmonu476@gmail.com");
        }
        else
        {
            return Optional.empty();
        }
    }

    //main method...

   public static void main(String[] args)
   {
       UserService service=new UserService();
       String email=service.getUserEmailById(99).orElse("default@gmail.com");

       System.out.println("Email :"+email);

    }
}
