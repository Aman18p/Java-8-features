// method reference for Instance Method.

interface I1
{
   void m1();
}

class test1
{
    public void m2()
    {
        System.out.println("I am in m2 method");
    }
    public static void main(String[] args)
    {
        test1 ob = new test1();
        I1 i = ob ::m2;
        i.m1();
    }
}
