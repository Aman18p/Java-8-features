// Write a programe to get all the even number in an arraylist.

import java.util.stream.Stream;
import java.util.ArrayList;


public class test2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);


        al.stream().filter(e-> e%2==0).forEach(e-> System.out.println(e));

        /*

        Stream<Integer> S1 = al.stream();
        S1.filter(e-> e%2==0).forEach(e-> System.out.println(e));

         */




    }
}
