import java.util.Arrays;
public class Function2 {
    public static void main(String[]args){

        int[] arr1 = {2,3,5,6,7,8};
        int[] arr2 = {3,9,1,8,4,8,5};
        int[] arr3 = {3,9,1,8,4,8,5};

        /* Calls the function arrSum */
        int sum = arrSum(arr1);
        System.out.println("The sum is "+ sum);
        /* Calls the function arrSum */

        /* Calls the function arrMin */
        int min = arrMin(arr2);
        System.out.println("The min is " + min);
        /* Calls the function arrMin */

        /* Sort an array using Java's class */
        Arrays.sort(arr3);
        System.out.println("The sorted array is " + Arrays.toString(arr3));
        /* Sort an array using Java's class */

        /* Sort an array using the Bubble sort */
        bubbleSort(arr3);
        /* Sort an array using the Bubble sort */

    }
   /* arrSum takes an array and returns the sum of the array */
    public static int arrSum(int[] arr){
        int sum = 0;
        for(int v: arr)
            sum += v;
        return sum;
    }
    /* arrSum takes an array and returns the sum of the array */

    /* arrMin takes an array and returns the min of the array */
    public static int arrMin(int[] arr){
        int min = arr[0];
        for(int v: arr){
            if(v<min)
                min = v;
        }
        return min;
    }
    /* arrMin takes an array and returns the min of the array */

    /* Sort an array without using Java's class */
    public static void arrSort(int[] arr){

    }

    /* Sort an array using Bubble Sort and without using Java's class */
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<(arr.length-1); j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        for(int k=0; k<arr.length; k++)
            System.out.println(arr[k] + " ");
    }
    /* Sort an array using Bubble Sort and without using Java's class */

}
