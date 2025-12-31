import java.util.function.Function;

public class test3
{
    public static void main(String[] args)
    {
        Function<String , Integer> F = str -> str.length();

        System.out.println(F.apply("Aama"));
    }
}