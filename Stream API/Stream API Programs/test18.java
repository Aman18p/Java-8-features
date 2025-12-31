// Write a programe to get all the names with surmane is Pandey.

import java.util.stream.Stream;
import java.util.ArrayList;


public class test18 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Aman Pandey");
        al.add("Anjali Pandey");
        al.add("Anurag Pandey");
        al.add("Akansha Chitchot");
        al.add("Tarun Pathak");



        al.stream().filter(e-> e.endsWith("Pandey")).forEach(e-> System.out.println(e));


    }
}