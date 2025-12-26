interface I1
{
    int m1(String a);
}

public class test4
{
    public static void main(String[] args)
    {
        I1 i = a -> a.length(); //Parentheses are optional for a single parameter.
        // If lambda expression is returning any value then we can remove return keyword.
        System.out.println(i.m1("Aman"));
    }
}