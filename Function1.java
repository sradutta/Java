public class Function1 {
    public static void main(String[]args){

        /* Call the function sum */
        sum(2, 3); sum(4, 0); sum(5, -1); sum(-2, -3);
        /* Call the function sum */

        /* Call the function sum2, save the results and print the results */
        int a = sum2(2,3);
        System.out.println("The sum is " + a);
        int b = sum2(4,0);
        System.out.println("The sum is " + b);
        int c = sum2(5, -1);
        System.out.println("The sum is " + c);
        int d = sum2(-2,-3);
        System.out.println("The sum is " + d);
        /* Call the function sum2, save the results and print the results */

        /* Calls the function isEven */
        boolean t = isEven(-4);
        System.out.println("The variable is " + t);
        boolean f = isEven(5);
        System.out.println("The variable is " + f);
        boolean z = isEven(0);
        System.out.println("The variable is " + z);
        /* Calls the function isEven */

    }

    /* A sum function that takes into 2 params and print out the results */
    public static void sum(int x, int y){
        System.out.println("The sum of " + x + " and "+ y + " is " + (x+y));
    }
    /* A sum function that takes into 2 params and print out the results */

    /* A sum function that that takes in 2 params and returns the results */
    public static int sum2(int x, int y){
        return (x+y);
    }
    /* A sum function that that takes in 2 params and returns the results */

    /* A isEven function that checks if the argument is even or not */
    public static boolean isEven(int x){
        boolean check;
        if(x%2==0)
            check = true;
        else
            check = false;

        return check;
    }
    /* A isEven function that checks if the argument is even or not */
}
