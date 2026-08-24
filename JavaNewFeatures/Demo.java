package JavaNewFeatures;

public class Demo implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Thread is Created :");
    }

   public static void main()
   {
         Thread thread=new Thread(new Demo());
         thread.start();
    }
}

/*
 Note : Agar ham Yese Es run() method ko call karte hai to Therad create hoga
      Demo d=new Demo();
      d.run();

      No , nahi yese Thread create nhi hoga Thread Tabhi create hoga jab
      Thread class ka start() method clall hoga .
* */