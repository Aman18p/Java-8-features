import java.util.stream.Stream;
import java.util.ArrayList;

public class CreateStreamInstance
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

         // 1st way to create stream instance.

          Stream<Integer> S1 = al.stream();
          S1.forEach(e-> System.out.println(e));



        /* 2nd way to create stream instance.

          Stream S2 = Stream.of(al);
          S2.forEach(e-> System.out.println(e));

         */

        /* 3rd way to create stream instance.

           Stream S3 = Stream.of(100, 200, 300, 400, 500);
           S3.forEach(e-> System.out.println(e));

         */

        /* 4th way to create stream instance.

          int[] arr = {100, 200, 300, 400, 500};
          IntStream S4 = Arrays.stream(arr);
          S4.forEach(e-> System.out.println(e));

         */

        /* 5th way to create stream instance.

          Stream S5 = Stream.empty();

         */

        /* 6th way to create stream instance.

          Stream S5 = Stream.builder().build();

         */
    }
}