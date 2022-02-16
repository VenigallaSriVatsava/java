package accessspecifiers.ClassA;

public class ParentClass {
    private String privateVariable;
    public String publicVariable;
    protected int protectedVariable;
    int packagePrivate;
    public static int iamStatic;

    public String getPrivateVariable() {
        return privateVariable;
    }

    public void setPrivateVariable(String privateVariable) {
        this.privateVariable = privateVariable;
    }

    public void name() {
        System.out.println("vatsav");
    }

    private void number() {
        System.out.println("6300099999");
    }

    void age() {
        System.out.println("21");
    }

    protected void dob() {
        System.out.println("17th february,2000");
    }

// TODO2 write different access specifiers methods for checking in both child class -- Done

    //    public India(int a) {
//
//        this.a = a;
//    }
//
//    public String getPrivateVariable() {
//        return privateVariable;
//    }
//
//    public void setPrivateVariable(String privateVariable) {
//        this.privateVariable = privateVariable;
//    }
//
//    public void primeMinister() {}  // it can be accessible anywhere even outside class
//
//    protected void rajyaSabhaMemberName(){} // it can be accessible within the package and also within subclasses
//
//    void lokSabha() {}  // it is of default type which can be accessed inside the package
//
//    private void president(){} // only accessible within the class
//


}
