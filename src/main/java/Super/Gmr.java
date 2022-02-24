package Super;

public class Gmr implements College {

    /*
    The super keyword in Java is a reference variable which is used to refer immediate parent class object.
    we can invoke methods,variables and constructors.
     */


    static String name = "GMRIT";

    @Override
    public void address() {
        String city = "chennai";
        String area = "beach road";
        System.out.println("address of " + name + " is " + city + "," + area);
    }

    public void details() {
        address();    // refers to address method of the present class i.e; Gmr class
        //super.address();  // refers to address method of parent class means college class
    }

    public static void main(String[] args) {
        Gmr obj = new Gmr();
        obj.details(); // refers to details method

    }


}
// TODO super example

