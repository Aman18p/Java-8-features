import java.util.function.Supplier;

public class test2
{
    public static void main(String[] args)
    {
        Supplier<String> S =()->
                {
                        String [] names = {"aman", "anjali", "anurag", "akansha", "tarun"};
                        int i =(int) (Math.random()*4);
                        return names[i];
                };

        System.out.println(S.get());
    }
}