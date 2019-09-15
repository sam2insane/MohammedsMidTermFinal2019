package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        int num = 10;


        for (int i = 0; i < num; i++) {
            for (int x = num-1; x >= i; x--) {
                System.out.print(" ");
            }
            for (int z = 0; z <= i; z++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}





