import java.text.BreakIterator;

/*
 *   Array ?
 *      ----> It is linear data structure.
 *      ----> Stores elements of similar data type
 *      ----> Continuous memory allocation. 
 *      ----> The size is not dynamic.
 * 
 * Data---->     2       3         4      5          6
 * Memory-->   1001     1002     1003    1004       1005
 * 
 *  Data Stucture ?
 *      ----> An organized way of storing essential data.
 * 
 * 
*/
import java.util.Scanner;
public class M08_Arrays {
   public static void main(String[] args) {
        //Initialize

        // syntax 1
        // <data_type>[] arr_obj_name = new <data_type>[];
        // <data_type> arr_obj_name[] = new <data_type>[];
        Scanner sc = new Scanner(System.in);
        // int[] arr = new int[10];
        // int arr2[] = new int[10];

        // //Initialize with values

        // int[] arr3 = new int[]{1,2,4,5};

        // //Initialize reference variable
        // int[] arr4;

        // //Later assign the object
        // arr4 = new int[10];


        // //For each loop 
        // for(int i :arr3){
        //     System.out.println(i);
        // }

        // Creating array of objects
        Headphones[] arr5 = new Headphones[2];

        for(int i = 0; i<arr5.length;i++){
            System.out.print("Enter the brand name : ");
            String bname = sc.nextLine();
            System.out.print("Enter the price : ");
            int price = sc.nextInt();
            System.out.print("Enter the model : ");
            int model = sc.nextInt();
            sc.nextLine();
            arr5[i] = new Headphones(bname, price, model);
        }
        for(Headphones i : arr5){
            i.out();
        }
   } 
}
class Headphones{
    String brand_name;
    int price;
    int model;

    Headphones(String brand_name,int price,int date){
        this.brand_name = brand_name;
        this.price = price;
        this.model =date;
    }
    void out(){
        System.out.println("Brand Name : "+brand_name);
        System.out.println("Price : "+price);
        System.out.println("Model : "+model);
    }
}
