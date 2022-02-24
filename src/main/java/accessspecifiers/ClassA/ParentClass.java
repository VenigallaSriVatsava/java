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

    public void publicMethod() {

        System.out.println("vatsav");
    }

    private void privateMethod() {

        System.out.println("6300099999");
    }

    void defaultMethod() {
        System.out.println("21");
    }

    protected void protectedMethod() {
        System.out.println("17th february,2000");
    }

// TODO2 write different access specifiers methods for checking in both child class -- Done


}
