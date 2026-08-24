package SingaletonDesingClass;

public enum EnumSingleton
{
    INSTANCE("Only one Object will create at any cost ");

    private final String description;

    EnumSingleton(String description)
    {
        this.description=description;
    }

    public void doSomething()
    {
        System.out.println("Singleton work perfectly ..");
    }

}
