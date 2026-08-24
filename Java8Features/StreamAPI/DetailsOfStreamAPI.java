package Java8Features.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employees
{
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employees(){}

    public Employees(int id , String name , int age , double salary)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class DetailsOfStreamAPI
{

  public static void main(String[] args) {
      /*List Of Employees me se Un Employess ke name nikal jinki salary 50000 se jyada hai.
      Unke name nikalkar new list banao*/

      List<Employees> employees = new ArrayList<Employees>();
      employees.add(new Employees(101, "Monu Kumar", 20, 105000.5000));
      employees.add(new Employees(102, "Rohan Gupta", 19, 50000.530));
      employees.add(new Employees(103, "Abhishek Gupta", 21, 40000.5030));
      employees.add(new Employees(104, "Kajal Kumari", 18, 30000.20));
      employees.add(new Employees(105, "Sonu Kumar", 20, 100000.5000));

      List<String> empNames =employees.stream()
              .filter((e)->e.getSalary() >=50000)
              .map((e)->e.getName())
              .toList();

       for(String name:empNames)
       {
           System.out.print(name +" , ");
       }

  }
}
/*Stream API :-
  ->1. Stream API क्या है? (What is Stream API?)
         -Stream कोई डेटा स्ट्रक्चर (जैसे List या Collection) नहीं है। यह डेटा को स्टोर नहीं करता, बल्कि यह
         कलेक्शन्स (Collections) या Arrays पर डेटा प्रोसेस करने का एक डेलिगेटेड तरीका (Pipeline of Operations) है।
       -> Stream API के दो मुख्य प्रकार (Types of Operations)
       -Stream के अंदर जितने भी मेथड्स होते हैं, उन्हें मुख्य रूप से दो श्रेणियों में बांटा गया है:
          1.Intermediate Operations (मध्य र के ऑपरेशंस):
            -ये ऑपरेशंस डेटा पर कुछ काम करते हैं और बदले में एक नया Stream ही रिटर्न करते हैं (इसलिए इन्हें चेन किया जा सकता है)।
            -ये Lazy (आलसी) होते हैं—यानी जब तक अंत में कोई Terminal Operation न चलाया जाए, तब तक ये चलते ही नहीं हैं।
            -उदाहरण: filter(), map(), sorted(), distinct(), limit()

         2.Terminal Operations (अंतिम ऑपरेशंस):
            -ये Stream की पाइपलाइन को खत्म करते हैं और फाइनल रिजल्ट (जैसे List, Integer या void) रिटर्न करते हैं।
            -इनके चलने पर ही पूरा Stream एक्टिवेट होता है और डेटा प्रोसेस होना शुरू होता है।
            -उदाहरण: collect(), forEach(), count(), reduce(), findFirst()

*/