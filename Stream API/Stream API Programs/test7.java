//Write a programe to sort the names form Z-A.


import java.util.stream.Stream;
import java.util.ArrayList;

public class test7
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<>();
        al.add("aman");
        al.add("anjali");
        al.add("anurag");
        al.add("akansha");
        al.add("tarun");

        al.stream().sorted((x,y) ->-x.compareTo(y)).forEach(e-> System.out.println(e));
    }
}