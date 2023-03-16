/*
 *      Access Specifiers (scream Encapsulation)
 *                                Inside Class           Inside Same Directory          Outside Directory but           Outside Directory 
 *                                                                                         within a subclass
 *          1. public                   YES                     YES                             YES                             YES
 *          2. protected                YES                     YES                             YES                             NO
 *          3. default                  YES                     YES                             NO                              NO
 *          4. private                  YES                     NO                              NO                              NO
 * 
 *          public ---> if there are multiple main functions/methods the main method with you you want to start executing your code
 *                      has to be made public.
 * 
 *                 ---> There can only be one public class with a file.
*/


class M04_AccessSpecifier {
    
    public static void main(String[] args) {
        Students objx = new Students("Arpan",20,30);
        objx.info();

    }

}
