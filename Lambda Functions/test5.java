/*
public class test5 implements Runnable
{
    public void run()
    {
        for (int i = 1; i < 5; i++)
        {
            System.out.println("i am in runnable thread" + i);
        }
    }

    public static void main(String[] args)
    {
        test5 T5 = new test5();
        Thread th = new Thread(T5);
        th.start();

        for (int i = 1; i < 5; i++)
        {
            System.out.println("i am in main thread" + i);
        }
    }
}
*/

// Runnable Interface basic programe with lambde expression.

public class test5
{
    public static void main(String[] args)
    {
        Runnable r =() ->
        {
            for (int i = 1; i < 5; i++)
            {
                System.out.println("i am in runnable thread" + i);
            }
        };
        Thread th = new Thread(r);
        th.start();

        for (int i = 1; i < 5; i++)
        {
            System.out.println("i am in main thread" + i);
        }
    }
}