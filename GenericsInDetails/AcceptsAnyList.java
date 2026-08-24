package GenericsInDetails;

import java.util.List;

public class AcceptsAnyList
{
    public static void printList(List<?> list) //Yah kisi bhi type ke List ko accept karega
    {
        for(Object obj :list)
        {
            System.out.print(obj +" , ");
        }
        System.out.println();
    }

    //accept Number Only

    public static <T> void takeNumberList(Iterable< ? extends Number> list)
    {
        for(Number obj :list)
        {
            System.out.print(obj +" , ");
        }
        System.out.println();
    }

    static void main()
    {
       //Differents types of List ...
        List<Integer> intList = List.of(10 ,20 , 30, 40, 50);

        List<String> stringList=List.of("Monu" , "Radha" , "Kajal");

//        printList(intList);
//        printList(stringList);

        takeNumberList(intList);
     //   takeNumberList(stringList); //it will provide an Error


    }
}
