import org.omg.Messaging.SyncScopeHelper;

/*
 *  Types of variable in java : 
 *      1. Local Variable : The life of a local variable is limited within the function
 *                          of its birth.
 * 
 *      2. Object Level Variable: These are exclusive for a particular object and are not shared.
 * 
 *      3. Class Level Variable: These are shared among all the objects of the class.
 *         (Static)
 *      Global Variable (NOOOO)
 * 
 * 
*/



public class M02_Variable {
    public static void main(String[] args) {
        
        Emp obj1 = new Emp();
        obj1.company_name = "AOT";
        System.out.println(Emp.company_name);
    }
}

class Emp{
    //object level
    String name;
    int salary;
    //class level
    static String company_name="HETC";

    //local variable
    static void welcome(){
        //Local Variable
        int a =10;
        System.out.println(a);
    }

}
