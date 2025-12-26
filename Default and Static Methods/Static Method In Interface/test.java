interface DbDriver
{
    void getDriverClass();
    void getDriverUrl();

    public static void m3()
    {
        System.out.println("This is a default method");
    }
}

class SQLConnection implements DbDriver
{
    public void getDriverClass()
    {
        System.out.println("com.mysql.jdbc.Driver");
    }
    public void getDriverUrl()
    {
        System.out.println("jdbc:mysql://localhost:3306/db_demo");
    }


}

class OracleConnection implements DbDriver
{
    public void getDriverClass()
    {
        System.out.println("oracle.jdbc.OracleDriver");
    }
    public void getDriverUrl()
    {
        System.out.println("jdbc:oracle:thin:@localhost:1521:xe");
    }

}



public class test
{
    public static void main(String[] args)
    {
        SQLConnection SQL = new SQLConnection();
        SQL.getDriverClass();
        SQL.getDriverUrl();
        DbDriver.m3();

        OracleConnection ORC = new OracleConnection();
        ORC.getDriverClass();
        ORC.getDriverUrl();
        DbDriver.m3();
    }
}