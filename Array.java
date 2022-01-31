public class Array {
    public static void main(String[]args){
        /* Homework */
        int[] numbers = {2,76,9,90,31,76,2,76,21,12}; //Creating an array of numbers
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);
        System.out.println(numbers[7]);
        System.out.println(numbers[8]);
        System.out.println(numbers[numbers.length-1]);

        String[] msg = new String[5]; //creating an empty array of length 5
        msg[0] = "Java";
        msg[1] = "is";
        msg[2] = "really";
        msg[3] = "super";
        msg[4] = "awesome";
        System.out.println(msg[0] + " " + msg[1] + " " +msg[2] + " " +msg[3] + " " +msg[4]);

        boolean[] results = {true,false,5>2,5>=5,5<0,5!=5,5==6};
        System.out.println(results[0]);
        System.out.println(results[1]);
        System.out.println(results[2]);
        System.out.println(results[3]);
        System.out.println(results[4]);
        System.out.println(results[5]);
        System.out.println(results[6]);
        /* Homework */





    }
}
