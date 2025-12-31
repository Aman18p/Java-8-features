//Write a programe to sort an ArrayList conting integer values.

import java.util.stream.Stream;
import java.util.ArrayList;


public class test13 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(30);
        al.add(33);
        al.add(20);
        al.add(15);

        al.stream().sorted().forEach(e-> System.out.println(e));
    }
}