import java.util.function.Supplier;

public class test1
{
    public static void main(String[] args)
    {
        Supplier<Integer> S = () -> (int) (Math.random()*100);
        System.out.println(S.get());
    }
}