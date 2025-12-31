// Write a programe to get all the even number in an arraylist.

import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);


        Stream<Integer> S1 = al.stream();
        List l = S1.filter(e -> e % 2 == 0).collect (Collectors.toList());
        System.out.println(l);

    }
}

