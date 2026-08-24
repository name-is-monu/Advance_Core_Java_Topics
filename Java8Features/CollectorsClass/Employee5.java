package Java8Features.CollectorsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee5
{
    private  int id;
  private   String name;
   private String department;
   private double salary;

   /*Non- Parameterized Constructor*/
   public Employee5(){}

   /*Parameterized Constructor*/
   public Employee5(int id , String name , String department , double salary)
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
       List<Employee5> employees=new ArrayList<>();
       employees.add(new Employee5(1 ,"Monu Kumar" , "TTI" , 1500000.500));
       employees.add(new Employee5(2,"Monu Kumar" , "TTI" , 1500000.500));
       employees.add(new Employee5(3,"Radha" , "Doctor" , 500000.500));
       employees.add(new Employee5(4,"Kajal" , "Doctor" , 300000.500));
       employees.add(new Employee5(5,"Kajal" , "Doctor" , 300000.500));
       employees.add(new Employee5(6,"Sonal" , "Nurse" , 200000.500));
       employees.add(new Employee5(7,"Pinkey" , "Nurse" , 100000.500));
       employees.add(new Employee5(8,"Pinkey" , "Nurse" , 100000.500));


       Double count =employees.stream()
                .collect(Collectors.summingDouble(emp-> emp.getSalary()));

       System.out.println(count);
    }

}

/*Collectors.summingDouble :-
    ye empoloyee ke salarey ko sum karke dega .
* */