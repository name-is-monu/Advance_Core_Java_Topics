package Java8Features.JavaOptionalClass;

import java.util.Optional;

public class OptionalDemo
{
   public static void main(String[] args)
   {
       //Man lo Database se User ka name aaya hai...
        String name=null;

        //1. ofNullable का उपयोग करके सुरक्षित Optional बनाना
       Optional<String> optName=Optional.ofNullable(name);

       //2. isPresent() से चेक करना
       if(optName.isPresent())
       {
           System.out.println("Name is Present :"+optName.get());
       }
       else
       {
           System.out.println("Name is null !");
       }


       // 3. orElse() का जादुई इस्तेमाल (सबसे ज्यादा कोडिंग में यही यूज़ होता है)
       // अगर नाम null है, तो "Guest" प्रिंट हो जाएगा
       String finalName = optName.orElse("Guest");   //Ye Agar optName container object me hamne name set kiya hai gara useme value hai to o value dega nhi to hamnme jo get pass kliya hai vahi dega ..
       System.out.println("Final Name: " + finalName); // आउटपुट: Guest

       // 4. ifPresent() का उपयोग (अगर वैल्यू है तभी कुछ करो)
       optName.ifPresent((val)-> System.out.println("String length is :"+val.length()));

    }
}
