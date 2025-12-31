/*
interface I1
{
    public boolean test(int no);
}

class A1 implements I1
{
    public boolean test(int no)
    {
        return no%2==0;
    }
}

public class test1
{
    public static void main(String[] args)
    {
        A1 ob = new A1();
        System.out.println(ob.test(15));
    }
}
 */
import java.util.function.Predicate;

public class test1
{
    public static void main(String[] args)
    {
        Predicate<Integer> P = no -> no%2==0;
        System.out.println(P.test(5));
    }
}

