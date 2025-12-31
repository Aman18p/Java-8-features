import java.util.function.Predicate;

public class test2
{
    public static void main(String[] args)
    {
        Predicate <String> P = str -> str.length()>6;
        System.out.println(P.test("Aman kumar Pandey"));
    }
}