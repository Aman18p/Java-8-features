//Write a programe to count all the even numbers in an ArrayList.

import java.util.stream.Stream;
import java.util.ArrayList;


public class test4 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(33);
        al.add(40);
        al.add(55);


        al.stream().map(e-> e*e).forEach(e-> System.out.println(e));



    }
}