//Predicate with negate() method.

import java.util.function.Predicate;

public class test5 {
    public static void main(String[] args) {
        Predicate<String> p1 = str -> str.length() > 5;

        Predicate<String> p = p1.negate();

        System.out.println(p.test("Aman"));      // true
        System.out.println(p.test("PandeyJi"));  // false
    }
}