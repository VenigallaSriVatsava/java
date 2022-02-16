package Super;

public class Gmr extends College {

    /*
    The super keyword in Java is a reference variable which is used to refer immediate parent class object.
    we can invoke methods,variables and constructors.
     */


    String name = "GMRIT";
    int number;

    public void address() {
        String city = "chennai";
        String area = "beach road";
        System.out.println("address of " + name + " is " + city + "," + area);
    }

    public void details() {
        address();    // refers to address method of the present class i.e; Gmr class
        super.address();  // refers to address method of parent class means college class
    }

    public static void main(String[] args) {
        Gmr obj = new Gmr();
        obj.details(); // refers to details method

    }
}
// TODO1 change it to is-a relationship - Done

