package accessspecifiers.ClassA;

public class ChildClass extends ParentClass {

    public static void main(String[] args) {
        ParentClass.iamStatic = 7;

        ParentClass obj = new ParentClass();
        obj.protectedVariable = 7;
        obj.packagePrivate = 8;

        obj.publicVariable = "hello";
        obj.setPrivateVariable("oops");
        System.out.println("i can access protected variable " + obj.protectedVariable);
        System.out.println("i can access private variable through getter and setter " + obj.getPrivateVariable());

        obj.publicMethod(); // public method in parent class which can be accessed by any class
        obj.defaultMethod();  // default method in parent class which is package private,it means it can be accessed within same package files
        obj.protectedMethod();  // protected method in parent class which can be accessed by child class objects
    }
}
