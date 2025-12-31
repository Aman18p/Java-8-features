import java.util.function.Function;

public class test2
{
    public static void main(String[] args)
    {
        Function<String , String> F = str -> str.concat(" is a java developer");

        System.out.println(F.apply("Aama"));
    }
}