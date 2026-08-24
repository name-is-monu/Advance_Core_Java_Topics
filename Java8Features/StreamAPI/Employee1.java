package Java8Features.StreamAPI;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee1
{
    private String name ;
    private String department;
    private double salary;

    public Employee1(String name , String department , double salary)
    {
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
      return "Employee { Name :"+name+" Deparment :"+department+" Salary :"+salary+"}";
    }

    /*main Method start from here ....!*/
    public static void main(String[] args)
   {
       List<Employee1> employees = new ArrayList<Employee1>();
       employees.add(new Employee1("Monu Kumar" , "IT Department", 105000.500));
       employees.add(new Employee1("kajal Kumari" , "Nurse Department", 5000.500));
       employees.add(new Employee1("Sonal" , "Food Department", 50000.500));
       employees.add(new Employee1("Radha" , "IT Department", 50030.500));
       employees.add(new Employee1("Monika" , "IT Department", 10000.500));
       employees.add(new Employee1("Kajal Singh" , "Food Department", 20000.500));
       employees.add(new Employee1("Pawan" , "Nurse Department", 100000.500));
       employees.add(new Employee1("Rohan Gupta" , "Nurse Department", 30000.500));
       employees.add(new Employee1("Sonal" , "IT Department", 10000.500));
       employees.add(new Employee1("Pinkey" , "Nurse Department", 100000.500));
       employees.add(new Employee1("Ankush" , "IT Department", 100000.500));


       /*Collectors.groupingBy() ka use */

//      Map<String , List<Employee1>> byDep=employees.stream()
//                .collect(Collectors.groupingBy((Employee1::getDepartment)));
//
//       System.out.println(byDep);




       //use of iterator:

//       Iterator<Employee1> itr =employees.iterator();
//
//       while (itr.hasNext())
//       {
//           System.out.println(itr.next()); //iter.next().getName bhi ham kar skte hai kyu ye Employee ka Object de rha hai
//       }


       //userOf ForEach loop
        employees.stream()
                .forEach((emp)-> System.out.println(emp.getName())); //it will print only name of Employee


    }
}
