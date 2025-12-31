// Write a programe to replace the character 'a' with 'z'.

import java.util.stream.Stream;
import java.util.ArrayList;


public class test12 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("aman");
        al.add("anjali");
        al.add("anurag");
        al.add("akansha");
        al.add("tarun");



        al.stream().map(e-> e.replace('a', 'z')).forEach(e-> System.out.println(e));


    }
}