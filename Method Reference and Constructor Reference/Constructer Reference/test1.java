interface I1
{
    void m1();
}

class test1
{
    test1()
    {
        System.out.println("I am in test1 constructor");
    }
    public static void main(String[] args)
    {

        I1 i = test1 ::new;
        i.m1();
    }
}