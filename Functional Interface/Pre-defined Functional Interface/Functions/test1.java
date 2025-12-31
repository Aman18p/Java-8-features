import java.util.function.Function;

public class test1
{
    public static void main(String[] args)
    {
        Function <Integer , Integer> F = sal -> sal*12;

        System.out.println(F.apply(26000));
    }
}