//Predicate with and() method.
import java.util.function.Predicate;

public class test3
{
    public static void main(String[] args)
    {
        Predicate<String> P1 = str -> str.length() > 5;
        Predicate<String> P2 = str -> str.equals("admin@123");

        Predicate<String> P = P1.and(P2);

        System.out.println(P.test("aman@123"));
    }
}