// 
/*
    Java --> general purpose, high level, OOP , platform independent, staticly typed,
             programming language that is mostly used as a server side scripting language.
             
             General purpose --> Backend (Spring Boot), Front-End (AWT,Swing)
             High Level --> The code we write is in English which is then compiled and interpreted
                            to Machine level language.

            OOP ---> Because if follow all the four principles of OOP

                    ENCAPSULATION --> Binding of Data and giving security levels and layers of accessibility
                    (Access Specifier/Modifier)
                    
                    ABSTRACTION --> Hinding the uncessary details that are not relevant to the user.
                    (Abstract class/Method, Interface)

                    POLYMORPHISM (Poly[many] + Morph[forms]) --> A same thing may have to different functionalities.
                    (Overriding,Overloading) [Contructor/Method]
                    
                    INHERITANCE --> Reusing the properties of a class by another class. Promotes code reusibility
                    (extends(class),implement(interface))
            
            Platform Independent --> Why java is a platform independent language ?
                    --> Compile once run anywhere
                    --> BYTE CODE, JVM INSTALLED
            
            staticly typed
                    --> Every time you declaire a variable you have to mention its data type

                    Dynamically Type --> Python, JavaScript (Interpreted)
                    Staticly Type --> Java,C++,C#,TypeScript (Compiled/Hybrid)

                    Every thing is checked at runtime

        //Write everything within a class --> functions/methods, variables

        class ? --> BluePrint or a template upon which an object is made.
        Object ? --> Object is an instance/implementation of a class

        c++ --> 1ms (compiled) [OS,software that is very close to hardware,Game dev]
        java,C# --> 3ms (compiled + interpreted) (Server side Language/ Back End, Security is the priority)
        python --> 5ms (interpreted) [Lekha kom] (data processing, AI, ML,Analysis)
*/

public class M01_Basics{
    public static void main(String[] args) {
        Students st1 = new Students("Moida", 14, 4);
        Students st2 = new Students("Sandipan", 51, 56);
        st2.info();
    }
}

class Students{
    // object level variable
    // this --> is the referece/address of the object that is created
    String name;
    int roll;
    int standard;

    Students(String n,int roll,int stan){
        name = n;
        this.roll =roll;
        standard = stan;

    }
    void info(){
        System.out.println("Name :"+name);
        System.out.println("Roll :"+roll);
        System.out.println("Class: "+standard);
    }
}