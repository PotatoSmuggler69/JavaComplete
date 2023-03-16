// Sort that we will learn

    // Time Complexity : O(n*n) [1 - 3]

    // 1. selection sort (mostly used in daily life)
    // 2. bubble sort (a psychopath will use in daily life)
    //3. insertion sort (a high IQ person will use)
    

    // 4. quick sort  [Time Complexity : average case : O(n*log(n)) and worst case : O(n*n) ]
    // 5. merge sort (pode bas dite gele jiges krbe TR e) [worst case and best case : O(n*log(n)), 
                    //                                     Space Complexity: (n*n) ]

    // 6. heap sort (amio jani na but toke bolbo bole sikhe nobo)
            // time : O(n*log(n)) and Space O(n)
import java.util.Arrays;
public class M10_Sorting {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,5,1,7,10,9,7};
        new M10_Sorting().insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    void selection_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void bubble_sort(int[] arr){
        int flag =0;
        for(int i=0;i<arr.length;i++){
            flag=0;
            for(int j=0;j<arr.length-1;j++){
                // fisrt = arr[j]
                // second = arr[j+1]
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag=1;
                }
            }
            if(flag==0) break;
        }
    }


    void insertion_sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }



}
