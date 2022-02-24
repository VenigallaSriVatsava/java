package accessspecifiers.ClassB;

import accessspecifiers.ClassA.ParentClass;

public class ChildClass extends ParentClass {

    public static void main(String[] args) {

        ChildClass obj = new ChildClass();
        obj.protectedVariable = 7;
        System.out.println("i can access protected variable " + obj.protectedVariable);

        obj.publicMethod();  // public method in parent class which can be accessed by any class
        obj.protectedMethod();   // protected method in parent class which can be accessed by subclasses of parent class
    }
}
// TODO2 check access for public variable, and protected and public methods -- Done