import java.util.function.Consumer;

public class test1
{
    public static void main(String[] args)
    {
        Consumer<String> C = str -> System.out.println("Hi : " + str.concat("@gmail.com"));

        C.accept("Aman");
    }
}