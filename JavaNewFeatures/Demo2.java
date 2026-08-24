package JavaNewFeatures;

public class Demo2
{
    static void main() {
        Runnable r=()->
        {
            System.out.println("Thread created using Lambda Expression..");
        };

        Thread t=new Thread(r);
        t.start();
    }
}

/*Create Therad using Lambda Expression*/