package JavaInterface.DiamondInInterafce;

public class MyClass implements A , B
{
    @Override
    public void show()
    {
        System.out.println("This method override from A");
    }

    @Override
    public void m1()
    {
   //    A.super.m1(); //it refersent the A interafec default method
        B.super.m1(); //it refersent the B interafec default method
    }

    @Override
    public void show1()
    {

        System.out.println("This method override from B");
    }
}

/*Java 7 tak and Esse pahale Interafec me sirf abstarct method and public static
final interaface hote the tab Tab tak to Diamound problem nhi aati thi
interafce me .
-> But Java 8 me interafce me default method aaya jisko implemented class chahe to
override kar skti hai chahiye to nhi koe force nhi . but mano agar man lo
implemented class kisi do yese interface ko implements karti  karti hai jisme same name
ke do method ho tab Diamond problem aati hai esko yese
"InterfaceName.super.methodName()" solve kiya jata hai.*/