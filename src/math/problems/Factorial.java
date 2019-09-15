package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int num = 5;
        System.out.println("Iteration way: Factorial of " + num + " = " + recursiveFactorialWay(num));
        System.out.println("Recursive way: Factorial of " + num + " = " + factorialRecursive(num));


    }

    public static int factorialRecursive(int n) {
        if (n==0)
            return 1;
        else
            return n * recursiveFactorialWay(n-1);
    }


    public static int recursiveFactorialWay(int num) {
        int result = 1;
        for (int j = 1; j <=num; j++) {
            result *= j;
        }
        return result;
    }
}
