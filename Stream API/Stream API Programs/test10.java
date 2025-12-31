// Write a programe to print all the names that starts with 'a';

import java.util.stream.Stream;
import java.util.ArrayList;


public class test10 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("aman");
        al.add("anjali");
        al.add("anurag");
        al.add("akansha");
        al.add("tarun");



        al.stream().filter(e-> e.startsWith("a")).forEach(e-> System.out.println(e));


    }
}