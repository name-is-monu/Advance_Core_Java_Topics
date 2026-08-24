package JavaNewFeatures;

import JavaInterface.DiamondInInterafce.A;

import java.util.Objects;

class Aline
{
    private String name;
    private int age;

    public Aline(String name , int age )
    {
        this.name=name;
        this.age=age;
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

    @Override
    public String toString() {
        return "Aline{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aline aline = (Aline) o;
        return age == aline.age && Objects.equals(name, aline.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
public class RecordClass
{
   public static void main(String[] args)
   {
        Aline aline1=new Aline("Monu Kumar",20);
        Aline alin2=new Aline("Monu Kumar",20);
       System.out.println(alin2.equals(aline1));
       //it will return true because now equals() method compare values not object
    }
}

/*Ham Class banana hota hai to hame ye sab preocess karna padta hai jo hamne
RecordClass me kiya hai
 Note : Hame toString() method ko ovveride kiya hai jo object ki values ko print karega
  aur hamne equal() and hashCode() method ko override kiya hai
  jo bhale hi object alag alag create hoga but Same values hogi to equal() methdod true
  dega. Ye upper hamne jitna kiya hai ko sir record Class ke ho jayega kam line of code
  me
*/