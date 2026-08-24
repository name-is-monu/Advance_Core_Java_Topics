package GenericsInDetails;

public class Utility
{
    // Generic static method

    public static <T> void printArray(T[] arr)
    {
        for (T element : arr)
        {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    // Generic non - static method
    public  <T> void AnyValues(T[] arr)
    {
        for (T element : arr)
        {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    // Generic non -static method and return T method
    public  <T> T returnValue(T e)
    {
      return e;
    }

    //main Method ........
   public static void main(String[] args)
   {
       String[] names={"Monu" , "Radha" , "Kajal" , "Sonal" , "Pinkey"};
       Integer[] marks={100 , 80 , 92 , 90 , 70};
//       Utility.printArray(names); // String array ke liye bhi kaam karega
//       Utility.printArray(marks);// Integer array ke liye kaam karega

       Utility utility=new Utility();
//       utility.AnyValues(names);
//       utility.AnyValues(marks);

      java.lang.String str = utility.returnValue("Monu");
       System.out.println(str);

       Integer integer = utility.returnValue(200);
       System.out.println(integer);
    }
}


/*Note ham class me Kisi bhi sirf method ko Generic bana skte hai .
  chahe vo koe value print , return  kare vo method kisi bhi tyep ka ho skta hai.
   - static and concrete(Instance method)
*/