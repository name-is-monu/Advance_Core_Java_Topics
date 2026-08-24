package Java8Features.CollectorsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee1
{
  private   String name;
   private String department;
   private double salary;

   /*Non- Parameterized Constructor*/
   public Employee1(){}

   /*Parameterized Constructor*/
   public Employee1(String name , String department , double salary)
   {
       this.name=name;
       this.department=department;
       this.salary=salary;
   }

   /*Getters and Setters*/

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void setDepartment(String department)
    {
        this.department=department;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setSalary(double salary)
    {
        this.salary=salary;
    }

    public double getSalary()
    {
        return salary;
    }


    /*main method ...*/

   public static void main(String[] args)
   {
       List<Employee1> employees=new ArrayList<>();
       employees.add(new Employee1("Monu Kumar" , "TTI" , 1500000.500));
       employees.add(new Employee1("Monu Kumar" , "TTI" , 1500000.500));
       employees.add(new Employee1("Radha" , "Doctor" , 500000.500));
       employees.add(new Employee1("Kajal" , "Doctor" , 300000.500));
       employees.add(new Employee1("Kajal" , "Doctor" , 300000.500));
       employees.add(new Employee1("Sonal" , "Nurse" , 200000.500));
       employees.add(new Employee1("Pinkey" , "Nurse" , 100000.500));
       employees.add(new Employee1("Pinkey" , "Nurse" , 100000.500));



         Set<String> names=employees.stream()
                   .map(Employee1::getName)
                   .map(String::toUpperCase)
                   .collect(Collectors.toSet());

       System.out.println("Name Set :"+names);

    }

}

/*Collectors.toSet() :-
  Yah duplicates data ko remove kar dega aur ek unques numbers ka set dega .
* */