public class ComparisonBoolean {
    public static void main(String[]args){

        /* Variable Declarations */
        int a = 100;
        int x = 12;
        int d = 12;
        int c = 122;
        /* Variable Declarations */

        /* First doing the comparison manually
        boolean zz1  = (a==d); //False
        boolean zz2  = (x==d); //True
        boolean zz3  = (c>=a); //True
        boolean zz4  = (x>=d); //True
        boolean zz5  = ((d==c) || (x==d)); //True
        boolean zz6  = ((c>x)&&(d>=x)); //True
        boolean zz7  = ((a>x)||(a>c)); //True
        boolean zz8  = ((a==c)&&(d==c)); //False
        boolean zz9  = ((c==c)&&(a>=a)); //True
        boolean zz10 = ((c>c)||(a<=a)); //True
        boolean zz11 = ((c>a)&&(x>d)); //False
        First doing the comparison manually */

        /* Now check it through.,,,.// Java */
        boolean zz1  = (a==d);
        System.out.println("zz1 is " + zz1);
        boolean zz2  = (x==d);
        System.out.println("zz2 is " + zz2);
        boolean zz3  = (c>=a);
        System.out.println("zz3 is " + zz3);
        boolean zz4  = (x>=d);
        System.out.println("zz4 is " + zz4);
        boolean zz5  = ((d==c) || (x==d));
        System.out.println("zz5 is " + zz5);
        boolean zz6  = ((c>x)&&(d>=x));
        System.out.println("zz6 is " + zz6);
        boolean zz7  = ((a>x)||(a>c));
        System.out.println("zz7 is " + zz7);
        boolean zz8  = ((a==c)&&(d==c));
        System.out.println("zz8 is " + zz8);
        boolean zz9  = ((c==c)&&(a>=a));
        System.out.println("zz9 is " + zz9);
        boolean zz10 = ((c>c)||(a<=a));
        System.out.println("zz10 is " + zz10);
        boolean zz11 = ((c>a)&&(x>d));
        System.out.println("zz11 is " + zz11);
        /* Now check it through.,,,.// Java */

        /* Using only if-else */
        if(zz1&&zz2){
            System.out.println("The comparison is true");
        } else{
            System.out.println("The comparison is false");
        }
        if(zz1||zz2){
            System.out.println("The comparison is true");
        }else{
            System.out.println("The comparison is false");
        }
        /* Using only if-else */

        /* Using both if and else-if */
        int passenger_age = 0;
        double fare = 1500;
        if((passenger_age > 3)&&(passenger_age<66)){
            fare = 0.5*fare;
            System.out.println("The fare of the passenger is " + fare);
        } else if((passenger_age <3)&&(passenger_age>0)){
            System.out.println("The passenger travels free and thus no fare");
        }else if(passenger_age>=66){
            fare = 0.8*fare;
            System.out.println("The fare of the passenger is " + fare);
        }else{
            System.out.println("No passenger age is given. It's needed to calculate the fare");
        }
        /* Using both if and else-if */

        /* Live class practice */
        int[] jan = {25,21,32,26};
        jan[3] = 23; //Updating the array as I made a mistake; it was not 26.
        System.out.println(jan[0]);

        String[] colors = {"Red","Green","Yellow","Red","Pink","Blue","Brown","Gray","Orange","Violet"};
        System.out.println(colors[9]);

        char[] word = {'c','o','o','l'};
        System.out.println(word[2]);
        System.out.println(word.length);
        System.out.println(colors.length);
        System.out.println(colors[colors.length-1]);

        int[] numbers = new int[5]; //we are allocating the variable numbers with memory space int[5]
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[4] = 3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        String[] fruits = new String[2];
        fruits[0] = "apple";
        System.out.println(fruits[1]);

        String[] some = new String[1]; //this is still an array
        some[0] = "something";

        //String[] and String are two different things

        boolean[] results = {false,false,true,6>100,10!=10,10==10};
     }
}
