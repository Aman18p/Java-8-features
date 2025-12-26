interface I1
{
    void m1(int a, int b);
}

public class test3
{
    public static void main(String[] args)
    {
        I1 i = (a, b)-> System.out.println(a*b);  //Lambda expression can take any number of parameters.
        i.m1(10, 41);
    }
}