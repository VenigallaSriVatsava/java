package accessspecifiers.states;

import accessspecifiers.country.ParentClass;

public class ChildClass extends ParentClass {

    public static void main(String[] args) {

        ChildClass obj = new ChildClass();
        obj.protectedVariable = 7;
        System.out.println("i can access protected variable " + obj.protectedVariable);
    }
}
