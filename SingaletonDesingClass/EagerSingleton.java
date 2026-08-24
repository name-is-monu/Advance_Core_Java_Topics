package SingaletonDesingClass;

public class EagerSingleton
{
    private static final EagerSingleton instance=new EagerSingleton();

    private EagerSingleton()
    {
        System.out.println("instance created ..");
    }

    public EagerSingleton getInstance()
    {
        return instance;
    }
}

/*Yah Singleton class banane ka Eager tarika hai Eska Ek dis Advantage hai ki
 Agar Project me Es Object ka use nhi hua fir bhi ye object create hoke memory liye
 rhega .*/