package JavaInterface.DiamondInInterafce;

public interface A
{
    void show();
    default void m1()
    {
        System.out.println("This is A interface default method ..");
    }
}
