package Java8Features.CollectorsClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee6
{
    private  int id;
  private   String name;
   private String department;
   private double salary;

   /*Non- Parameterized Constructor*/
   public Employee6(){}

   /*Parameterized Constructor*/
   public Employee6(int id , String name , String department , double salary)
   {
       this.id=id;
       this.name=name;
       this.department=department;
       this.salary=salary;
   }

   /*Getters and Setters*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
       List<Employee6> employees=new ArrayList<>();
       employees.add(new Employee6(1 ,"Monu Kumar" , "TTI" , 1500000.500));
       employees.add(new Employee6(2,"Monu Kumar" , "TTI" , 1500000.500));
       employees.add(new Employee6(3,"Radha" , "Doctor" , 500000.500));
       employees.add(new Employee6(4,"Kajal" , "Doctor" , 300000.500));
       employees.add(new Employee6(5,"Kajal" , "Doctor" , 300000.500));
       employees.add(new Employee6(6,"Sonal" , "Nurse" , 200000.500));
       employees.add(new Employee6(7,"Pinkey" , "Nurse" , 100000.500));
       employees.add(new Employee6(8,"Pinkey" , "Nurse" , 100000.500));


       Optional<Employee6> maxSalary =employees.stream()
               .collect(Collectors.maxBy(Comparator.comparing(e -> e.getSalary())));

       System.out.println(maxSalary.get().salary);
    }

}

/*Collectors.maxBy(Comparator.comparing(emp->emp.getSalary()) :-
     Employess me sabse jyada salary kitni hai usko bata dega .
* */