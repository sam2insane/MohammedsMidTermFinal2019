//package string.problems;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
///**
// * Created by mrahman on 04/22/17.
// */
//public class DuplicateWord {
//
//    public static void main(String[] args) {
//        /*
//         * Write a java program to find the duplicate words and their number of occurrences in the string.
//         * Also Find the average length of the words.
//         */
//
//        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
//
//        Map<String,Integer> m = checkDuplicates(st);
//        Set<String> duplicateWords = m.keySet();
//        for (String str : duplicateWords) {
//            if (m.get(str) >1)
//            System.out.println("the word " + str + "was repeated " + m.get(st) +" times ";
//        }
//}
//
//    public static Map<String, Integer> checkDuplicates(String input) {
//    String[] words = input.split("\\s+");
//    Map<String, Integer> wordsMap = new HashMap<>();
//    for (wordsMap.get(s) != null)
//        wordsMap.put(s, wordsMap.get(s)+1);
//
//
//    }
//}
//
