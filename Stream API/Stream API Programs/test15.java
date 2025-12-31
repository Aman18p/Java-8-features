//Write a programe to get minimum element in an array.

import java.util.stream.Stream;
import java.util.ArrayList;


public class test15 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(30);
        al.add(33);
        al.add(20);
        al.add(15);

        int min = al.stream().min((x,y)-> x.compareTo(y)).get();
        System.out.println(min);
    }
}