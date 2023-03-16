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

public class M06_Recursion {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        M06_Recursion obj = new M06_Recursion();
        obj.rec(1);
    }
    void rec(int i){
        //base case
        if(i>10) return;

        // interative steps
        System.out.println(i);
        rec(i+1);
    }
}
