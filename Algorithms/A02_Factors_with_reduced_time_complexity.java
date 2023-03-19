/**
 *      We have a number 15
 *      
 *      -----> 1,3,5,15
 * 
 *      We have 24
 *      ----> 1,2,3,4,6,8,12,24
 * 
 * 
 *      Number / factor ------> Remainder = 0
 * 
 *          
 * 
 *      24 = 24^(1/2) = 
 *      
 *      Pair Factors
 *  
 *      1 * 24 = 24
 *      2 * 12 = 24
 *      3 * 8  = 24
 *      4 * 6 = 24 
 * 
 *      1,2,3,4
 * 
 *      24/1 = 24
 *      24/2 = 12
 *      24/3 = 8
 *      24/4 = 6
 * 
 * 
 *      for(int i=1;i<=4;i++){
 * 
 * 
 *      }
 *          
 *      4^2 = 16
 *      ...
 *      x^2 = 24  -------> 4 < x < 5
 *      ...
 *      5^2 = 25
 * 
 *      64
 *      8
 *      125 % 1 = 0
 * 
 *      1-----> 125/1 ----> 125
 *      5-----> 125/5 ----> 25
 *      
 * 
 * 
 *      for(int i=1;i<12;i++){
 *          if(125%i==0){
 *          }
 *      }
*/


package Algorithms;

public class A02_Factors_with_reduced_time_complexity {
    public static void main(String[] args) {
        new A02_Factors_with_reduced_time_complexity().gand_fard(24);
    }

    void naive(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println("The factor of"+n+" is : "+i);
            }
        }
    }

    void gand_fard(int n){
        for(int i=1;i<(int)Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("The factor of "+n+" is : "+i);
                System.out.println("The factor of "+n+" is : "+(n/i));
            }
        }
    }
}
