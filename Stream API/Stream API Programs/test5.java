//Write a programe to convert all the names to uppercase.

import java.util.stream.Stream;
import java.util.ArrayList;

public class test5
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<>();
        al.add("aman");
        al.add("anjali");
        al.add("anurag");
        al.add("akansha");
        al.add("tarun");

        al.stream().map(e -> e.toUpperCase()).forEach(e-> System.out.println(e));
    }
}

