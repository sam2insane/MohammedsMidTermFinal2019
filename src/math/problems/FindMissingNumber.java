package math.problems;

import java.lang.reflect.Array;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println("the missing number : "+ helper(array));

    }

    public static int helper(int array[]) {
    int n =10;
    int sum =n*(n+1)/2;
    int restSum = 0;
    for (int i = 0; i <array.length; i++) {
        restSum+=array[i];
    }
    int helper = sum-restSum;
    return helper;
    }
}
