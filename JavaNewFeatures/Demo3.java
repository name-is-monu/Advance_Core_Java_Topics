package JavaNewFeatures;

public class Demo3 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread is created using Thread class");
    }

    static void main()
    {
        Demo3 d3=new Demo3();

        Thread t3=new Thread(d3);
        t3.start();
    }
}

/*Thread Create using Thread Class..*/