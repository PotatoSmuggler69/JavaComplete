/*
 *      Ways of taking input in java
 *      
 *      There are mainly three ways:
 *      
 *      1. Using Scanner Class (Slowest but easiest to use)
 *      
 *          1. import java.util.Scanner;
 *          2. create object of the scanner class. ( Scanner <obj_name> = new Scanner(System.in); )
 *          3.  
 *  
 *     
*/
import java.util.Scanner;
public class M09_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int input
        int a1 = sc.nextInt(); // function of the Scanner class

        //double input

        double a2 = sc.nextDouble();

        // float input

        float s3 = sc.nextFloat();

        //boolean input

        boolean s4 = sc.nextBoolean();

        //long
        long s5 = sc.nextLong();


        //String input without blank spaces

        String s6 = sc.next();
        // Moida Mfaka ----> Moida

        //String with blank spaces

        String s7 = sc.nextLine(); 
        // Locha ache ota pore bolbo

        // It takes /n or next Line as the terminating condition
        // so if we use another input statement before nextLine()
        // it considers the /n as the end of nextLine()

        // Solution ?

        // we have take a flase nextLine() input to consume the /n

    }
}
