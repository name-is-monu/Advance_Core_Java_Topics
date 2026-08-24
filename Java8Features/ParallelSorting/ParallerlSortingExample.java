package Java8Features.ParallelSorting;

import java.util.Arrays;

public class ParallerlSortingExample
{
    static void main() {
        int[] numbers = {58, 12, 85, 3, 91, 24, 7, 43, 65, 19};
        System.out.println("सॉर्ट होने से पहले:");
        System.out.println(Arrays.toString(numbers));

        // Parallel Sort का इस्तेमाल
        Arrays.parallelSort(numbers);

        System.out.println("Parallel Sort होने के बाद:");
        System.out.println(Arrays.toString(numbers));


        System.out.println("-----------------------");
        String[] names={"Amit","Ajay","Kajal","Sonal","Radha" ,"Abhishek","Pawan"};
        Arrays.parallelSort(names , (a,b)->b.compareTo(a));

        System.out.println(Arrays.toString(names));
    }
}
