package SingaletonDesingClass;

import QuestionSolution.DatabaseConnection;
import QuestionSolution.DatabaseConnectionEnum;

public class MainApp2
{
   public static void main(String[] args)
    {
        QuestionSolution.DatabaseConnection instance1= QuestionSolution.DatabaseConnection.getInstance();

        QuestionSolution.DatabaseConnection instance2= QuestionSolution.DatabaseConnection.getInstance();

        QuestionSolution.DatabaseConnection instance3= DatabaseConnection.getInstance();

        System.out.println(instance1==instance2); //true
        System.out.println(instance1==instance3); //true
        System.out.println(instance2==instance3); //true

        System.out.println("-----------------------");
         String query="SELECT *FROM students";
        instance1.executeQuery(query);


        System.out.println("------Use of Enum Singleton -------");
        QuestionSolution.DatabaseConnectionEnum EnumInstance1 = QuestionSolution.DatabaseConnectionEnum.INSTANCE;
        QuestionSolution.DatabaseConnectionEnum EnumInstance2 = QuestionSolution.DatabaseConnectionEnum.INSTANCE;
        QuestionSolution.DatabaseConnectionEnum EnumInstance3 = DatabaseConnectionEnum.INSTANCE;

        System.out.println(EnumInstance1==EnumInstance2); //true
        System.out.println(EnumInstance1==EnumInstance3); //true
        System.out.println(EnumInstance3==EnumInstance2); //true
        EnumInstance2.execuetQuery(query);
    }
}
