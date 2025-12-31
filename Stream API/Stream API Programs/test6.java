//Write a programe to sort the names.


import java.util.stream.Stream;
import java.util.ArrayList;

public class test6
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<>();
        al.add("aman");
        al.add("anjali");
        al.add("anurag");
        al.add("akansha");
        al.add("tarun");

        al.stream().sorted().forEach(e-> System.out.println(e));
    }
}