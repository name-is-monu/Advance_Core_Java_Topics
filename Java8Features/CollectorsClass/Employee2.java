package Java8Features.CollectorsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee2
{
    private  int id;
  private   String name;
   private String department;
   private double salary;

   /*Non- Parameterized Constructor*/
   public Employee2(){}

   /*Parameterized Constructor*/
   public Employee2(int id , String name , String department , double salary)
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
       List<Employee2> employees=new ArrayList<>();
       employees.add(new Employee2(1 ,"Monu Kumar" , "TTI" , 1500000.500));
       employees.add(new Employee2(2,"Monu Kumar" , "TTI" , 1500000.500));
       employees.add(new Employee2(3,"Radha" , "Doctor" , 500000.500));
       employees.add(new Employee2(4,"Kajal" , "Doctor" , 300000.500));
       employees.add(new Employee2(5,"Kajal" , "Doctor" , 300000.500));
       employees.add(new Employee2(6,"Sonal" , "Nurse" , 200000.500));
       employees.add(new Employee2(7,"Pinkey" , "Nurse" , 100000.500));
       employees.add(new Employee2(8,"Pinkey" , "Nurse" , 100000.500));



         Map<Integer,String> names=employees.stream()
                         .collect(Collectors.toMap(emp->emp.getId() , emp->emp.getName()));
       System.out.println("Map of Employees id and String  :"+names);

    }

}

/*Collectors.toMap() :-
         eske andar two lambda pass kiya jata hai , ek se ham key definne karte hai ek se value

         =>Note values can be duplicates but key can't be doublicates .
* */