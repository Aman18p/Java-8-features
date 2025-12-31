// Write a programe to get the first character of each name.

import java.util.stream.Stream;
import java.util.ArrayList;


public class test11 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("aman");
        al.add("anjali");
        al.add("anurag");
        al.add("akansha");
        al.add("tarun");



        al.stream().map(e-> e.charAt(0)).forEach(e-> System.out.println(e));


    }
}