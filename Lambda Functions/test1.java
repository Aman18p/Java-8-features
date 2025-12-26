/* interface I1
{
    void m1();
}

public class test1
{
    public static void main(String[] args)
    {
        I1 ob = new I1() {
            @java.lang.Override
            public void m1()
            {
                System.out.println("I am in m1 method");
            }
        };
        ob.m1();
    }
}
*/

// same code using lebmda expression principles

interface I1
{
    void m1();
}

public class test1
{
    public static void main(String[] args)
    {
       I1 i = ()-> {System.out.println("I am in m1 method");};
       i.m1();
    }
}
