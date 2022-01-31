public class Loops {
    public static void main(String[]args) {
        /* This code finds the index where number 10 is located */
        int[] num = {10, 15, 12, 7, 88, 10, 6, 17, 23, 10, 10, 16};
        int count = 0;
        for (int v : num) {
            if (v == 10) {
                System.out.println("The number 10 is at located at index i = " + count);
            }
            count++;
        }
        /* This code finds the index where number 10 is located */


        int[] ar1 = {4, 2, 6, 8, 98, -9, 0, 0, 45, 76, 23, 78, 90, -10};

        /* This code finds the maximum value of an array and the index where it is located */
        int i = 1;
        int max = ar1[0];
        for (int x : ar1) {
            if (x > max) {
                max = x;
                i++;
            }
        }
        /* This code finds the maximum value of an array and the index where it is located */

        /* This code finds the minimum value of an array and the index where it is located */
        int j = 1;
        int min = ar1[0];
        for (int y : ar1) {
            if (y < min) {
                min = y;
                j++;
            }
        }
        /* This code finds the minimum value of an array and the index where it is located */

        System.out.println("The maximum value is " + max + " located at  " + i);
        System.out.println("The minimum value is " + min + " located at  " + j);

    }
}
