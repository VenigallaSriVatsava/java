package Super;
/*
The super keyword in Java is a reference variable which is used to refer immediate parent class object.
we can invoke methods,variables and constructors.
 */
public class Student extends College {

    String name = "vatsav";
    int id;
    int number;

    public void address(){
       String city = "chennai";
       String area = "beach road";
        System.out.println("address of " +name +" is " +city +"," +area);
    }

    public void details(){
        address();    // refers to address method of student class
        super.address();  // refers to address method of parent class means college class
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.details(); // refers to details method

    }
}
