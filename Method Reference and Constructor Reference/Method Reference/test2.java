//method reference for static methods.

interface I1
{
    void m1();
}

class test2
{
    public static void m2()
    {
        System.out.println("I am in m2 method");
    }
    public static void main(String[] args)
    {

        I1 i = test2 ::m2;
        i.m1();
    }
}