/*
 *  These are certain keywords that are used to control the flow of our code
 *      Some of the most commonly used non access specifiers are:
 *      
 *          1. static (GAND FARD IMP QUES) --> 1) this keyword is used for making a 
 *                       USED WITH                function or a variable "class level".
 *                  1. Blocks                            
 *                  2. Variables               2) If a function or a variable is of 
 *                  3. Functions                  class level then we can access those by using the 
 *                  4. Class                      name of the class without creating an object.
 * 
 *                                              3) This is loaded within the method block of the 
 *                                                 memory area of the execution engine.
 * 
 *                                              4) A static method can be overloaded but not 
 *                                                 overridded
 *          
 *                                              5) Cannot be used in object level or 
 *                                                 instance functions
 *                                               
 *          2. final ------------------------> 1) this keyword can be used with a variable,function
 *                                                and class.
 * 
 *                                             2) variable --> if the value is given it cannot be
 *                                                             changed.
 *                                              
 *                                             3) function --> then that function cannot be 
 *                                                              overridden
 *                                              
 *                                             4) class --> cannot be inherited
 * 
 *          3. abstract ----------------------> 1) this keyword can be used with a function,class
 *                                              
 *                                              2) Abstact keyword is used in a function when
 *                                                 we dont define the body of the function.
 * 
 *                                              3) whenever we make a function abstarct the 
 *                                                 class also becomes abstarct.
 * 
 *                                              4) An abstract class cannot be directly used
 *                                              
 *                                              5) It can only be used if it is inherited 
 *                                                 and that child class class overrides the
 *                                                 abstract method.
 * 
 *           Is abstact method essential to make a class abstact ?
 *                  --> NO
 *          
 *          (NOT SO IMPORTANT)
 *          4. synchronized -------------------->    1) This keyword is used in multi-threading.
 *                                                      
 *                                                  2) This is only used with functions.
 * 
 *                                                  3) Some functions/methods in java are
 *                                                      not thread safe.
 * 
 *              Thread? ---> It is the smallest computation that is 
 *                            possible and cannot be divided furthur.
 *              
 *              Thread Safe ---> Mutiple threads can access the resource simultaineously
 *               
 *              Not Thread Safe --> Multiple threads cannot access a shared resourcse simultaineously.
 *              pimp --> line lagae --> synchronization
 * 
 *          5. volatile ---> ami jani na
*/

public class M03_NonAccessModifier {
    //object
    final int a =10;
    public static void main(String[] args) {
        M03_NonAccessModifier obj1 = new M03_NonAccessModifier();
        B obj2 = new B();
    }
}

abstract class A{
    abstract void yo();
}

class B extends A{
    void yo(){

    }
}

