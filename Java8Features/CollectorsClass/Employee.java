package Java8Features.CollectorsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee
{
  private   String name;
   private String department;
   private double salary;

   /*Non- Parameterized Constructor*/
   public Employee(){}

   /*Parameterized Constructor*/
   public Employee(String name , String department , double salary)
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
       List<Employee> employees=new ArrayList<>();
       employees.add(new Employee("Monu Kumar" , "TTI" , 1500000.500));
       employees.add(new Employee("Radha" , "Doctor" , 500000.500));
       employees.add(new Employee("Kajal" , "Doctor" , 300000.500));
       employees.add(new Employee("Sonal" , "Nurse" , 200000.500));
       employees.add(new Employee("Pinkey" , "Nurse" , 100000.500));


       /*Sirf Employees ke list se name ko nikal ke unka ek list batao -> Jisme Collectors ka use samjh me aayega.*/
         List<String> names=employees.stream()
                   .map(Employee::getName)  //pure list se name nikalega
                   .map(String::toUpperCase)  // ye un names ko Uppercase me convert karega
                   .collect(Collectors.toList()); //Collectors apne staic method toList() se list me store kareg har list ko

       System.out.println("Names List :"+names);

    }

}

/*Collectors.toList()*/