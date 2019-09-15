package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String a = "cat";
        String b = "act";
        String c = "army";
        String d = "mary";

        anagram(a, c);
        anagram(a, b);
        anagram(c, d);
        anagram(c, a);
    }
        public static boolean anagram (String i, String j) {
            char[] arrayOfCharFromStringA = i.toCharArray();
            char[] arrayOfCharFromStringB = j.toCharArray();
            Arrays.sort(arrayOfCharFromStringA);
            Arrays.sort(arrayOfCharFromStringB);
            if (Arrays.equals(arrayOfCharFromStringA, arrayOfCharFromStringB)) {
                System.out.println("words are anangram");
            } else {
                System.out.println("words are not anangram");
            }

            return Arrays.equals(arrayOfCharFromStringA, arrayOfCharFromStringB);


    }

}
