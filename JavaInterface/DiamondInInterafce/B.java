package JavaInterface.DiamondInInterafce;

public interface B
{
    void show1();

    default void m1()
    {
        System.out.println("This is B interface default method..");
    }
}
