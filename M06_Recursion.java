import javafx.beans.binding.MapBinding;

/*
 *      Calling of a function within the same function
 *      
 *      Why recursion    
 *      
 *      -----> Alternative of iteration or loops
 *      -----> follows stack appraoch
 *      -----> loops are generally better than recursion.
 *      -----> reduces the writting complexity but increases the thinking complexity.
 * 
 * 
 *      To create recusing follow the steps:
 * 
 *          1. find the base case/ termination condition in loops
 *          2. we will try to recreate the interative steps
*/
import java.util.Arrays;
public class M06_Recursion {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        M06_Recursion obj = new M06_Recursion();
        obj.rec(1);
        int[] dp = new int[5];
        Arrays.fill(dp,-1);
    }
    void rec(int i){
        //base case
        if(i>10) return;

        // interative steps
        System.out.println(i);
        rec(i+1);
    }

    int fac(int i){
        if(i==1 || i==0) return 1;
        return i * fac(i-1);
    }

    // fibonacci + memoization = DP
    int fibonacci(int pos,int[] dp){
        //base case
        if(pos==0 || pos ==1) return pos;
        

        //checking if already present in memory
        if(dp[pos]!=-1) return dp[pos];

        //iterative condition
        return dp[pos] = fibonacci(pos-1,dp) + fibonacci(pos-2,dp);
    }
}
