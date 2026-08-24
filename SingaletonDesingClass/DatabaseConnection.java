package SingaletonDesingClass;

//Singleton class unsing Lazy Instancialiom (Best Tarika)
public class DatabaseConnection
{
   private static volatile DatabaseConnection Instance;

   private DatabaseConnection()
   {
       System.out.println("DataBase Connected SuccessFully !..");
   }

   public void executeQuery(String query)
   {
       System.out.println(query);
   }

   public static DatabaseConnection getInstance()
   {
       if(Instance==null)
       {
           synchronized (DatabaseConnection.class)
           {
               if(Instance==null)
               {
                   Instance=new DatabaseConnection();
               }
           }
       }
       return Instance;
   }
}

/*Rules:
  1.Private Constructor .
  2.Same class ka private static final Instance ;
  3.public static RetunSameCalss getInstance(){} method jo esi Instance me store same class
    ke object ko retrun kare .
*/