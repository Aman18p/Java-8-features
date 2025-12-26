interface I1
{
    void m1();
}

public class test2
{
    public static void main(String[] args)
    {
        I1 i = ()-> System.out.println("I am in m1 method"); //Curly braces and return keyword are optional for a single statement
        i.m1();
    }
}