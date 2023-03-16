/*
 *  Types of loops
 * 
 *      1. for loop
 *      2. while
 *      3. do while loop
 *      4. for each
 * 
 * 
 *      for(<initialization>;<termination>;<interation>){
 *      }
 * 
 *      Example :
 *                      for(int i=100;i<200;i=i+2){
 *                      
 *                          }
 * 
 *                      for(;;){
 *                      }
 * 
 *                      for(int i=0;;){
 *                      }
 * 
 *                      for(;i!=0;){
 *                      }
 *      
 *       2. while loop ---> called entry controlled loop
 *              while(<codition>){
 *              }
 * 
 *       3. do-while loop ---> exit controlled loop
 * 
 *         do{
 *          
 * 
 *           }while(<condition>);
 * 
 * 
 *        4. for each loop
 *              Interable data type object ------> obj -----> Integer
 *              for(Integer i : obj){
 *              
 *              }
 * 
 * 
 *      Problems:
 *          1. Find the number of digits in a number
 *          2. Factorial of a number
 *          ..... search on net
*/
public class M07_Loops {
    public static void main(String[] args) {
        int a =123451;
        //finding the number of digits in the variable a
        int counter=0;
        for(;;){
            if(a==0) {
                break;
            }
            counter++;
            a=a/10;
        }
        System.out.println(counter);
        //example
        for(;a!=0;){
            counter++;
            a=a/10;
        }
        System.out.println(counter);
    }
}
