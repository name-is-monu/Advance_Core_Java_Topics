package QuestionSolution;



public enum DatabaseConnectionEnum
{
    INSTANCE;
    DatabaseConnectionEnum()
    {

    }

    public void execuetQuery(String query)
    {
        System.out.println(query);
    }
}
