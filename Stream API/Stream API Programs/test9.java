// Write a programe to print all the String values length is greater than 5.

import java.util.stream.Stream;
import java.util.ArrayList;


public class test9 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("aman");
        al.add("anjali");
        al.add("anurag");
        al.add("akansha");
        al.add("tarun");



        al.stream().filter(e-> e.length()>5).forEach(e-> System.out.println(e));


    }
}