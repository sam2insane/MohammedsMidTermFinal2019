package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        getPermutation("","TUT");
    }

    public static void getPermutation (String prmt,String word){
        int x = word.length();

        if(x == 0){
            System.out.println(prmt);
        }else{
            for (int i=0; i<x;i++){
                getPermutation(prmt + word.charAt(i),word.substring(0,i)+word.substring(i+1,x));

            }
        }
    }
}
