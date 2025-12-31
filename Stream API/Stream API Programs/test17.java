//Write a programe to print the sum of all even numbers in an array.

import java.util.stream.Stream;
import java.util.ArrayList;


public class test17 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(30);
        al.add(33);
        al.add(20);
        al.add(15);

        /*

        Stream<Integer> S = al.stream();
        Stream<Integer> S1 = s.filter(e-> e%2==0);        //got all even numbers.
        IntStream is = S1.mapToInt(Integer :: intValue);  // convert Stream into IntStream.
        System.out.println(is.sum());                     //sum all the even numbers.

         */

        Stream<Integer> S = al.stream();
        int res = S.filter(e-> e%2==0).mapToInt(Integer :: intValue).sum();
        System.out.println(res);

    }
}