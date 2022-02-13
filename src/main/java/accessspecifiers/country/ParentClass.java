package accessspecifiers.country;

public class ParentClass {
    private String privateVariable;
    public String publicVariable;
    protected  int protectedVariable;
    int packagePrivate;
public static int iamStatic;
    public String getPrivateVariable() {
        return privateVariable;
    }

    public void setPrivateVariable(String privateVariable) {
        this.privateVariable = privateVariable;
    }



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
