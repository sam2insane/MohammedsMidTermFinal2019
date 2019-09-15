package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String  string1, string2, string3, string4;

        string1= "MOM";
        string2 = "POP";
        string3 = "ROB";
        string4 = "SAMIAN";

        isPalindrome(string1);
        isPalindrome(string2);
        isPalindrome(string3);
        isPalindrome(string4);

    }

    public static boolean isPalindrome(String words) {
        String reverse = "";

        for (int i=words.length() -1;i>=0;i--)
            reverse+=words.charAt(i);

        if (words.equalsIgnoreCase(reverse))
            System.out.println("string is palindrome");
        else
            System.out.println("string is not a palindrome");
        return words.equalsIgnoreCase(reverse);
    }


}
