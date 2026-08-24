package QuestionSolution;

public class MainApp
{
   public static void main(String[] args)
    {
        DatabaseConnection instance1=DatabaseConnection.getInstance();

        DatabaseConnection instance2=DatabaseConnection.getInstance();

        DatabaseConnection instance3=DatabaseConnection.getInstance();

        System.out.println(instance1==instance2); //true
        System.out.println(instance1==instance3); //true
        System.out.println(instance2==instance3); //true

        System.out.println("-----------------------");
         String query="SELECT *FROM students";
        instance1.executeQuery(query);


        System.out.println("------Use of Enum Singleton -------");
        DatabaseConnectionEnum EnumInstance1 =DatabaseConnectionEnum.INSTANCE;
        DatabaseConnectionEnum EnumInstance2 =DatabaseConnectionEnum.INSTANCE;
        DatabaseConnectionEnum EnumInstance3 =DatabaseConnectionEnum.INSTANCE;

        System.out.println(EnumInstance1==EnumInstance2); //true
        System.out.println(EnumInstance1==EnumInstance3); //true
        System.out.println(EnumInstance3==EnumInstance2); //true
        EnumInstance2.execuetQuery(query);
    }
}
