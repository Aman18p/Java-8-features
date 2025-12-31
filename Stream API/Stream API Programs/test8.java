// Write a programe to print all the numbers which are greater than 30.

import java.util.stream.Stream;
import java.util.ArrayList;


public class test8 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(33);
        al.add(40);
        al.add(55);


        al.stream().filter(e-> e>30).forEach(e-> System.out.println(e));

        /*

          Stream<Integer> S = al.stream();

          Predicate <Integer> P = (e)->
          {
             return e>30;
          }

          Consumer <Integer> C = (e)->

          {
              System.out.println(e);
          }

          S.filter(P).forEach(C);
         */

    }
}
