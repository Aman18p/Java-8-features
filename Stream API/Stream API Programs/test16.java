//Write a programe to get maximum element in an array.

import java.util.stream.Stream;
import java.util.ArrayList;


public class test16 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(30);
        al.add(33);
        al.add(20);
        al.add(15);

        int max = al.stream().max((x,y)-> x.compareTo(y)).get();
        System.out.println(max);
    }
}