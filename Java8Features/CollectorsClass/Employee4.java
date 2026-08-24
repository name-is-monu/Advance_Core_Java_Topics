package Java8Features.CollectorsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee4
{
    private  int id;
  private   String name;
   private String department;
   private double salary;

   /*Non- Parameterized Constructor*/
   public Employee4(){}

   /*Parameterized Constructor*/
   public Employee4(int id , String name , String department , double salary)
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
       List<Employee4> employees=new ArrayList<>();
       employees.add(new Employee4(1 ,"Monu Kumar" , "TTI" , 1500000.500));
       employees.add(new Employee4(2,"Monu Kumar" , "TTI" , 1500000.500));
       employees.add(new Employee4(3,"Radha" , "Doctor" , 500000.500));
       employees.add(new Employee4(4,"Kajal" , "Doctor" , 300000.500));
       employees.add(new Employee4(5,"Kajal" , "Doctor" , 300000.500));
       employees.add(new Employee4(6,"Sonal" , "Nurse" , 200000.500));
       employees.add(new Employee4(7,"Pinkey" , "Nurse" , 100000.500));
       employees.add(new Employee4(8,"Pinkey" , "Nurse" , 100000.500));


       Long count =employees.stream()
                .collect(Collectors.counting());

       System.out.println(count);
    }

}

/*Collectors.counting(delimiter) :-
     ye kitne El3ements hai sab ko count kar deta hai.
* */