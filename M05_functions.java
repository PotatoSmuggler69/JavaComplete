/*
 *      A class has two parts:
 *      
 *      1. Attributes. (Variables) [DONE]
 *      2. Behaviour (Functions)  [Will do]
 *      
 *          --> reuse of code
 *          --> it adds behaviour to a class.
 *          --> it is reused when a complete class is inherited
 * 
 *      According to return type functions are of four types:
 *          
 *          1. Give nothing receive nothing
 *          2. Give something receive nothing
 *          3. Give nothing receive something
 *          4. Give something receive something
 * 
 *          Give    ----> return type
 *          receive ----> function arguments
 * 
 *          javac xyz.java ---> xyz.java --- xyz.class
 *          java xyz
 * 
 *      According to arguements passed:
 *      
 *      1. Call by value / passing value
 *      2. call by reference / passing reference
 * 
 *      (call by reference is not directly allowed in JAVA) --> java does not allow pointers
 *      
 *      it indirectly supports call by reference by passing reference of ojects.
 * 
 * 
 *      Wrapper Class ---> call by reference pass krleo tor call by value hoe.
 *                    ---> Extensively used in collection framwork
 *                    ---> Special type of class that are used for wrapping of data around objects
 * 
 *      Integer a = 10;
 *      Long a = new Long(100);
 *      Short
 *      Float
 *      Double
 * 
 *      Autoboxing ? ---> Conversion of primitive data type to wrapper class
 * 
 *          Example :
 *                      int a =100;
 *                      Integer x = new Integer(a); //Autoboxing
 *      Unboxing ? 
 *              ---> Conversion of wrapper class to primitive data type
 * 
 *          Example :
 *                      Integer x = new Integer(100);
 *                      int a = x; //unboxing
 * 
*/

public class M05_functions {
    public static void main(String[] args) {
        Var poda = new Var(100);
        yo(poda);
        System.out.println("Original : "+poda.a);
    }
    
    static void yo(Var x){
        x.a = 50;
        System.out.println("Change : "+x.a);
    }


}

class Var{
    Integer a;
    Var(Integer a){
        this.a = a;
    }
}



