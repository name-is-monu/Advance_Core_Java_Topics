package GenericsInDetails;

import java.util.ArrayList;
import java.util.List;

public class Question1
{

    public static <T> void mergeData(
             Iterable<? extends T> source1,
             Iterable<? extends T> source2 ,
             List< ? super T> destination
             )
    {
        //add Source1 data
        for(T item : source1)
        {
            destination.add(item);
        }

        //add source2 data
        for(T item : source2)
        {
            destination.add(item);
        }
    }

    //main method

   public static void main(String[] args)
   {
       List<Integer> list1 = List.of(1, 2, 3);
       List<Integer> list2 = List.of(4, 5, 6);
       List<Number> destination = new ArrayList<>();
       mergeData(list1, list2, destination);
       System.out.println("Merged Data: " + destination);
    }

}

/*Problem =>
आपको एक यूटिलिटी मेथड लिखना है जिसका नाम mergeData हो।
यह मेथड दो अलग-अलग कलेक्शंस (जैसे List, Set आदि, जो Iterable को इम्प्लीमेंट करते हैं)
से डेटा लेकर उसे एक डेस्टिनेशन लिस्ट (Destination List) में जोड़ (Merge) देगा।
*/