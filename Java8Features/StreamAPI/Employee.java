package Java8Features.StreamAPI;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Employee
{
    private String name ;
    private String department;
    private double salary;

    public Employee(String name , String department , double salary)
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

    public static void main(String[] args)
   {
       List<Employee> employees = new ArrayList<Employee>();
       employees.add(new Employee("Monu Kumar" , "IT Department", 105000.500));
       employees.add(new Employee("kajal Kumari" , "Nurse Department", 5000.500));
       employees.add(new Employee("Sonal" , "Food Department", 50000.500));
       employees.add(new Employee("Radha" , "IT Department", 50030.500));
       employees.add(new Employee("Monika" , "IT Department", 10000.500));

       //IT Department me maujud employee ka slary Total nikalna hai.
Double result = employees.stream()
               .filter((emp)->emp.getDepartment().equalsIgnoreCase("IT Department"))
               .map((emp)->emp.getSalary())
                       .reduce(0.0, (x , y)-> x+y);

       System.out.println("Total Salary of IT Department Employees :"+result);

    }
}
